package edu.bu.met.cs665.mediator;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.bu.met.cs665.Component.ColdWaterValve;
import edu.bu.met.cs665.Component.DrainValve;
import edu.bu.met.cs665.Component.HotWaterValve;
import edu.bu.met.cs665.Component.LevelSensor;
import edu.bu.met.cs665.Component.Lock;
import edu.bu.met.cs665.Component.Motor;
import edu.bu.met.cs665.Component.TemperatureSensor;
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

	/**
	 * This Method initialize the hardware component and the programes
	 */
	public void initComponent() {
		
		Mediator mediator = null;
		WasherController washer = new WasherController();
		ColdWaterValve coldWaterValve = new ColdWaterValve();
		HotWaterValve hotWaterValve = new HotWaterValve();
		LevelSensor levelSensor = new LevelSensor();
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		Motor motor = new Motor ();
		Timer timer = new Timer();
		StartButton startButton = new StartButton();
		PauseButton pauseButton = new PauseButton();
		DrainValve drainValve = new DrainValve();
		Lock lock = new Lock ();
		Detergent detergent = new Detergent ();
		
		// Display menu
		menu();
		while (true) {
		int programe=selectAPrograme();
		System.out.print("Press SATRT button ..");
		System.out.println();
		
		if (programe == 1) {
		// Cottons Program
		mediator = new CottonsMediator (washer,coldWaterValve,hotWaterValve,levelSensor
				,temperatureSensor, motor,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, levelSensor, temperatureSensor,motor,timer, startButton);
		
		startButton.press();

		}else if (programe == 2) {
		//  MixedLoad Program
		mediator = new MixedLoadMediator (washer,coldWaterValve,hotWaterValve,levelSensor
				,temperatureSensor, motor,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, levelSensor, temperatureSensor,motor,timer, startButton);
		

		startButton.press(); 
		
		}else if (programe == 3){
	    // Rinse Program
		mediator = new RinsMediator (washer,coldWaterValve,hotWaterValve,levelSensor
				,temperatureSensor, motor,timer,startButton,pauseButton,drainValve,lock,detergent); 
		
		setProgramMediator(mediator,washer, levelSensor, temperatureSensor,motor,timer, startButton);
		

		startButton.press();
		
		}else if (programe == 4){
	    // Silk Program
		mediator = new SilkMediator (washer,coldWaterValve,hotWaterValve,levelSensor
				,temperatureSensor, motor,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, levelSensor, temperatureSensor,motor,timer, startButton);
		

		startButton.press();
		
		}else if (programe == 5){
	    //  Wool Program
		mediator = new WoolMediator (washer,coldWaterValve,hotWaterValve,levelSensor
				,temperatureSensor, motor,timer,startButton,pauseButton,drainValve,lock,detergent);
		
		setProgramMediator(mediator,washer, levelSensor, temperatureSensor,motor,timer, startButton);
		
		startButton.press();
		}else {
			continue;
		}
		break;
		}
		
		
		
	}

	/**
	 * This method allow the user to select a programe
	 * @return
	 */
	private int selectAPrograme() {
		int program;
		
		
		while(true) {
			// If the user enter a non integer number it throw an exception
	        try {
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter A programe number :");
				program = input.nextInt();
	        }
				catch (InputMismatchException exception) {
				System.out.println("Integers only, please!"); 
				 continue;
			}
	        break;
	        
			}  
		return program;
	}

	private void menu() {
		//Display Menu
		System.out.println(" Hello PLease select your close programe");
		System.out.println(" ............. Thanks ..................");
		System.out.println(" Now but your close in the Drum ........");
		System.out.println(" ( 1 )----------------- Cotton ");
		System.out.println(" ( 2 )-------------- MixedLoad ");
		System.out.println(" ( 3 )------------------ Rines ");
		System.out.println(" ( 4 ) ----------------- Silk ");
		System.out.println(" ( 5 ) ----------------- Wool ");
	}

	/**
	 * This method set the parameter for the mediator
	 * @param mediator
	 * @param washer
	 * @param levelSensor
	 * @param temperatureSensor
	 * @param motor
	 * @param timer
	 * @param startButton
	 */
	private void setProgramMediator(Mediator mediator,WasherController washer,
			LevelSensor levelSensor, TemperatureSensor temperatureSensor,
			Motor motor, Timer timer, StartButton startButton) {
		
		washer.setMediator(mediator);
		temperatureSensor.setMediator(mediator);
		levelSensor.setMediator(mediator);
		motor.setMediator(mediator);
		timer.setMediator(mediator);
		startButton.setMediator(mediator);
		
	}


	
}
