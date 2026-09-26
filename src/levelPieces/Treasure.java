package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
* Treasure Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the Treasure GamePiece, that has interaction type GET_POINT
* when the player lands on the same spot.
*/

public class Treasure extends GamePiece{

	public Treasure(int location) {
		super('T', "Treasure", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.GET_POINT;
		}else {
			return InteractionResult.NONE;
		}
	}

}
