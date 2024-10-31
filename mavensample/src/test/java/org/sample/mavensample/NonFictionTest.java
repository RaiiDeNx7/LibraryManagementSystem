package org.sample.mavensample;

import junit.framework.TestCase;

public class NonFictionTest extends TestCase {
    private NonFiction nonFictionBook;

    protected void setUp() throws Exception {
        nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", "978-0062316097");
    }

    public void testNonFictionConstructor() {
        assertEquals("Title should be 'Sapiens'", "Sapiens", nonFictionBook.title);
        assertEquals("Author should be 'Yuval Noah Harari'", "Yuval Noah Harari", nonFictionBook.author);
        assertEquals("ISBN should be '978-0062316097'", "978-0062316097", nonFictionBook.ISBN);
        assertFalse("Book should not be checked out initially", nonFictionBook.isCheckedOut);
    }

    public void testDescribe() {
        assertEquals("describe() should return 'NonFiction'", "NonFiction", nonFictionBook.describe());
    }

    public void testCheckOut() {
        nonFictionBook.checkOut();
        assertTrue("Book should be checked out after checkOut() is called", nonFictionBook.isCheckedOut);
    }

    public void testReturnBook() {
        nonFictionBook.checkOut(); // First, check it out
        nonFictionBook.returnBook(); // Then, return it
        assertFalse("Book should not be checked out after returnBook() is called", nonFictionBook.isCheckedOut);
    }

    protected void tearDown() throws Exception {
        nonFictionBook = null;
    }
}