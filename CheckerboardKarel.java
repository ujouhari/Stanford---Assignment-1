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
		oddColumn();
		evenColumn();
	}
		
	private void oddColumn() {
		turnLeft();
		
			while(frontIsClear()){
				putBeeper();
				move();
				move();
			}
		turnRight();
		move();
		
	}
	
	private void evenColumn(){
		turnRight();
		
		while(frontIsClear()){
			move();
			putBeeper();
			move();
		}
		turnRight();
		move();
		turnLeft();
		
	}
			
	
}
