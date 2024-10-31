package org.sample.mavensample;

//Abstract Person class
abstract class Person {
 protected String name;
 protected String id;

 /**
 * Default Person constructor.
 * Description:  Initializes a new instance of the Person class with the specified name and ID.
 * @param name (String): The name of the person.
 * @param id (String): The identifier of the person.
 */
 public Person(String name, String id) {
     this.name = name;
     this.id = id;
 }

 /**
  * Description:  An abstract method that must be implemented by subclasses. It is intended to provide a description of the person, typically including details such as name and ID.
  * @return (String): A description of the person.
  */
 public abstract String describe();
}