import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootImage board = new GreenfootImage("images/board.png");
    int sum = 1;
    XSymbol X = new XSymbol();
    CircleSymbol O = new CircleSymbol();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
    }
    
    public void act(){
        if(Greenfoot.mousePressed(null)){
            MouseInfo info = Greenfoot.getMouseInfo();
            int x = info.getX();
            int y = info.getY();
            if(y <= 200){
                if(x <= 430 && x >= 340){
                    if(sum%2 == 0){
                        addObject(O, 430,135);
                        sum ++;
                    }
                    else{
                        addObject(X,430,135);
                        sum ++;
                    }
                }
                if(135 <= x && x <= 340){
                    if(sum%2 == 0){
                        addObject(O,235, 135);
                    }
                    else{
                        addObject(X,235,135);
                    }
                }
                if(430 <= x && x <= 600){
                    
                }
                
            }
        }
    }
}
