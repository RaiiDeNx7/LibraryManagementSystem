package org.sample.mavensample;

//Concrete Member class, derived from Person
class Member extends Person {
	
/**
* Default Member constructor.
* Description: Initializes a new instance of the Member class by calling the constructor of the superclass (Person) with the specified name and ID.
* @param name (String): The name of the person.
* @param id (String): The identifier of the person.
*/
 public Member(String name, String id) {
     super(name, id);
 }

 /**
 * Description:  Provides a description of the member by returning a string indicating that the individual is a member. This method overrides the abstract describe() method defined in the Person class.
 * @return (String): "Member" which indicates their role.
 */
 @Override
 public String describe() {
     return "Member";
 }
}