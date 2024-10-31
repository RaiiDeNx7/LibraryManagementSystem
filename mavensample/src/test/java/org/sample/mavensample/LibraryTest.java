package org.sample.mavensample;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LibraryTest extends TestCase {
    private Library library;
    private ByteArrayOutputStream outputStream;

    @Override
    protected void setUp() throws Exception {
        library = new Library();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirect System.out to outputStream
    }

    private String getNormalizedOutput() {
        return outputStream.toString().replace("\r\n", "\n").trim();
    }

    public void testAddBook() {
        Book book = new Fiction("1984", "George Orwell", "978-0451524935");
        library.addBook(book);
        
        // Verify that the book is added to the library
        assertEquals(1, library.getBooks().size());
        assertEquals(book, library.getBooks().get(0));
    }

    public void testRegisterMember() {
        Member member = new Member("Bob", "M001");
        library.registerMember(member);
        
        // Verify that the member is registered
        assertEquals(1, library.getMembers().size());
        assertEquals(member, library.getMembers().get(0));
    }

    public void testAddStaff() {
        Staff staffMember = new Staff("Alice", "S001");
        library.addStaff(staffMember);
        
        // Verify that the staff member is added
        assertEquals(1, library.getStaff().size());
        assertEquals(staffMember, library.getStaff().get(0));
    }

    public void testListBooks() {
        Book fictionBook = new Fiction("1984", "George Orwell", "978-0451524935");
        Book nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", "978-0062316097");
        
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);
        
        // Check out the fiction book to cover the "checked out" path
        fictionBook.checkOut();
        
        library.listBooks();

        String expectedOutput = "Books in the Library:\n"
                + "1984 by George Orwell - Fiction (Checked Out)\n"
                + "Sapiens by Yuval Noah Harari - NonFiction";

        assertEquals(expectedOutput, getNormalizedOutput());
    }


    public void testListMembers() {
        Member member = new Member("Bob", "M001");
        library.registerMember(member);
        
        library.listMembers();

        String expectedOutput = "Library Members:\n"
                + "Bob - Member";

        assertEquals(expectedOutput, getNormalizedOutput());
    }

    public void testListStaff() {
        Staff staff = new Staff("Alice", "S001");
        library.addStaff(staff);

        library.listStaff();

        String expectedOutput = "Library Staff:\n"
                + "Alice - Staff";

        assertEquals(expectedOutput, getNormalizedOutput());
    }

    @Override
    protected void tearDown() throws Exception {
        System.setOut(System.out); // Reset the output stream to its original state
        outputStream.close();
        library = null;
        outputStream = null;
    }
}


