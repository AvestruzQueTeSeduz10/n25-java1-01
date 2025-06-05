import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * definição da classe BeeWorld
 * 
 * @author Cristiano Ronaldo  
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abelha abelha = new Abelha();
        addObject(abelha,295,175);
        Aranha aranha = new Aranha();
        addObject(aranha,90,180);
        Mosca mosca = new Mosca();
        addObject(mosca,496,128);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,489,186);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,491,243);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,496,306);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,512,63);
        Duke duke = new Duke();
        addObject(duke,27,569);
        abelha.move(20);
    }
}
