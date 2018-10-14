package edu.bu.met.cs665.Component;

import edu.bu.met.cs665.mediator.Mediator;
import edu.bu.met.cs665.mediator.WasherColleague;

/**
 * This class represents Temperature Sensor
 * 
 * @author Sahad Osman
 *
 */
public class TemperatureSensor implements WasherColleague {


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
	 * This method check Temperature and close or open valve as the result
	 * @param temp
	 * @return
	 */
	public boolean checkTemperature(int temp) {
	
		int currentTemperature = temp;
		while(currentTemperature != temp) {
			if(currentTemperature < temp) {
			mediator.hotWater();
		} else if (currentTemperature > temp) {
			mediator.coldWater();
		}}
		return true;
	}


}
