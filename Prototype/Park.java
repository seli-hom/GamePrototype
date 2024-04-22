import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Park here.
 * Park is where the hunter tries to defend himself against the squirrel throwing nuts at him
 * @author (Selihom Efrem Ogbe) 
 * @version (19/04/2024)
 */
public class Park extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public Park()
    {
        super(600,400,1,false);
        
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 /60;
        prepare();
    }
    
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
    public void act()
    {
        timeStepDuration = (System.currentTimeMillis()  - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Squirrel squirrel = new Squirrel();
        addObject(squirrel,552,55);
        Hunter hunter = new Hunter();
        addObject(hunter,173,335);
    }
}
