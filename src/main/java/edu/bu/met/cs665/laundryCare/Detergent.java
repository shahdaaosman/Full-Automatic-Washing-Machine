package edu.bu.met.cs665.laundryCare;

/**
 * This class represents Detergent
 * 
 * @author Sahad Osman
 *
 */
public class Detergent {
	
	/**
	 * this method get the required Detergent for the load
 	 * @param level
	 */
	public void getDetergent(int level) {
		// TODO Auto-generated method stub
		if (level == 1) {
			low();
		}else if ( level == 2) {
			medium();
		}else if (level == 3) {
			high();
		}
	}
	
	//add cup of detergent 
	public void low(){
		System.out.println("Add half cup of detergent");
	}
	
	public void medium(){
		System.out.println("Add one cup of detergent");
	}
	
	public void high(){
		System.out.println("Add two cup of detergent");
	}


}
