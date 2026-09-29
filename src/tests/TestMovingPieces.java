

package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import gameEngine.*;
import levelPieces.*;
public class TestMovingPieces {
	
		/*
		 * tests if the guard will move towards the player while not moving every other action,
		 * then checks that guard cannot move onto a filled location
		 */
    	@Test
    	public void testGuardMove() {
    		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
			Guard guard = new Guard(10);
			gameBoard[10] = guard;
			
			guard.move(gameBoard, 12);
			assertEquals(guard.getLocation(),11);
			guard.move(gameBoard, 12);
			assertEquals(guard.getLocation(),11);
			guard.move(gameBoard, 8);
			assertEquals(guard.getLocation(),10);
			guard.move(gameBoard, 8);
			assertEquals(guard.getLocation(),10);
			
			BananaPeel blocker = new BananaPeel(11);
			gameBoard[11] = blocker;
			guard.move(gameBoard, 12);
			assertEquals(guard.getLocation(),10);
    	}
    	
    	/*
    	 * places lawnmower in between two banana peels so that it has 3 possible places it can be,
    	 * then checks that lawnmower both cannot escape that area and makes sure it is capable of 
    	 * moving both left or right randomly, or if it stays still
    	 */
    	@Test
    	public void testLawnMowerMove() {
    		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    		Lawnmower lawnMower = new Lawnmower(10);
    		gameBoard[10] = lawnMower;
    		
    		BananaPeel blocker1 = new BananaPeel(12);
			gameBoard[12] = blocker1;
			
			BananaPeel blocker2 = new BananaPeel(8);
			gameBoard[8] = blocker2;
			
			int currentLocation = 10;
			int stoodStill = 0;
			int movedLeft = 0;
			int movedRight = 0;
			
			for(int i = 0; i < 200; i++) {
				currentLocation = lawnMower.getLocation();
				lawnMower.move(gameBoard, 15);
				int newLocation = lawnMower.getLocation();
				if(newLocation < 9 || newLocation > 11){
					fail("Invalid square selected");
				}
				if(newLocation == currentLocation) {
					stoodStill++;
				}else if(newLocation == currentLocation--) {
					movedLeft++;
				}else if(newLocation == currentLocation++) {
					movedRight++;
				}
				
				currentLocation = newLocation;

			}
			
			assert(stoodStill >0);
			assert(movedLeft > 0);
			assert(movedRight > 0);
    	}
}
