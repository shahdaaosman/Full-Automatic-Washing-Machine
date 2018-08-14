package edu.bu.met.cs665.entity;


/**
 * This class represents a Laundry System
 * 
 * @author Use this
 *
 */
public class LaundrySystem {

	/**
	 * build the singleton pattern
	 */
	private LaundrySystem () {
		
	}
	
    /**
     * 
     * this class represent the Singleton holder
     *
     */
	private static class SingletonHolder {
        private static final LaundrySystem INSTANCE = new LaundrySystem();
    }

	/**
	 * this return the game object
	 * @return
	 */
	public static LaundrySystem getInstance() {
		 return SingletonHolder.INSTANCE;
	}

	
	public void start() {
		// TODO Auto-generated method stub
		
	}
}
