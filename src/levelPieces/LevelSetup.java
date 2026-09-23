package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelSetup {
    private Drawable[] board;
    private ArrayList<Moveable> movingPieces;
    private ArrayList<GamePiece> interactingPieces;
    private int playerStartLoc;

    public void createLevel(int levelNum) {
        board = new Drawable[GameEngine.BOARD_SIZE];
        movingPieces = new ArrayList<>();
        interactingPieces = new ArrayList<>();
        playerStartLoc = GameEngine.BOARD_SIZE / 2;

        if (levelNum == 1) {
            playerStartLoc = 1;
            addPiece(new Rock(), 3);
            addPiece(new Guard(8), 8);
            addPiece(new Lawnmower(15), 15);
        }
        if (levelNum == 2) {
            
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
