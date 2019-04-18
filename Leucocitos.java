/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author ka-ro
 */
public class Leucocitos extends Celulas implements IMoveable{

    Random generator = new Random();

    
    private int velocidade = 2;
    private Date data = new Date();
    private Date d;
    private int t;
    public Leucocitos(){
        
    }
    public Leucocitos(int x , int y){
        super(x,y);
        setCor(6);
        
    }

    /**
     *
     * @param x
     * @param y
     * @param d
     */
    public Leucocitos (int x ,int y, Date d){
        this.setX(x);
        this.setY(y);
        this.setData(d);
        
    }
    
    
    
    /**metodo mover implementado do IMoveable,se utiliza do generator para selecionar as opções do switch */
    @Override
    public void mover() {

        
        switch(generator.nextInt(7)){
            case 0:
                setX(getX()-velocidade);
                if(getX()<1){
                    setX(28);
                }
                break;
            case 1:
                setX(getX()+velocidade);
                if(getX()>28){
                    setX(1);
                }
                break;
            case 2:
                setY(getY()-velocidade);
                if(getY()<1){
                    setY(58);
                }
                break;
            case 3:
                setY(getY()+velocidade);
                if(getY()>58){
                    setY(1);
                }
                break;
            case 4:
                setY(getY()+velocidade);
                setX(getX()+velocidade);
                if(getY()>58){
                    setY(1);
                }if(getX()>28){
                    setX(1);
                }
                break;
            case 5:
                setY(getY()+velocidade);
                setX(getX()-velocidade);
                if(getY()>58){
                    setY(1);
                }if(getX()<1){
                    setX(28);
                }
                break;
            case 6:
                setY(getY()-velocidade);
                setX(getX()+velocidade);
                if(getY()<1){
                    setY(58);
                }if(getX()>28){
                    setX(1);
                }
                break;
            case 7:
                setY(getY()-velocidade);
                setX(getX()-velocidade);
                if(getY()<1){
                    setY(58);
                }if(getX()<1){
                    setX(28);
                }
                break;
            default:
                break;
        }
        
        
        
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

   
    
    
    
}
