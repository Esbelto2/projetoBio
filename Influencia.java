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
public class Influencia extends Virus{
    
    private boolean celula = false;

    public Influencia(int x, int y) {
        super(x, y);
    }
    
    public boolean estaNaCelula(){
        return true;
    }
    
}
