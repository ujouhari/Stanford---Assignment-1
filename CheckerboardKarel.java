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
		int p_solved = 0;
		int flag = 0;
		while (p_solved == 0) {
			putBeeper();
			int count = 0;
			
			if (flag == 1 && p_solved ==0 && count < 2) {
				move_right();
				count = count + 1;
			    }

			if (flag == 0 && p_solved ==0 && count < 2) {
				move_left();
				count = count + 1;
			    }

			if (flag == 1 && p_solved ==0 && count < 2) {
				move_right();
				count = count + 1;
			    }

			if (flag == 0 && p_solved ==0 && count < 2) {
				move_left();
				count = count + 1;
			    }
			}
		}
	
	private void move_right() {
	  
	}
	
	private void move_left() {
		
	
	}
	
	}



	/* public void run() {
	
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
	
	

*/