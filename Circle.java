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
    GreenfootImage[] circle = new GreenfootImage[4];
    //Sets and scales the images of the circle
    public Circle(){
        for(int i = 0; i < circle.length; i++){
            circle[i] = new GreenfootImage("images/Circle_animate/circle" + i + ".png");
            circle[i].scale(145,145);
        }
        setImage(circle[0]);
    }
    
    
    //animates the circle
    int imageIndex = 0;
    SimpleTimer animationTimer = new SimpleTimer();
    public void animate(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        else{
            setImage(circle[imageIndex]);
            imageIndex = (imageIndex + 1) % circle.length;
        }
    }
    
    public void act(){
        animate();
    }
}
