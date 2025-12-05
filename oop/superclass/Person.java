package oop.superclass;

public class Person {
      String firstName;
      String lastName;
      int age;

     Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void display(){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
    }
}
