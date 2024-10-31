package org.sample.mavensample;

//Abstract Book class
abstract class Book {
 protected String title;
 protected String author;
 protected String ISBN;
 protected boolean isCheckedOut;
 
/**
* Default cube constructor.
* Description: Initializes a new instance of the Book class with the specified title, author, and ISBN. Sets the isCheckedOut status to false by default.
* @param title (String): The title of the book.
* @param author (String): The author of the book.
* @param ISBN (String): The International Standard Book Numbers of the book.
*/
 public Book(String title, String author, String ISBN) {
     this.title = title;
     this.author = author;
     this.ISBN = ISBN;
     this.isCheckedOut = false;
 }

 /**
 * Description: Marks the book as checked out by setting the isCheckedOut attribute to true.
 */
 public void checkOut() {
     isCheckedOut = true;
 }

/**
* Description: Marks the book as checked out by setting the isCheckedOut attribute to false.
*/
 public void returnBook() {
     isCheckedOut = false;
 }

 /**
 * Description: An abstract method that must be implemented by subclasses. It is intended to provide a description of the book, typically including details such as title, author, and ISBN.
 * @return (String): Description of the book
 */
 public abstract String describe();
}