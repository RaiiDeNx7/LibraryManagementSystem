package org.sample.mavensample;

//Concrete Fiction class, derived from Book
class Fiction extends Book {
	
/**
* Default Fiction constructor.
* Description:  Initializes a new instance of the Fiction class by calling the constructor of the superclass (Book) with the specified title, author, and ISBN.
* @param title (String): The title of the book.
* @param author (String): The author of the book.
* @param ISBN (String): The International Standard Book Numbers of the book.
*/
 public Fiction(String title, String author, String ISBN) {
     super(title, author, ISBN);
 }

 /**
 * Description:  Provides a description of the fiction book by returning a string indicating that the book is a work of fiction. This method overrides the abstract describe() method defined in the Book class.
 * @return (String): "Fiction" which indicates the book genre
 */
 @Override
 public String describe() {
     return "Fiction";
 }
}