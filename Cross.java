import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Cross class, sets the image of an X used in 
 * the boardpiece class
 * 
 * Liyu Xiao 
 * Jan 10 2023
 */
public class Cross extends Actor
{
    GreenfootImage[] cross = new GreenfootImage[6];
    //Sets and scales the images of the cross
    public Cross(){
        for(int i = 0; i < cross.length; i++){
            cross[i] = new GreenfootImage("images/Cross_animate/cross" + i + ".png");
            cross[i].scale(145,145);
        }
        setImage(cross[0]);
    }
    
    //animates the cross
    int imageIndex = 0;
    SimpleTimer animationTimer = new SimpleTimer();
    public void animate(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        else{
            setImage(cross[imageIndex]);
            imageIndex = (imageIndex + 1) % cross.length;
        }
    }
    
    public void act(){
        animate();
    }
}
