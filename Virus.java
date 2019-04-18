/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Random;

/**
 *
 * @author ka-ro
 */
public class Virus implements IMoveable {
    
    private int x;
    private int y;
    private int cor;
    private int velocidade = 1;
    
    public Virus(){
        
    }
    
    public Virus(int x , int y){
        this.x=x;
        this.y=y;
    }
    Random generator = new Random();
    /**metodo mover implementado do IMoveable,se utiliza do generator para selecionar as opções do switch */
    @Override
    public void mover() {
        switch(generator.nextInt(3)){
            case 0:
                x=x-velocidade;
                break;
            case 1:
                x=x+velocidade;
                break;
            case 2:
                y=y-velocidade;
                break;
            case 3:
                y=y+velocidade;
                break;
                default:
                break;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Random getGenerator() {
        return generator;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }
    
    
    
    
}
