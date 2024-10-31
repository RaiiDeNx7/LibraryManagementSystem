package org.sample.mavensample;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    /**
    * Default Library constructor.
    * Description: Initializes a new instance of the Library class by creating empty lists for books, members, and staff.
    */
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }
    
    /**
     * Description: Initializes a new instance of the Library class by creating empty lists for books, members, and staff.
     * @param book (Book): The book to be added to the library.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Description: Registers a specified member in the library's member list.
     * @param member (Member): The member to be registered in the library.
     */
    public void registerMember(Member member) {
        members.add(member);
    }

    /**
     * Description: Adds a specified staff member to the library's staff list.
     * @param staffMember (Staff): The staff member to be added to the library.
     */
    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    /**
     * Description: Prints the list of books in the library, along with their authors and status (checked out or not).
     */
    public void listBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " - " + book.describe() + (book.isCheckedOut ? " (Checked Out)" : ""));
        }
    }

    /**
     * Description: Prints the list of members in the library along with their descriptions.
     */
    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member.name + " - " + member.describe());
        }
    }

    /**
     * Description: Prints the list of staff in the library along with their descriptions.
     */
    public void listStaff() {
        System.out.println("Library Staff:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember.name + " - " + staffMember.describe());
        }
    }

    /**
     * Description: Returns the list of books in the library. This method is useful for accessing the book collection, especially in tests.
     * @return List<Book>: A list containing all the books in the library.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Description: Returns the list of members registered in the library. This method is useful for accessing the member collection, especially in tests.
     * @return List<Member>: A list containing all the members of the library.
     */
    public List<Member> getMembers() {
        return members;
    }

    /**
     * Description: Returns the list of staff members in the library. This method is useful for accessing the staff collection, especially in tests.
     * @return List<Staff>: A list containing all the staff members of the library.
     */
    public List<Staff> getStaff() {
        return staff;
    }
}
