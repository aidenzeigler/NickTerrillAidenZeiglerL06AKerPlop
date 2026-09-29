package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
* Elevator Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the Elevator GamePiece, that has 
* advance the player to the next level if they land in the same spot.
*/

public class Elevator extends GamePiece{


	public Elevator( int location) {
		super('E', "Elevator", location);
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.ADVANCE;
		}else {
			return InteractionResult.NONE;
		}
	}

}
