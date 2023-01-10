import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Liyu Xiao
 * @Jan 10 2023
 */
public class TitleScreen extends World
{

    /**
     * Title Screen class, the screen that pops up
     * when you enter the game.
     * 
     */
    public TitleScreen()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * 
     */
    private void prepare()
    {
        Label label = new Label("Tic Tac Toe", 70);
        addObject(label,308,190);
        label.setLocation(303,128);
        Label label2 = new Label("By: Liyu Xiao", 70);
        addObject(label2,298,231);
        label2.setLocation(327,231);
        label2.setLocation(304,216);
        Label label3 = new Label("Press any key to start", 50);
        addObject(label3,287,303);
        label3.setLocation(378,295);
        label3.setLocation(360,294);
        label3.setLocation(348,292);
        label3.setLocation(320,299);
    }
}
