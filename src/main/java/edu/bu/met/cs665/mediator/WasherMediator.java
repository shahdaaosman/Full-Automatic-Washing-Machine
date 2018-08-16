package edu.bu.met.cs665.mediator;

public interface WasherMediator {

	public void start();
	public void pause();
	public boolean checkWaterLevel(int level);
	public boolean checkTemperature(int temp);
	public void setTimer();
	public void wash();
	public void rain();
	public void spin();

	
}
