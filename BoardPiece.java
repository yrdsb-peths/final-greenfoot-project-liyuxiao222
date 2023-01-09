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
    //3*3 board tracks the moves
    int[][] board = new int[3][3];
    public void act()
    {
        //checks the turn, and adds the object accordingly
        if(Greenfoot.mouseClicked(this)){
            TicTacToe game = (TicTacToe) getWorld();
            if(checkWin()){
                
            }
            if(game.getTurn()){
                game.addObject(new Circle(),getX(), getY());
                board[getX()][getY()] = 1;
                game.changeTurn();
            }
            else{
                game.addObject(new Cross(), getX(), getY());
                board[getX()][getY()] = 0;
                game.changeTurn();
            }
        }
    }
    
    public boolean checkWin(){
        if(board[0][0] == board[0][1] && board[0][0] == board[0][2]){
           return true; 
        }
        else if(board[1][0] == board[1][1] && board[1][0] == board[1][2]){
            return true;
        }
        else if(board[2][0] == board[2][1] && board[2][0] == board[2][2]){
            return true;
        }
        else if(board[0][0] == board[1][0] && board[0][0] == board[2][0]){
            return true;
        }
        
        else{
            return false;
        }
    }
    
}
