package org.sample.mavensample;

//Concrete Fiction class, derived from Book
class Fiction extends Book {
	
 public Fiction(String title, String author, String ISBN) {
     super(title, author, ISBN);
 }

 @Override
 public String describe() {
     return "Fiction";
 }
}