/*
 * Name:Urvashi Jouhari
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	
	public void run() {
		
		
		moveToNewspaper();
		pickNewspaper();
		returnToStartPoint();
		
	}
	//Turns Karel 90 degrees to the Right.
	private void turnRight()   {
		for (int i=0; i < 3; i++) {
			turnLeft();
		}
	}
	
	
	/*Pre-condition : The Position of Karel is fixed at the right upper corner
	 *Post-condition: Karel reaches the newspaper.
	 */
	private void moveToNewspaper() {
		
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		
	}
	/*Pre-condition: The spot of the newspaper stays fixed.
	 * 				 Karel is currently located at the spot of the newspaper. 
	 *Post-condition:As long as a newspaper is present, Karel picks it up.
	 */
	
	private void pickNewspaper() {
		while (beepersPresent()) {
			pickBeeper();
		}
		
	}
	/*Pre-condition: Karel is currently located at the spot of the newspaper. 
	 *Post-condition:Karel returns to its fixed start point.
	 */
	private void returnToStartPoint(){
		
		turnLeft();
		turnLeft();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
	}

}
