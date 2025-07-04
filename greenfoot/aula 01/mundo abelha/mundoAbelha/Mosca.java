import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mosca extends Inseto
{
    //Fields
    private int velocidade;
    private int rotacao;
    //Contructor padrao
    public Mosca(){
        velocidade = 1;
        rotacao = 0;
    }
    //contructor com parametro
    public Mosca(int vel,int rot){
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        if(Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(90));
            
        }
        if(isAtEdge()){ //esta em um canto
            turn(180);
    }
}
}
