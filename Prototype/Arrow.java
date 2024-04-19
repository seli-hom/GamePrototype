import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    
    private static final double GRAVITY = 9.8 * 200;
    
    public Arrow() 
    {
        position = null;
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
    }
    
    public void act()
    {
        updatePhysics();
    }
    
    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }
    public void updatePhysics()
    {
        if (position == null)
        {
            position = new Point2D(getX(), getY());
        }
        
        Park world = (Park) getWorld();
        double dt = world.getTimeStepDuration();
        
        //update velocity
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);
        
        //update position
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
        //set new actor position
        setLocation((int) position.getX(), (int) position.getY);
    }
}
