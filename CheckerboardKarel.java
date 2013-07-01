/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
public void run() {
	turnLeft();
	
	if(frontIsClear()){	
		putBeeper();
		while(frontIsClear()){
		fillOddColumn();
		fillEvenColumn();
		}
	}
	
	
	else {
		turnRight();
		putBeeper();
		while(frontIsClear()){
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					putBeeper();
				}
			}
		}
	
	}
}	

	private void fillOddColumn(){
		
		while(facingNorth()){
			if(frontIsClear()){
				move();
				if(frontIsClear()){
					move();
					putBeeper();
				}
				
			moveToEvenColumn();
			
			}
		}
	}
	
	
	private void moveToEvenColumn() {
		if (frontIsBlocked()) {
			if (noBeepersPresent()) {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					putBeeper();
				}
			}
			else {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
					move();
					putBeeper();
				}
			}
		}
	}
	
	private void fillEvenColumn(){
		while(facingSouth()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
			moveToOddColumn();
			
			}
		
	}
	
	private void moveToOddColumn() {
		if (frontIsBlocked()) {
			if (noBeepersPresent()) {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnLeft();
					putBeeper();
				}
			}
			else {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnLeft();
					move();
					putBeeper();
				}
			}
		}
	}
}


	
	
