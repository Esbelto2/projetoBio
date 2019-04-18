/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ka-ro
 */
public abstract class Celulas {
    //atributos
    private int x;
    private int y;
    private int cor;
    
    public Celulas (){
    
    }
    /**construtor*/
    public Celulas(int x ,int y){
        this.x = x;
        this.y = y;
    }
    
    
    /**metodos*/

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
    
    
}
