/*
 * Name:Urvashi Jouhari
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here repairs the quad by fixing one arch at a time.
 * If the arch does not have a stone present, it places a stone (beeper) in that area. It continues to do this until it reaches a wall.
 * Upon reaching a wall, Karel turns back and returns to its start point.
 * It is assumed that the archs are always at a distance of four from each other.
 * Upon returning to start point, Karel moves a distance of four blocks, reaches another arch and continues to fix it in the same manner. 
 * 
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fixArch();
	}
	
/*Pre-condition:Karel is at startpoint, facing East.
 *Post-condition:Karel has fixes all arches and is at the extreme corner of the last arch, facing East. 		
 */
	private void fixArch() {
		turnLeft();
		replaceMissingStones();
		moveBackward();
		if (frontIsClear()){
			moveToNextArch();
		}
	}
	
//Karel replaces all the missing stones in an arch.
	
	private void replaceMissingStones(){
		while(frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
			}
			
			move();
		}
		if (noBeepersPresent()){
			putBeeper();
		}
	}
/*Pre-condition: Karel has fixed all the missing stones in the arch and has reached the top of the arch.
 * Post-condition: Karel turns back around and returns to the start point of the arch.	
 */
	private void moveBackward(){
		turnAround();
		CheckForWall();
		turnLeft();
		
	}
	
/*Since all arches are assumed to be at a distance of four, Karel moves to the next arch by moving four blocks.
 *Once Karel reaches the next arch, it proceeds to fix it. 	
 */
	private void moveToNextArch(){
		if (frontIsClear()){
		for (int i=0;i<=3;i++){
			if(frontIsClear()){
			move();
			}
		
		}
		fixArch();
		}
		
//Karel checks if there is a wall ahead. 		
	}
	private void CheckForWall(){
		while (frontIsClear()){
			move();
	}
		
	}
}