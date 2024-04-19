import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{
    private final static double ARROW_VELOCITY = 1750.0;
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
            Vector2D arrowToMouse = new Vector2D(mouse.getX() - getX(), mouse.getY() - getY());
            
            alignWithVector(arrowToMouse);
            
            if (Greenfoot.mouseClicked(null))
            {
                arrowToMouse.normalize();
                arrowToMouse = Vector2D.multiply(arrowToMouse, ARROW_VELOCITY);
                
                Arrow arrow = new Arrow();
                arrow.setVelocity(arrowToMouse);
                getWorld().addObject(arrow, getX(), getY());
                Greenfoot.playSound("acornHit");
            }
        }
    }
    
    public void alignWithVector(Vector2D v)
    {
        double adjacent = v.getX();
        double opposite = v.getY();
        
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
        
        setRotation((int) angleDegrees);
    }
}
