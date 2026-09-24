package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Wizard extends GamePiece {

    public Wizard(int location) {
        super('W', "Wizard", location);
    }

    @Override 
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(getLocation() - playerLocation);

        if (distance == 3) {
            return InteractionResult.KILL;
        }
        else {
            return InteractionResult.NONE;
        }

    }

}
