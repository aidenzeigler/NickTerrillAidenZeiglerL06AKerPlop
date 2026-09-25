package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Elevator extends GamePiece{


	public Elevator( int location) {
		super('E', "Elevator", location);
		// TODO Auto-generated constructor stub
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
