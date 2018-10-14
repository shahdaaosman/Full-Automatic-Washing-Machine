package edu.bu.met.cs665.mediator;

/**
 *  This is an interface for Full Automatic washing machine programs
 *  build the Mediator pattern
 * 
 * @author Sahad Osman
 *
 */
public interface Mediator {

	public void start();
	public void pause();
	public void setTimer();
	public void wash();
	public void rinse(int level);
	public void spin();
	public void openWater();
	public void closeWater();
	public void lockOff();
	public void hotWater();
	public void coldWater();



	
}
