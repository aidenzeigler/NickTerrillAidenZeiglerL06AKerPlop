package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
* BananaPeel Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the BananaPeel GamePiece, that has 
* interaction type HIT when the player lands on the same spot.
*/

public class BananaPeel extends GamePiece{

	public BananaPeel(int location) {
		super('B', "Banana Peel", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(getLocation() == playerLocation) {
			return InteractionResult.HIT;
		}else {
			return InteractionResult.NONE;
		}
	}

}
