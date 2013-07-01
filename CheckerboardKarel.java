/*
 * Name:Urvashi Jouhari
 * File: CheckerboardKarel.java
 * ----------------------------
 * The CheckerboardKarel class draws a checkerboard using beepers, as described in Assignment 1.  
 * The program works for all of the sample worlds supplied in the starter folder.
 * The Checkerboard pattern is filled one column at a time. 
 * Different methods are defined to fill an odd row or an even row.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	

public void run() {
	turnLeft();
	
/* 
 * The initial position of Karel is the left most corner, facing East. 
 * The first column is assumed to be odd.
 * Karel takes a left turn and moves upward checking constantly if it is blocked by a wall.
 * Karel proceeds from odd columns to even columns to make the checkboard pattern.
 * 
 */
	if(frontIsClear()){	
		putBeeper();
		while(frontIsClear()){
		fillOddColumn();
		fillEvenColumn();
		}
	}
	
/*
 *This is a special case for a matrix such as the 8X1 matrix.
 *If Karel's top is blocked initially, it checks if its right is clear and proceeds to making a checkboard pattern. 	
 *
 */
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

/*
 * Pre-condition : Karel is at the bottom corner of an odd column, facing North.
 * Post-condition: Karel is at the top corner of an even column, facing South.
 */

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
	
/*
 * Pre-condition: Karel is present at the top most corner of an odd column.
 * Post-condition:Karel is present at the bottom most corner of an even column.
 * 
 */
	
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

/*
 * Pre-condition : Karel is at the top corner of an even column, facing South.
 * Post-condition: Karel is at the bottom corner of an odd column, facing North.
 * 
 */	
	
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
	
/*
 * Pre-condition: Karel is present at the bottom most corner of an even column.
 * Post-condition: Karel is present at the top most corner of an odd column.
 * 
 */	
	
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


	
	
