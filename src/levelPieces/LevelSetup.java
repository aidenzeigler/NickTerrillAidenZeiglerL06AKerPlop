package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

/**
* LevelSetup Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the LevelSetup class, that will setup the levels
* and its respective GameBoard with GamePieces.
*/

public class LevelSetup {
    private Drawable[] board;
    private ArrayList<Moveable> movingPieces;
    private ArrayList<GamePiece> interactingPieces;
    private int playerStartLoc;

    public void createLevel(int levelNum) {
        board = new Drawable[GameEngine.BOARD_SIZE];
        movingPieces = new ArrayList<>();
        interactingPieces = new ArrayList<>();
        playerStartLoc = GameEngine.BOARD_SIZE / 2; // In case player start location isn't given

        if (levelNum == 1) {
            playerStartLoc = 1;
            addPiece(new Rock(), 3);
            addPiece(new Guard(6), 6);
            addPiece(new Lawnmower(15), 15);
            addPiece(new Wizard(7), 7);
            addPiece(new Elevator(20), 20);
            addPiece(new Treasure(10),10);
            addPiece(new Treasure(17),17);
        }
        if (levelNum == 2) {
        	playerStartLoc = 19;
        	addPiece(new Lawnmower(18),18);
        	addPiece(new BananaPeel(17),17);
        	addPiece(new BananaPeel(12),12);
        	addPiece(new Guard(20),20);
        	addPiece(new Wizard(10),10);
        	addPiece(new Treasure(15),15);
        	addPiece(new Treasure(3),3);
        	addPiece(new Rock(), 7);
            
        }

    }

    public void addPiece(Drawable piece, int location) {
        board[location] = piece;

        if (piece instanceof GamePiece) {
            interactingPieces.add((GamePiece) piece);
        }

        if (piece instanceof Moveable) {
            movingPieces.add((Moveable) piece);
        }
    }

    public Drawable[] getBoard() {
        return board;
    }

    public ArrayList<Moveable> getMovingPieces() {
        return movingPieces;
    }

    public ArrayList<GamePiece> getInteractingPieces() {
        return interactingPieces;
    }

    public int getPlayerStartLoc() {
        return playerStartLoc;
    }

}
