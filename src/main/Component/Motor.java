package edu.bu.met.cs665.Component;

import edu.bu.met.cs665.mediator.WasherColleague;
import edu.bu.met.cs665.mediator.Mediator;

/**
 * This class represents Pause Motor to rotate a drum
 * 
 * @author Sahad Osman
 *
 */
public class Motor implements WasherColleague{

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
	 * This method Start the motor
	 */
	public void startMotor(){
		mediator.lockOff();
		System.out.println("motor start ()()()()()() ");
	}

	/**
	 * This method specify the drum rotate in rpm
	 */
	public void rotateDrum(int rpm){
		System.out.println("Rotating drum at "+rpm+" rpm.");
	}
	
	/**
	 * This method Stop the motor
	 */
	public void stopMotor(){
		System.out.println("motor stop");
	}
	
}
