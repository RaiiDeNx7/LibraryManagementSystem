package org.sample.mavensample;

//Abstract Book class
abstract class Book {
 protected String title;
 protected String author;
 protected String ISBN;
 protected boolean isCheckedOut;

 public Book(String title, String author, String ISBN) {
     this.title = title;
     this.author = author;
     this.ISBN = ISBN;
     this.isCheckedOut = false;
 }

 public void checkOut() {
     isCheckedOut = true;
 }

 public void returnBook() {
     isCheckedOut = false;
 }

 public abstract String describe();
}