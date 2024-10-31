package org.sample.mavensample;

import junit.framework.TestCase;

public class FictionTest extends TestCase {
    private Fiction fictionBook;

    protected void setUp() throws Exception {
        fictionBook = new Fiction("1984", "George Orwell", "978-0451524935");
    }

    public void testFictionConstructor() {
        assertEquals("Title should be '1984'", "1984", fictionBook.title);
        assertEquals("Author should be 'George Orwell'", "George Orwell", fictionBook.author);
        assertEquals("ISBN should be '978-0451524935'", "978-0451524935", fictionBook.ISBN);
        assertFalse("Book should not be checked out initially", fictionBook.isCheckedOut);
    }

    public void testDescribe() {
        assertEquals("describe() should return 'Fiction'", "Fiction", fictionBook.describe());
    }

    public void testCheckOut() {
        fictionBook.checkOut();
        assertTrue("Book should be checked out after checkOut() is called", fictionBook.isCheckedOut);
    }

    public void testReturnBook() {
        fictionBook.checkOut(); // First, check it out
        fictionBook.returnBook(); // Then, return it
        assertFalse("Book should not be checked out after returnBook() is called", fictionBook.isCheckedOut);
    }

    protected void tearDown() throws Exception {
        fictionBook = null;
    }
}
