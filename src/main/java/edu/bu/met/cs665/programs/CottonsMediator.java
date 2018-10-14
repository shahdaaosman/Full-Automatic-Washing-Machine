package edu.bu.met.cs665.programs;

import edu.bu.met.cs665.Component.ColdWaterValve;
import edu.bu.met.cs665.Component.DrainValve;
import edu.bu.met.cs665.Component.HotWaterValve;
import edu.bu.met.cs665.Component.LevelSensor;
import edu.bu.met.cs665.Component.Lock;
import edu.bu.met.cs665.Component.Motor;
import edu.bu.met.cs665.Component.Timer;
import edu.bu.met.cs665.Component.TemperatureSensor;
import edu.bu.met.cs665.button.PauseButton;
import edu.bu.met.cs665.button.StartButton;
import edu.bu.met.cs665.laundryCare.Detergent;
import edu.bu.met.cs665.mediator.Mediator;
import edu.bu.met.cs665.mediator.WasherController;

/**
 * This class represents Cottons Mediator programe
 * 
 * @author Sahad Osman
 *
 */
public class CottonsMediator implements Mediator{
	
	protected final WasherController washer;
	protected final ColdWaterValve coldWaterValve;
	protected final HotWaterValve hotWaterValve;
	protected final LevelSensor levelSensor;
	protected final TemperatureSensor tempSensor;
	protected final Motor motor;
	protected final Timer timer;
	protected final StartButton startButton;
	protected final PauseButton pauseButton;
	protected final DrainValve drainValve;
	protected final Lock lock;
	protected final Detergent detergent;

	/**
	 * Cottons Mediator constructor
	 * @param washer
	 * @param coldWaterValve
	 * @param hotWaterValve
	 * @param levelSensor
	 * @param tempSensor
	 * @param motor
	 * @param timer
	 * @param startButton
	 * @param pauseButton
	 * @param drainValve
	 * @param lock
	 * @param detergent
	 */
	public CottonsMediator(WasherController washer, ColdWaterValve coldWaterValve,
			HotWaterValve hotWaterValve, LevelSensor levelSensor,TemperatureSensor tempSensor,
			Motor motor, Timer timer,StartButton startButton, PauseButton pauseButton,
			DrainValve drainValve, Lock lock, Detergent detergent) {
		this.washer =washer ;
		this.coldWaterValve = coldWaterValve;
		this.hotWaterValve = hotWaterValve;
		this.levelSensor = levelSensor;
		this.tempSensor = tempSensor;
		this.motor = motor;
		this.timer = timer;
		this.startButton = startButton ;
		this.pauseButton = pauseButton ;
		this.drainValve = drainValve;
		this.lock = lock;
		this.detergent = detergent ;
		
	}



	/**
	 * this method Start the waster program
	 */
	@Override
	public void start() {
		System.out.println("Cottons Program is started ");
		washer.start();
	}

	/**
	 *  this method pause the cycle 
	 */
	@Override
	public void pause() {
		
		motor.stopMotor();
		lock.on();
	}


	/**
	 *  this method Start the timer for the programe
	 */
	@Override
	public void setTimer() {
		timer.start();
		
	}

	/**
	 *  this method Start the wash cycle
	 */
	@Override
	public void wash() {
		System.out.println(" === Wash level ===");
		int level=levelSensor.getlevel();
		if(levelSensor.checkWaterLevel(level)&&
		 tempSensor.checkTemperature(40)){

		motor.startMotor();
		detergent.getDetergent(level);
		motor.rotateDrum(600);}
		motor.stopMotor();
		drainValve.open();
		rinse(level);
	}

	/**
	 *  this method Start the wash cycle
	 */
	@Override
	public void rinse(int level) {
		System.out.println(" === Rines level ===");
		drainValve.close();
		if(levelSensor.checkWaterLevel(level)){
		motor.startMotor();
		motor.rotateDrum(600);
		System.out.println("Adding softener");}
		drainValve.open();
		spin();
	}

	/**
	 *  this method Start the wash cycle
	 */
	@Override
	public void spin() {
		System.out.println(" === Spin level ===");
		motor.startMotor();
		motor.rotateDrum(800);
		lock.on();
		drainValve.close();
		System.out.println("------------Done-------------- ");
		
	}

	/**
	 *  this method open the water to fill the drum
	 */
	@Override
	public void openWater() {
		coldWaterValve.open();
		hotWaterValve.open();
		
	}


	/**
	 *  this method close the water after drum filled
	 */
	@Override
	public void closeWater() {
		coldWaterValve.close();
		hotWaterValve.close();
		
	}

	/**
	 *  this method lock off the lid
	 */
	@Override
	public void lockOff() {
		lock.off();
		
	}


	/**
	 * this method adjust the water to hot
	 */
	@Override
	public void hotWater() {
		coldWaterValve.close();
		hotWaterValve.open();
		
	}

    /**
     *  this method adjust the water to cold
     */
	@Override
	public void coldWater() {
		coldWaterValve.open();
		hotWaterValve.close();

		
	}



}
