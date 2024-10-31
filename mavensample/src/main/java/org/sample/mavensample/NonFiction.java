package org.sample.mavensample;

//Concrete NonFiction class, derived from Book
class NonFiction extends Book {
 public NonFiction(String title, String author, String ISBN) {
     super(title, author, ISBN);
 }

 @Override
 public String describe() {
     return "NonFiction";
 }
}