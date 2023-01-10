import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the board piece class, main code for the functionality 
 * of the game
 * 
 * Liyu Xiao
 *
 * January 9 2023
 */
public class BoardPiece extends Actor
{   GreenfootImage boardPiece = new GreenfootImage("images/boardpeice.png");
    public BoardPiece(){
        boardPiece.scale(145,145);
        setImage(boardPiece);
    }
}
