package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
* Wizard Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the Wizard GamePiece, that will return interaction
* type KILL if the player is EXACTLY 3 spots away from it in either direction.
*/

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
