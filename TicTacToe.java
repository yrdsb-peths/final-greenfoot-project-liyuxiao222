import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The TicTacToe class, the board that the user 
 * sees when playing
 * 
 * Liyu Xiao 
 * Januray 9 2023
 */
public class TicTacToe extends World
{
    //Turn starts on circle
    boolean xTurn = true;
    public TicTacToe()
    {   
        //makes the board
        super(5,5,100);
        makeBoard();
    }
    
    public void act(){
    }
    //returns whos turn it is
    public boolean getTurn(){
        return xTurn;
    }
    //changes the turn
    public void changeTurn(){
        xTurn = !xTurn;
    }
    
    //makes the board
    public void makeBoard(){
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                addObject(new BoardPiece(), x, y);
            }
        }
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 50);
        addObject(gameOverLabel, 300, 300);
    }
}
