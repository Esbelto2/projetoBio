/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author ka-ro
 */
public class Leucocitos extends Celulas implements IMoveable{

    Random generator = new Random();
    private int velocidade = 2;
    //private data = new Date();
    public Leucocitos(int x , int y){
        super(x,y);
        setCor(5);
    }

    @Override
    public void mover() {

        
        switch(generator.nextInt(7)){
            case 0:
                setX(getX()-velocidade);
                break;
            case 1:
                setX(getX()+velocidade);
                break;
            case 2:
                setY(getY()-velocidade);
                break;
            case 3:
                setY(getY()+velocidade);
                break;
            case 4:
                setY(getY()+velocidade);
                setX(getX()+velocidade);
                break;
            case 5:
                setY(getY()+velocidade);
                setX(getX()-velocidade);
                break;
            case 6:
                setY(getY()-velocidade);
                setX(getX()+velocidade);
                break;
            case 7:
                setY(getY()-velocidade);
                setX(getX()-velocidade);
                break;
            default:
                break;
        }
        
        
        
    }

    public int getVelocidade() {
        return velocidade;
    }
        
    
    
}
