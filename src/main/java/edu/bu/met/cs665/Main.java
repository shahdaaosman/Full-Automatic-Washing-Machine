package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

public class Main {

  /**
   * A main method to run examples.
   * 
   * @param args not used
   */
  public static void main(String[] args) {
    Main m = new Main();
    System.out.println(m.doIt());

  }



  private String doIt() {
    Person student = new Person("John", "Doe");

    // a temporary variable to store the lastname,firstname.  
    String s = student.getLastName() + ',' + student.getLastName();
    return s;
  }

}
