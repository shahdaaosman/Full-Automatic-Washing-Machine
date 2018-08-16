package edu.bu.met.cs665.mediator;

import edu.bu.met.cs665.Component.Agitator;
import edu.bu.met.cs665.Component.ColdWaterValve;
import edu.bu.met.cs665.Component.DrainValve;
import edu.bu.met.cs665.Component.HotWaterValve;
import edu.bu.met.cs665.Component.LevelSensor;
import edu.bu.met.cs665.Component.Lock;
import edu.bu.met.cs665.Component.Motor;
import edu.bu.met.cs665.Component.Timer;
import edu.bu.met.cs665.button.PauseButton;
import edu.bu.met.cs665.button.StartButton;

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
		WasherMediator mediator = null;
		Agitator agitator = new Agitator();
		ColdWaterValve coldWaterValve = new ColdWaterValve();
		HotWaterValve hotWaterValve = new HotWaterValve();
		LevelSensor levelSensor = new LevelSensor();
		Motor motor = new Motor ();
		Timer timer = new Timer();
		StartButton startButton = new StartButton();
		PauseButton pauseButton = new PauseButton();
		DrainValve drainValve = new DrainValve();
		Lock lock = new Lock ();
		
	}


	
}
