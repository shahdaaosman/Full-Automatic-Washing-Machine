package edu.bu.met.cs665.Component;

import edu.bu.met.cs665.mediator.WasherColleague;

import java.util.Random;

import edu.bu.met.cs665.mediator.Mediator;

/**
 * This class represents load Level Sensor 
 * 
 * @author Sahad Osman
 *
 */
public class LevelSensor implements WasherColleague {

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
	 * This method get level when the load is in
	 * @return
	 */
	public int getlevel() {
		Random random = new Random();
		int level= random.nextInt(3);
		return level+1;
	}
	
	/**
	 * This method check Water Level until it full
	 * @param level
	 * @return
	 */
	public boolean checkWaterLevel(int level) {
		mediator.openWater();	
		System.out.println("Water is filled until level "+level +" ;;;;;;;");
		mediator.closeWater();
		return true;
	}

}
