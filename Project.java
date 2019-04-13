/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ka-ro
 */
public class Project {
    public static boolean key = true;
    ArrayList <Virus> ataque = new ArrayList();
    Random generator = new Random();
    /**
     * @param args the command line arguments
     */
    
    public void generateVirus(){
        
            ataque.add(new Virus(generator.nextInt(29),generator.nextInt(59)));
        
    }
    public static void main(String[] args) {
        
        
        Cabeca head = new Cabeca();
        while(key==true){
            head.criaOlhos();
            head.criaBoca();
            head.criaNariz();
            head.desenharCabeca();
        }
        
        
    }
    
}
