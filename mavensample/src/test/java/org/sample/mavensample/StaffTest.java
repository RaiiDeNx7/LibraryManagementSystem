package org.sample.mavensample;

import junit.framework.TestCase;

public class StaffTest extends TestCase {
    private Staff staff;
    private Library library;
    private Member member;
    private Fiction book;

    protected void setUp() throws Exception {
        staff = new Staff("Alice", "S001");
        library = new Library();
        member = new Member("Bob", "M001");
        book = new Fiction("1984", "George Orwell", "978-0451524935");
    }

    public void testStaffConstructor() {
        assertEquals("Name should be 'Alice'", "Alice", staff.name);
        assertEquals("ID should be 'S001'", "S001", staff.id);
    }

    public void testDescribe() {
        assertEquals("describe() should return 'Staff'", "Staff", staff.describe());
    }

    public void testRegisterMember() {
        staff.registerMember(library, member);
        assertEquals("Library should have 1 member registered", 1, library.getMembers().size());
        assertEquals("The registered member should be 'Bob'", member, library.getMembers().get(0));
    }

    public void testRegisterBook() {
        staff.registerBook(library, book);
        assertEquals("Library should have 1 book added", 1, library.getBooks().size());
        assertEquals("The registered book should be '1984'", book, library.getBooks().get(0));
    }

    protected void tearDown() throws Exception {
        staff = null;
        library = null;
        member = null;
        book = null;
    }
}
