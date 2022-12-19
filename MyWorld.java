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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        XSymbol x = new XSymbol();
        CircleSymbol o = new CircleSymbol();
        addObject(x,430,135);
        addObject(o,230,135);
    }
}
