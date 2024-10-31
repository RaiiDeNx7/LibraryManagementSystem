package org.sample.mavensample;

//Concrete NonFiction class, derived from Book
class NonFiction extends Book {
	
/**
* Default NonFiction constructor.
* Description:  Initializes a new instance of the NonFiction class by calling the constructor of the superclass (Book) with the specified title, author, and ISBN.
* @param title (String): The title of the book.
* @param author (String): The author of the book.
* @param ISBN (String): The International Standard Book Numbers of the book.
*/
 public NonFiction(String title, String author, String ISBN) {
     super(title, author, ISBN);
 }

/**
* Description:  Provides a description of the fiction book by returning a string indicating that the book is a work of NonFiction. This method overrides the abstract describe() method defined in the Book class.
* @return (String): "NonFiction" which indicates the book genre
*/
 @Override
 public String describe() {
     return "NonFiction";
 }
}