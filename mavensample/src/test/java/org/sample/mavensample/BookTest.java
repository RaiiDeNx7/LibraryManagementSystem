package org.sample.mavensample;

import junit.framework.TestCase;

public class BookTest extends TestCase {

    private Fiction book; // Use Fiction as a concrete class derived from Book

    @Override
    protected void setUp() throws Exception {
        book = new Fiction("1984", "George Orwell", "978-0451524935");
    }

    public void testCheckOut() {
        // Verify the initial state of isCheckedOut
        assertFalse(book.isCheckedOut);

        // Call checkOut() and verify the change
        book.checkOut();
        assertTrue(book.isCheckedOut);
    }

    public void testReturnBook() {
        // Set the book as checked out first
        book.checkOut();
        assertTrue(book.isCheckedOut); // Ensure checkOut() worked

        // Call returnBook() and verify the change
        book.returnBook();
        assertFalse(book.isCheckedOut);
    }

    @Override
    protected void tearDown() throws Exception {
        book = null;
    }
}
