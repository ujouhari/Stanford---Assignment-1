/*
 * Name:Urvashi Jouhari
 * File: MidpointFindingKarel.java
 * -------------------------------
 * In the program Karel does the following:
 * Fills the first Row with beepers.
 * Picks a beeper from the extreme left first and then the extreme right.
 * Returns to the leftmost block that contains a beeper and picks it up. 
 * Returns to right most block that contains a beeper and picks it up.
 * Continues to return until it has picked up all the beepers and reached the midpoint.
 * Places a beeper in the midpoint.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run(){
		fillRowWithBeepers();
		reachMidpoint();
	}
	
/*
 * Karel fills the first row with Beepers.
 * Pre-condition - Karel is at the left most corner of the world, facing East.
 * 					No beepers are present anywhere in the world.
 * Post-condition - Karel is at the right most corner of the worls, facing East.
 * 					Beeepers are present in all the blocks of the first row.
 * 
 */
	
	private void fillRowWithBeepers(){
		while(frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
	}
	
//Karel reaches the mispoint and places beeper in it.
	
	private void reachMidpoint(){
		
		clearExtraBeepers();
		putBeeper();
		
	}
	
//Karel clears all the beepers to the left and right of the midpoint.
	
	private void clearExtraBeepers(){
		turnAround();
		pickBeeper();
		
		while (frontIsClear()){
			move();
		}
		turnAround();
		pickBeeper();
		move();
		moveToNextExtraBeeper();
			
	}
		
//Karel moves to the next leftmost or rightmost spot with a Beeper present in it.
	
	private void moveToNextExtraBeeper(){
		
		while(beepersPresent()){
			move();
		 }
		turnAround();
		move();
		
		if(beepersPresent()){
			pickBeeper();
			move();
			moveToNextExtraBeeper();
			}
				
		}
		
		
	
	
}
