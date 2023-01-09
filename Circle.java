import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
