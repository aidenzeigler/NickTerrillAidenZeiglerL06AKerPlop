package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import gameEngine.*;
import levelPieces.*;


public class TestInteractions {
	 	@Test
		public void testBananaPeel() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
			BananaPeel bananaPeel = new BananaPeel(10);
			gameBoard[10] = bananaPeel;
			// Hit points if player on same space
			assertEquals(InteractionResult.HIT, bananaPeel.interact(gameBoard, 10));
			// These loops ensure no interaction if not on same space
			for (int i=0; i<10; i++)
				assertEquals(InteractionResult.NONE, bananaPeel.interact(gameBoard, i));
			for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
				assertEquals(InteractionResult.NONE, bananaPeel.interact(gameBoard, i));
		}
	 	
	 	@Test
	 	public void testElevator() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE]; 
			Elevator elevator = new Elevator(10);
			gameBoard[10] = elevator;
			// Hit points if player on same space
			assertEquals(InteractionResult.ADVANCE, elevator.interact(gameBoard, 10));
			// These loops ensure no interaction if not on same space
			for (int i=0; i<10; i++)
				assertEquals(InteractionResult.NONE, elevator.interact(gameBoard, i));
			for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
				assertEquals(InteractionResult.NONE, elevator.interact(gameBoard, i));
		}
	 	
	 	@Test
	 	public void testTreasure() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE]; 
			Treasure treasure = new Treasure(10);
			gameBoard[10] = treasure;
			// Hit points if player on same space
			assertEquals(InteractionResult.GET_POINT, treasure.interact(gameBoard, 10));
			// These loops ensure no interaction if not on same space
			for (int i=0; i<10; i++)
				assertEquals(InteractionResult.NONE, treasure.interact(gameBoard, i));
			for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
				assertEquals(InteractionResult.NONE, treasure.interact(gameBoard, i));
		}
	 	
	 	@Test
	 	public void testWizard() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE]; 
			Wizard wizard = new Wizard(10);
			gameBoard[10] = wizard;
			// Hit points if player on same space
			assertEquals(InteractionResult.GET_POINT, wizard.interact(gameBoard, 7));
			assertEquals(InteractionResult.GET_POINT, wizard.interact(gameBoard, 13));
			// These loops ensure no interaction if not on same space
			for (int i=0; i<7; i++)
				assertEquals(InteractionResult.NONE, wizard.interact(gameBoard, i));
			for (int i=8; i<13; i++)
				assertEquals(InteractionResult.NONE, wizard.interact(gameBoard, i));
			for (int i=14; i<GameEngine.BOARD_SIZE; i++)	
				assertEquals(InteractionResult.NONE, wizard.interact(gameBoard, i));
		}
	 	
	 	@Test
	 	public void testLawnmower() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE]; 
			Lawnmower lawnMower = new Lawnmower(10);
			gameBoard[10] = lawnMower;
			// Hit points if player on same space
			assertEquals(InteractionResult.HIT, lawnMower.interact(gameBoard, 10));
			// These loops ensure no interaction if not on same space
			for (int i=0; i<10; i++)
				assertEquals(InteractionResult.NONE, lawnMower.interact(gameBoard, i));
			for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
				assertEquals(InteractionResult.NONE, lawnMower.interact(gameBoard, i));
		}
	 	
	 	@Test
	 	public void testGuard() {
			Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE]; 
			Guard guard = new Guard(10);
			gameBoard[10] = guard;
			// Hit points if player on same space
			assertEquals(InteractionResult.KILL, guard.interact(gameBoard, 10));
			// These loops ensure no interaction if not on same space
			for (int i=0; i<10; i++)
				assertEquals(InteractionResult.NONE, guard.interact(gameBoard, i));
			for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
				assertEquals(InteractionResult.NONE, guard.interact(gameBoard, i));
		}
}
