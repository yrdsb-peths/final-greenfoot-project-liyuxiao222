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
    //3*3 board tracks the moves
    int[][] board = new int[5][5];
    public void act()
    { 
        //checks the turn, and adds the object accordingly
        if(Greenfoot.mouseClicked(this)){
            TicTacToe game = (TicTacToe) getWorld();

            if(checkWin()){
                game.gameOver();
            } 

            if(game.getTurn()){
                game.addObject(new Circle(),getX(), getY());
                board[getY()][getX()] = 1;
                game.changeTurn();
            }
            else{
                game.addObject(new Cross(), getX(), getY());
                board[getY()][getX()] = 0;
                game.changeTurn();
            }
        }
    }
    //Checks the if there is a winner
    public boolean checkWin(){
        if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] == board[0][3] && board[0][0] == board[0][4]){
           return true; 
        }
        else if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] == board[1][3] && board[1][0] == board[1][4]){
            return true;
        }
        else if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] == board[2][3] && board[2][0] == board[2][4]){
            return true;
        }
        else if(board[3][0] == board[3][1] && board[3][0] == board[3][2] && board[3][0] == board[3][3] && board[3][0] == board[3][4]){
            return true;
        }
        else if(board[4][0] == board[4][1] && board[4][0] == board[4][2] && board[4][0] == board[4][3] && board[4][0] == board[4][4]){
            return true;
        }
        else if(board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] == board[3][0] && board[0][0] == board[4][0]){
            return true;
        }
        else if(board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] == board[3][1] && board[0][1] == board[4][1]){
            return true;
        }
        else if(board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] == board[3][2] && board[0][2] == board[4][2]){
            return true;
        }
        else if(board[0][3] == board[1][3] && board[0][3] == board[2][3] && board[0][3] == board[3][3] && board[0][3] == board[4][3]){
            return true;
        }
        else if(board[0][4] == board[1][4] && board[0][4] == board[2][4] && board[0][4] == board[3][4] && board[0][4] == board[4][4]){
            return true;
        }
        else if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3] && board[0][0] == board[4][4]){
            return true;
        }
        else if(board[4][0] == board[3][1] && board[4][0] == board[2][2] && board[4][0] == board[1][3] && board[4][0] == board[0][4]){
            return true;
        }
        else{
            return false;
        }
    }
    
}
