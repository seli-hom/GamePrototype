import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Park here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Park extends World
{
    private long lastFrameTimeMs;
    private double timeStepDuration;

    /**
     * Constructor for objects of class Park.
     * 
     */
    public Park()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
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
