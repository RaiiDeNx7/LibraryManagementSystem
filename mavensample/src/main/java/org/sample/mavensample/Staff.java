package org.sample.mavensample;

//Concrete Staff class, derived from Person
class Staff extends Person {
	
 public Staff(String name, String id) {
     super(name, id);
 }

 public void registerMember(Library library, Member member) {
     library.registerMember(member);
 }

 public void registerBook(Library library, Book book) {
     library.addBook(book);
 }

 @Override
 public String describe() {
     return "Staff";
 }
}
