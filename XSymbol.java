import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the image X for tic tac toe
 * 
 * @Liyu 
 * @Dec 2022
 */
public class XSymbol extends Actor
{
    //resize the shape
    GreenfootImage X = new GreenfootImage("images/x.png");
    public XSymbol(){
        X.scale(100,100);
        setImage(X);
    }
    public void act()
    {
        // Add your action code here.
    }
}
