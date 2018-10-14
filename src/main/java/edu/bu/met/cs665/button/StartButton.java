package edu.bu.met.cs665.button;

import edu.bu.met.cs665.mediator.WasherColleague;
import edu.bu.met.cs665.mediator.Mediator;

/**
 * This class represents Start Button
 * 
 * @author Sahad Osman
 *
 */
public class StartButton implements WasherColleague {

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
	 * This method check if Start button is presses
	 */
	public void press(){
		System.out.println("-- Start Button pressed -- ");
		mediator.start();
	}
}
