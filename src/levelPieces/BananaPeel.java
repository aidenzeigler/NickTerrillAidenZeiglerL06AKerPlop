package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

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
