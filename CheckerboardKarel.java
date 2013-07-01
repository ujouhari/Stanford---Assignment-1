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
		oddColumn();
		evenColumn();
		}
	}
	
	
	else {
		turnRight();
		putBeeper();
		while(rightIsClear()){
			evenColumn();
			}
	}
	
	}

	private void oddColumn(){
		
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
	
	private void evenColumn(){
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


	
	
	
	/*private void oddColumn(){

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
}




	
 /*public void run(){
		putBeeper();
		safeToMove();
		while(frontIsClear()){
			oddRowArrangement();
			evenRowArrangement();
			}
	}
	
	private void oddRowArrangement(){
		while(facingEast()){
			makeCheckerDesign();
		}
		moveToEvenRow();
	}
	
	private void evenRowArrangement(){
		while(facingWest()){
			makeCheckerDesign();
		}
		moveToOddRow();
	}
	
	private void makeCheckerDesign(){
			move();
		if(frontIsClear()){
			move();
		}
		putBeeper();
	}
	
	private void moveToEvenRow(){
		if(frontIsBlocked()){
			if(noBeepersPresent()){
				turnLeft();
				if(frontIsClear()){
					move();
					turnLeft();
					putBeeper();
				}
			}
			
			else{
				turnLeft();
				if(frontIsClear()){
					move();
					turnLeft();
					move();
					putBeeper();
				}
			}
		}
	}
	
	private void moveToOddRow(){
		if(frontIsBlocked()){
			if(noBeepersPresent()){
				turnRight();
				if(frontIsClear()){
					move();
					turnRight();
					putBeeper();
				}
			}
			
			else{
				turnRight();
				if(frontIsClear()){
					move();
					turnRight();
					move();
					putBeeper();
				}
			}
		}
		
	}
	
	private void safeToMove(){
		if(frontIsBlocked()){
			turnLeft();
			while(frontIsClear()){
				makeCheckerDesign();
			}
			
		}
	}
*/	

		/*public void run() {
			putBeeper();
			checkWall();
			while (frontIsClear()) {
				beepersEast();
				beepersWest();
			}
		}
		private void beepersEast() {
			while (facingEast()) {
				move();
				if (frontIsClear()) {
					move();
					putBeeper();
				}
				upEast();
			}
		}
		private void upEast() {
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
		private void beepersWest() {
			while (facingWest()) {
				move();
				if (frontIsClear()) {
					move();
					putBeeper();
				}
				upWest();
			}
		}
		private void upWest() {
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
		private void checkWall() {
			if (frontIsBlocked()) {
				turnLeft();
				while (frontIsClear()) {
					move();
					if (frontIsClear()) {
						move();
						putBeeper();
					}
				}
			}
		}
		
	}
	
	*/
	
	
   /* // public static int flag =1;
     public static int p_solved = 0;
	public void run() {
		
		
		while (p_solved == 0) {
			 putBeeper();
			 int count = 0;
			// move();
			
			if (facingEast()) {
				move_right();
				 count = count + 1;
			    }

			if (facingWest() && p_solved == 0 && count < 2) {
				move_left();
				count = count + 1;
			    }

			if (facingEast() && p_solved == 0 && count < 2) {
				move_right();
				count = count + 1;
			    }

			if (facingWest() && p_solved == 0 && count < 2) {
				move_left();
				count = count + 1;
			    }
			    
			}
		}
	
	private void move_right() {
	  if(frontIsClear()) {
		   move();
	  }
		   else {
			   turnLeft();
			   	// flag = 0;
			   	   if(frontIsClear()) {
			   		   move();
			   		   turnLeft();
			   	   }
			   	   else
			   	   {
			   		   p_solved = 1;
			   	   }
			   			   
			   		   
			   	   }
		   }
		  	
	
	private void move_left() {
		if(frontIsClear()) {
			move();
		}
		else {
			turnRight ();
			  if(frontIsClear()) {
				  move();
				  turnRight();
			  }
			  else {
				   p_solved =1;
			  }
			  }
				  
		}
	
	}
	
	*/



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