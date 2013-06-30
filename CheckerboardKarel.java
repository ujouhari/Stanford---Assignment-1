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
			if (noBeepersPresent()){
				putBeeper();
			}
		
		moveBackward();
		
		if (frontIsClear()){
		
		moveToNextColumn();
		}
	}
	
	private void moveBackward(){
		turnAround();
		CheckForWall();
		turnLeft();
		
	}
	private void moveToNextColumn(){
		if (frontIsClear()){
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
