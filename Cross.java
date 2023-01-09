import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Cross class, sets the image of an X used in 
 * the boardpiece class
 * 
 * Liyu Xiao 
 * Jan 2023
 */
public class Cross extends Actor
{
    //Sets the image of the cross
    GreenfootImage x = new GreenfootImage("images/x.png");
    public Cross(){
        x.scale(145,145);
        setImage(x);
    }
}
