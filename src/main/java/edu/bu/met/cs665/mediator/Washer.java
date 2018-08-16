package edu.bu.met.cs665.mediator;

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
import edu.bu.met.cs665.programs.CottonsMediator;
import edu.bu.met.cs665.programs.MixedLoadMediator;
import edu.bu.met.cs665.programs.RinsMediator;
import edu.bu.met.cs665.programs.SilkMediator;
import edu.bu.met.cs665.programs.WoolMediator;

public class Washer{

	/**
	 * build the singleton pattern
	 */
	private Washer () {
		
	}
	
    /**
     * 
     * this class represent the Singleton holder
     *
     */
    private static class SingletonHolder {
        private static final Washer INSTANCE = new Washer();
    }

	/**
	 * this return the Washer object
	 * @return
	 */
	public static Washer getInstance() {
		 return SingletonHolder.INSTANCE;
	}

	public void initComponent() {
		Mediator mediator = null;
		WasherController washer = new WasherController();
		Agitator agitator = new Agitator();
		ColdWaterValve coldWaterValve = new ColdWaterValve();
		HotWaterValve hotWaterValve = new HotWaterValve();
		LevelSensor levelSensor = new LevelSensor();
		Motor motor = new Motor ();
		Drum Drum = new Drum();
		Timer timer = new Timer();
		StartButton startButton = new StartButton();
		PauseButton pauseButton = new PauseButton();
		DrainValve drainValve = new DrainValve();
		Lock lock = new Lock ();
		Detergent detergent = new Detergent ();
		
		mediator = new CottonsMediator (washer,coldWaterValve,hotWaterValve,levelSensor,motor
				,Drum,agitator,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, coldWaterValve, hotWaterValve, levelSensor, motor,
				agitator, Drum, timer, startButton,pauseButton, drainValve, lock, detergent);
		
		mediator = new MixedLoadMediator (washer,coldWaterValve,hotWaterValve,levelSensor,motor
				,Drum,agitator, timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, coldWaterValve, hotWaterValve, levelSensor, motor,
				agitator, Drum, timer, startButton,pauseButton, drainValve, lock, detergent);
		
		mediator = new RinsMediator (washer,coldWaterValve,hotWaterValve,levelSensor,motor
				,Drum,agitator,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, coldWaterValve, hotWaterValve, levelSensor, motor,
				agitator, Drum, timer, startButton,pauseButton, drainValve, lock, detergent);
		
		mediator = new SilkMediator (washer,coldWaterValve,hotWaterValve,levelSensor,motor
				,Drum,agitator,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, coldWaterValve, hotWaterValve, levelSensor, motor,
				agitator, Drum, timer, startButton,pauseButton, drainValve, lock, detergent);
		
		mediator = new WoolMediator (washer,coldWaterValve,hotWaterValve,levelSensor,motor
				,Drum,agitator,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, coldWaterValve, hotWaterValve, levelSensor, motor,
				agitator, Drum, timer, startButton,pauseButton, drainValve, lock, detergent);
		
		
		
	}

	private void setProgramMediator(Mediator mediator,WasherController washer,ColdWaterValve coldWaterValve, HotWaterValve hotWaterValve,
			LevelSensor levelSensor, Motor motor,Agitator agitator, Drum Drum, Timer timer, StartButton startButton,
			PauseButton pauseButton, DrainValve drainValve, Lock lock, Detergent detergent) {
		
		washer.setMediator(mediator);
		startButton.setMediator(mediator);
		coldWaterValve.setMediator(mediator);
		hotWaterValve.setMediator(mediator);
		levelSensor.setMediator(mediator);
		agitator.setMediator(mediator);
		motor.setMediator(mediator);
		Drum.setMediator(mediator);
		timer.setMediator(mediator);
		startButton.setMediator(mediator);
		pauseButton.setMediator(mediator);
		drainValve.setMediator(mediator);
		lock.setMediator(mediator);
		detergent.setMediator(mediator);
	}


	
}
