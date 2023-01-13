import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen class, the screen that pops up
 * when you enter the game.
 * Liyu Xiao
 * @Jan 10 2023
 */
public class TitleScreen extends World
{
    
    public TitleScreen()
    {    
        super(580, 450, 1); 
        GreenfootImage image = getBackground();
        image.scale(1400,1200);
        setBackground(image);
        prepare();
    }
    //if space is pressed it will transfer user to the game
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            TicTacToe gameWorld = new TicTacToe();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * sets all the labels on the title screen
     */
    private void prepare()
    {
        Label label = new Label("Tic Tac Toe", 70);
        label.setFillColor(Color.BLACK);
        addObject(label,350,190);
        label.setLocation(260,150);
        Label label2 = new Label("By: Liyu Xiao", 70);
        label2.setFillColor(Color.BLACK);
        addObject(label2,260,231);
        Label label3 = new Label("Press <space> to start", 50);
        label3.setFillColor(Color.BLACK);
        addObject(label3,260,303);
        Label label4 = new Label("left click to put down pieces", 30);
        label4.setFillColor(Color.BLACK);
        addObject(label4,260,394);
    }
}
