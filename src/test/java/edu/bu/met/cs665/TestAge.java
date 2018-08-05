package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.bu.met.cs665.example1.Person;

// Write some Unit tests for your program like the following.

public class TestAge {

  public TestAge() {}

  @Test
  public void testGetFirstName() {

    Person student = new Person("John", "Doe");
    assertEquals(student.getFirstName(), "John");

  }


  @Test
  public void testSetFirstName() {
    Person student = new Person("John", "Doe");
    student.setFirstName("Bob");
    // age one year after is one
    assertEquals(student.getFirstName(), "Bob");
  }


  @Test
  public void testGetLastName() {

    Person student = new Person("John", "Doe");
    assertEquals(student.getLastName(), "Doe");

  }



  @Test
  public void testSetLastName() {

    Person student = new Person("John", "Doe");
    student.setLastName("Henrink");

    assertEquals(student.getLastName(), "Henrink");

  }


  @Test
  public void testPerson() {

    Person student = new Person("John", "Doe");
    assertEquals(student.getFirstName(), "John");
    assertEquals(student.getLastName(), "Doe");
  }


  @Test
  public void testMain() {
      Main m = new Main();
      String [] args = { "one", "two", "three" };
      Main.main(args);
  }


}
