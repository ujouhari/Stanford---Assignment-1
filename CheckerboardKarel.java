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
	
	if(frontIsClear()){	
	while(frontIsClear()){
	oddColumn();
	evenColumn();
	}
	}
	else if(leftIsClear()){
		while(leftIsClear()){
			oddColumn();
			evenColumn();
			}

	}
	else {
		while(rightIsClear()){
			oddColumn();
			evenColumn();
			}
	}
	
	}
	
	
	
	private void oddColumn(){

	turnLeft();
	while(frontIsClear()){
		putBeeper();
		safeToMove();
		safeToMove();
	}
	if(noBeepersPresent()){
		putBeeper();
	}
	
	if (rightIsClear()){
		turnRight();
		if(frontIsClear()) {
		move();
		}
		}

	}
	
	private void evenColumn(){
	turnRight();
	while(frontIsClear()){
		putBeeper();
		safeToMove();
		safeToMove();
	}
	
	if (leftIsClear()){
		turnLeft();
		if(frontIsClear()) {
		move();
		}
		}

	}
	
	private void safeToMove(){
		if (frontIsClear()){
			move();
		}
	}
	
	
}
