import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boardpeice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoardPiece extends Actor
{   GreenfootImage boardPiece = new GreenfootImage("images/boardpeice.png");
    public BoardPiece(){
        boardPiece.scale(145,145);
        setImage(boardPiece);
    }
    public void act()
    {
        //checks the turn, and adds the object accordingly
        if(Greenfoot.mouseClicked(this)){
            TicTacToe game = (TicTacToe) getWorld();
            if(game.getTurn()){
                game.addObject(new Circle(),getX(), getY());
                game.board[getX()][getY()] = 1; 
            }
        }
    }
}
