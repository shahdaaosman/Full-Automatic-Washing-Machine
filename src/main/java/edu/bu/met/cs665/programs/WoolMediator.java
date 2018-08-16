package edu.bu.met.cs665.programs;


import edu.bu.met.cs665.Component.Agitator;
import edu.bu.met.cs665.Component.ColdWaterValve;
import edu.bu.met.cs665.Component.DrainValve;
import edu.bu.met.cs665.Component.Drum;
import edu.bu.met.cs665.Component.HotWaterValve;
import edu.bu.met.cs665.Component.LevelSensor;
import edu.bu.met.cs665.Component.Lock;
import edu.bu.met.cs665.Component.Motor;
import edu.bu.met.cs665.Component.Timer;
import edu.bu.met.cs665.button.PauseButton;
import edu.bu.met.cs665.button.StartButton;
import edu.bu.met.cs665.laundryCare.Detergent;
import edu.bu.met.cs665.mediator.Mediator;
import edu.bu.met.cs665.mediator.WasherController;

public class WoolMediator implements Mediator{

	public WoolMediator(WasherController washer, ColdWaterValve coldWaterValve, HotWaterValve hotWaterValve, LevelSensor levelSensor,
			Motor motor, Drum drum, Agitator agitator, Timer timer, StartButton startButton, PauseButton pauseButton,
			DrainValve drainValve, Lock lock, Detergent detergent) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkWaterLevel(int level) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkTemperature(int temp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTimer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rinse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spin() {
		// TODO Auto-generated method stub
		
	}


}
