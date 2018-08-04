package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
  public static void main(String[] args) {

    Person student = new Person("John", "Doe");

    System.out.println(student.getFirstName());
  }

}
