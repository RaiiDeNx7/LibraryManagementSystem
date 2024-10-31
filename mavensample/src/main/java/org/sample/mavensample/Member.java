package org.sample.mavensample;

//Concrete Member class, derived from Person
class Member extends Person {
	
 public Member(String name, String id) {
     super(name, id);
 }

 @Override
 public String describe() {
     return "Member";
 }
}