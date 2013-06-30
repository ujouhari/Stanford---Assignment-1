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
	
	while(frontIsClear() || leftIsClear()){
	oddColumn();
	evenColumn();
	}
	
	}
	
	private void oddColumn(){

	turnLeft();
	while(frontIsClear()){
		putBeeper();
		safeToMove();
		safeToMove();
	}
	
	if (rightIsClear()){
		turnRight();
		move();
		}
	
	}
	
	private void evenColumn(){
	turnRight();
	while(frontIsClear()){
		putBeeper();
		safeToMove();
		safeToMove();
	}
	
	if (rightIsClear()){
		turnLeft();
		move();
		}

	}
	
	private void safeToMove(){
		if (frontIsClear()){
			move();
		}
	}
	
	
}
