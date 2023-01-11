import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Screen that pops up when the game has ended
 * 
 * Liyu Xiao 
 * Jan 11 2023
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.isKeyDown("1")){
            TicTacToe gameWorld = new TicTacToe();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("2")){
            TicTacToe gameWorld = new TicTacToe();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Sets all the labels for the end Screen
     */
    private void prepare()
    {
        Label label = new Label("Play Again?", 50);
        addObject(label,296,149);
        label.setLocation(310,108);
        Label label2 = new Label("If yes press space", 50);
        addObject(label2,111,218);
        label2.setLocation(164,206);
        label2.setLocation(308,180);
        Label label3 = new Label("If no press 2", 50);
        addObject(label3,297,277);
        label3.setLocation(303,267);
    }
}
