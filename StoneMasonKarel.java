/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fixColumn();
	}
		
	
	
	private void fixColumn() {
		turnLeft();
		
		while(frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		moveBackward();
		moveToNextColumn();
	}
	
	private void moveBackward(){
		turnAround();
		CheckForWall();
		turnLeft();
		
	}
	private void moveToNextColumn(){
		if (FrontIsClear()){
		for (int i=0;i<=3;i++){
			move();	
		}
		}
		fixColumn();
		
	}
	private void CheckForWall(){
		while (frontIsClear()){
			move();
	}
		
	}
}