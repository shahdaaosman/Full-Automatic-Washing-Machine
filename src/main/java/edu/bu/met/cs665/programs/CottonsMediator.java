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

public class CottonsMediator implements Mediator{
	
	protected final WasherController washer;
	protected final ColdWaterValve coldWaterValve;
	protected final HotWaterValve hotWaterValve;
	protected final LevelSensor levelSensor;
	protected final Motor motor;
	protected final Drum drum;
	protected final Agitator agitator;
	protected final Timer timer;
	protected final StartButton startButton;
	protected final PauseButton pauseButton;
	protected final DrainValve drainValve;
	protected final Lock lock;
	protected final Detergent detergent;

	
	public CottonsMediator(WasherController washer, ColdWaterValve coldWaterValve,
			HotWaterValve hotWaterValve, LevelSensor levelSensor,
			Motor motor, Drum drum, Agitator agitator, Timer timer,
			StartButton startButton, PauseButton pauseButton,
			DrainValve drainValve, Lock lock, Detergent detergent) {
		this.washer =washer ;
		this.coldWaterValve = coldWaterValve;
		this.hotWaterValve = hotWaterValve;
		this.levelSensor = levelSensor;
		this.motor = motor;
		this.drum = drum;
		this.agitator = agitator;
		this.timer = timer;
		this.startButton = startButton ;
		this.pauseButton = pauseButton ;
		this.drainValve = drainValve;
		this.lock = lock;
		this.detergent = detergent ;
		
	}



	@Override
	public void start() {
		washer.start();
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public boolean checkWaterLevel(int level) {
		
		
		return false;
	}

	@Override
	public boolean checkTemperature(int temp) {
		
		return false;
	}

	@Override
	public void setTimer() {
		
		
	}

	@Override
	public void wash() {
		checkWaterLevel(1);
		motor.startMotor();
		motor.rotateDrum(700);
		System.out.println("Adding detergent");
		
		System.out.println("Adding softener");
	}

	@Override
	public void rinse() {
		motor.startMotor();
		motor.rotateDrum(700);
		System.out.println("Adding detergent");
		soilRemoval.low();
		System.out.println("Adding softener");
		
	}

	@Override
	public void spin() {
		
		motor.startMotor();
		motor.rotateDrum(700);
		System.out.println("Adding detergent");
		soilRemoval.low();
		System.out.println("Adding softener");
	}



}
