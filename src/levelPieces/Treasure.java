package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

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
