package levelPieces;

import gameEngine.Drawable;

public class Rock implements Drawable {
    public char symbol = 'R';

    @Override
    public void draw() {
        System.out.print(symbol);
    }

}
