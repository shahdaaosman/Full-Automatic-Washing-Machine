package edu.bu.met.cs665;

import edu.bu.met.cs665.mediator.Washer;

public class Main {


  /**
   * A main method to run examples.
   * 
   * @param args not used
   */
  public static void main(String[] args) {

	//Create a single Machine object
	  Washer automaticWasher = Washer.getInstance();
	  automaticWasher.initComponent();
	  
  }
}
