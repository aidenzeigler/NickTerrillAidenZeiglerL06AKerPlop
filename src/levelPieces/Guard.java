package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
* Guard Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the Guard GamePiece, that will move 
* in the player's direction every other turn, 
* and give interaction type KILL when the player is on the same spot.
*/

public class Guard extends GamePiece implements Moveable {
    private boolean canMove = false;

    public Guard(int location) {
        super('G', "Guard", location);
    }

    @Override 
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(getLocation() - playerLocation);

        if (distance == 0) {
            return InteractionResult.KILL;
        }
        else {
            return InteractionResult.NONE;
        }
        
    }
    
    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int currentLocation = getLocation();
        int newLocation = currentLocation;

        canMove = !canMove;

        if (currentLocation < playerLocation && canMove) {
            newLocation++;
        }
        else if (currentLocation > playerLocation && canMove) {
            newLocation--;
        }

        if (newLocation >= 0 && newLocation <= gameBoard.length && gameBoard[newLocation] == null) {
            gameBoard[currentLocation] = null;
            gameBoard[newLocation] = this;
            setLocation(newLocation);
        }
    }

}
