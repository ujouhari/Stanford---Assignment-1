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
		
	private void fixArch() {
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
			moveToNextArch();
		}
	}
	
	private void moveBackward(){
		turnAround();
		CheckForWall();
		turnLeft();
		
	}
	private void moveToNextArch(){
		if (frontIsClear()){
		for (int i=0;i<=3;i++){
			if(frontIsClear()){
			move();
			}
		}
		fixArch();
		}
		
		
	}
	private void CheckForWall(){
		while (frontIsClear()){
			move();
	}
		
	}
}