import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Circle class, sets the image of a circle
 * used in the board piece class
 * 
 * Liyu Xiao
 * January 9 2023
 */
public class Circle extends Actor
{
    //Sets the image of the circle
    GreenfootImage circle = new GreenfootImage("images/circle.png");
    public Circle(){
        circle.scale(145,145);
        setImage(circle);
    }
}
