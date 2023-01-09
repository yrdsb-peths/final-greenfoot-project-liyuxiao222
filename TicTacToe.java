import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToe extends World
{
    int[][] board = new int[3][3];
    boolean xTurn = true;
    public TicTacToe()
    {    
        super(3,3,100);
        makeBoard();
    }
    
    public void act(){
    }
    
    public boolean getTurn(){
        return xTurn;
    }
    
    public void changeTurn(){
        xTurn = !xTurn;
    }
    
    
    public void makeBoard(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                addObject(new BoardPiece(), x, y);
            }
        }
    }
}
