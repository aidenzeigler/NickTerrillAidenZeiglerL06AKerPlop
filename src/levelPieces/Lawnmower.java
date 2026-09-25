package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class Lawnmower extends GamePiece implements Moveable {

    Random random = new Random();

    public Lawnmower(int location) {
        super('L', "Lawnmower", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(getLocation() - playerLocation);

        if (distance == 0) {
            return InteractionResult.HIT;
        }
        else {
            return InteractionResult.NONE;
        }
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int currentLocation = getLocation();
        int newLocation = currentLocation;
        int randomInt = random.nextInt(3);

        if (randomInt == 0) {
            newLocation--;
        }
        else if (randomInt == 2) {
            newLocation++;
        }

        if (newLocation >= 0 && newLocation < gameBoard.length && gameBoard[newLocation] == null) {
            gameBoard[currentLocation] = null;
            gameBoard[newLocation] = this;
            setLocation(newLocation);
        }
    }

}
