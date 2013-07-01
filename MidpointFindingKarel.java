/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run(){
		fillRowWithBeepers();
		reachMidpoint();
	}
	
	private void fillRowWithBeepers(){
		while(frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
	}
	
	private void reachMidpoint(){
		while(beepersPresent()){
		clearExtraBeepersOnLeft();
		clearExtraBeepersOnRight();
		}
		putBeeper();
		
	}
	
	private void clearExtraBeepersOnLeft(){
		turnAround();
		pickBeeper();
		moveToOtherSide();
		if (noBeepersPresent()){
			if (frontIsClear()){
				move();
				if(beepersPresent()){
					pickBeeper();
				}
			}
		}
	}
	private void moveToOtherSide(){
		while(frontIsClear()){
			move();
			
		}
	}
	private void clearExtraBeepersOnRight(){
		turnAround();
		pickBeeper();
		moveToOtherSide();
		if (noBeepersPresent()){
			if (frontIsClear()){
				move();
				if(beepersPresent()){
					pickBeeper();
				}
			}
		}
		
	}
	
}
