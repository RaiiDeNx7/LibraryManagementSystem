package org.sample.mavensample;

//Concrete Staff class, derived from Person
class Staff extends Person {

/**
* Default Staff constructor.
* Description: Initializes a new instance of the Staff class by calling the constructor of the superclass (Person) with the specified name and ID.
* @param name (String) The name of the person.
* @param id (String) The identifier of the person.
*/
 public Staff(String name, String id) {
     super(name, id);
 }

 /**
 * Description:  Registers a new member in the specified library by calling the library's registerMember() method.
 * @param library (Library): The library where the member will be registered.
 * @param member (String): The member to be registered.
 */
 public void registerMember(Library library, Member member) {
     library.registerMember(member);
 }

 /**
  * Description:  Registers a new book in the specified library by calling the library's registerBook() method.
  * @param library (Library): The library where the book will be registered.
  * @param member (String): The book to be registered.
  */
 public void registerBook(Library library, Book book) {
     library.addBook(book);
 }

 /**
  * Description:  Provides a description of the member by returning a string indicating that the individual is a staff. This method overrides the abstract describe() method defined in the Person class.
  * @return (String): "Staff" which indicates their role.
  */
 @Override
 public String describe() {
     return "Staff";
 }
}
