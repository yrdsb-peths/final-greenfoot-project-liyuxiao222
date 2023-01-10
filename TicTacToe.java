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
        checkWin();
        //if board is full after checking and no win, initiate tie
        if(sum == 25){
            startTie();
        }
        play();
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
    
    //Checks for a win
    public void checkWin(){
        //checks if cross wins
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                //checks horizontally
                if(getObjectsAt(x,y,Cross.class).size() > 0 &&
                   getObjectsAt(x+1,y,Cross.class).size() > 0 &&
                   getObjectsAt(x+2,y,Cross.class).size() > 0 &&
                   getObjectsAt(x+3,y,Cross.class).size() > 0 &&
                   getObjectsAt(x+4,y,Cross.class).size() > 0){
                       Label gameOver = new Label("Cross wins!", 100);
                       addObject(gameOver, 2, 2);
                       Greenfoot.stop();
                   }
                //checks vertically
                else if(getObjectsAt(x,y,Cross.class).size() > 0 &&
                       getObjectsAt(x,y+1,Cross.class).size() > 0 &&
                       getObjectsAt(x,y+2,Cross.class).size() > 0 &&
                       getObjectsAt(x,y+3,Cross.class).size() > 0 &&
                       getObjectsAt(x,y+4,Cross.class).size() > 0){
                           Label gameOver = new Label("Cross wins!", 100);
                           addObject(gameOver, 2, 2);
                           Greenfoot.stop();
                    }
                //checks diagonally
                else if(getObjectsAt(x,y,Cross.class).size() > 0 &&
                       getObjectsAt(x+1,y+1,Cross.class).size() > 0 &&
                       getObjectsAt(x+2,y+2,Cross.class).size() > 0 &&
                       getObjectsAt(x+3,y+3,Cross.class).size() > 0 &&
                       getObjectsAt(x+4,y+4,Cross.class).size() > 0){
                           Label gameOver = new Label("Cross wins!", 100);
                           addObject(gameOver, 2, 2);
                           Greenfoot.stop();
                    }
                //checks diagonally
                else if(getObjectsAt(x,y,Cross.class).size() > 0 &&
                        getObjectsAt(x+1,y-1,Cross.class).size() > 0 &&
                        getObjectsAt(x+2,y-2,Cross.class).size() > 0 &&
                        getObjectsAt(x+3,y-3,Cross.class).size() > 0 &&
                        getObjectsAt(x+4,y-4,Cross.class).size() > 0){
                           Label gameOver = new Label("Cross wins!", 100);
                           addObject(gameOver, 2, 2);
                           Greenfoot.stop();
                    }
        //checks if Circle win
                if(getObjectsAt(x,y,Circle.class).size() > 0 &&
                   getObjectsAt(x+1,y,Circle.class).size() > 0 &&
                   getObjectsAt(x+2,y,Circle.class).size() > 0 &&
                   getObjectsAt(x+3,y,Circle.class).size() > 0 &&
                   getObjectsAt(x+4,y,Circle.class).size() > 0){
                       Label gameOver = new Label("Circle wins!", 100);
                       addObject(gameOver, 2, 2);
                       Greenfoot.stop();
                   }
                else if(getObjectsAt(x,y,Circle.class).size() > 0 &&
                        getObjectsAt(x,y+1,Circle.class).size() > 0 &&
                        getObjectsAt(x,y+2,Circle.class).size() > 0 &&
                        getObjectsAt(x,y+3,Circle.class).size() > 0 &&
                        getObjectsAt(x,y+4,Circle.class).size() > 0){
                           Label gameOver = new Label("Circle wins!", 100);
                           addObject(gameOver, 2, 2);
                           Greenfoot.stop();
                    }
                else if(getObjectsAt(x,y,Circle.class).size() > 0 &&
                        getObjectsAt(x+1,y+1,Circle.class).size() > 0 &&
                        getObjectsAt(x+2,y+2,Circle.class).size() > 0 &&
                        getObjectsAt(x+3,y+3,Circle.class).size() > 0 &&
                        getObjectsAt(x+4,y+4,Circle.class).size() > 0){
                           Label gameOver = new Label("Circle wins!", 100);
                           addObject(gameOver, 2, 2);
                           Greenfoot.stop();
                    }
                else if(getObjectsAt(x,y,Circle.class).size() > 0 &&
                        getObjectsAt(x+1,y-1,Circle.class).size() > 0 &&
                        getObjectsAt(x+2,y-2,Circle.class).size() > 0 &&
                        getObjectsAt(x+3,y-3,Circle.class).size() > 0 &&
                        getObjectsAt(x+4,y-4,Circle.class).size() > 0){
                           Label gameOver = new Label("Circle wins!", 100);
                           addObject(gameOver, 2, 2);
                           Greenfoot.stop();
                    }
                }
            }
        }
    //initiates a tie in the case of a tie
    public void startTie(){
        Label gameOver = new Label("Tie :(", 100);
        addObject(gameOver, 2, 2);
        Greenfoot.stop(); 
    }
    
    //keeps track of how many taken squares there are
    public int sum = 0;
    
    //main functionality of the game
    public void play()
    { 
        //checks the turn, and adds the object accordingly
        if(Greenfoot.mouseClicked(null)){
            MouseInfo info = Greenfoot.getMouseInfo();
            int x = info.getX();
            int y = info.getY();
            if(getTurn()){
                addObject(new Circle(), x, y);
                sum++;
                changeTurn();
            }
            else{
                addObject(new Cross(), x, y);
                sum++;
                changeTurn();
            }
        }
    }
}
