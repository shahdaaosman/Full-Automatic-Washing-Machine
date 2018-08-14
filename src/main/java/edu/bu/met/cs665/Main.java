package edu.bu.met.cs665;

import edu.bu.met.cs665.entity.LaundrySystem;

public class Main {


  /**
   * A main method to run examples.
   * 
   * @param args not used
   */
  public static void main(String[] args) {

	//Create a single game object
	  LaundrySystem laundrySystem = LaundrySystem.getInstance();
	  laundrySystem.start();
  }
}
