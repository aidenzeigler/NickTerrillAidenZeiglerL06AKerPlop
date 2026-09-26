package levelPieces;

import gameEngine.Drawable;

/**
* Rock Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the Rock GamePiece, that will do nothing.
*/

public class Rock implements Drawable {
    public char symbol = 'R';

    @Override
    public void draw() {
        System.out.print(symbol);
    }

}
