package org.sample.mavensample;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void listBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " - " + book.describe() + (book.isCheckedOut ? " (Checked Out)" : ""));
        }
    }

    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member.name + " - " + member.describe());
        }
    }

    public void listStaff() {
        System.out.println("Library Staff:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember.name + " - " + staffMember.describe());
        }
    }

    // Getter methods to allow access in tests
    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Staff> getStaff() {
        return staff;
    }
}
