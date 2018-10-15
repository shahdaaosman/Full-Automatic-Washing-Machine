package edu.bu.met.cs665.Component;

import edu.bu.met.cs665.mediator.WasherColleague;
import edu.bu.met.cs665.mediator.Mediator;

/**
 * This class represents a Timer
 * 
 * @author Sahad Osman
 *
 */
public class Timer implements WasherColleague {

	protected Mediator mediator;

	/**
	 * This method set the Mediator So the class can communicate with it
	 * 
	 */
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}
	/**
	 * This method start the timer
	 */
	public void start() {
		//Staring the time should have a real time implementation
		System.out.println("Timer Start ......");
		
	}
	
	//some method to give the accurate time for each load level

}
