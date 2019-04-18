/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author ka-ro
 */
public class Project {
    public static boolean key = true;
 
    
    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        Random generator = new Random();
        Date data = new Date();
        
        
        Virus influ = new Influencia();
        Cabeca head = new Cabeca();
        int cont=0;
        
    /**inicio e loop do programa*/  
        head.criaVirus();
        head.criaVirus();
        head.criaVirus();
        head.criaVirus();
        head.criaVirus();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        head.criaLeu();
        
        
        while(key==true){
            boolean on = true;
            Calendar calendar = Calendar.getInstance();
            try{
                Thread.sleep(1000);
                
            }catch(Exception e){
                    
            }
            
            head.criaOlhos();
            head.criaBoca();
            head.criaNariz();
            head.desenharCabeca();
            System.out.println("leucocitos:" + head.defesa.size());
            System.out.println("virus:" + head.ataque.size());
            System.out.println("Time:"+calendar.get(Calendar.SECOND));
            int i;
            int j;
            head.moverVirus();
            head.moverLeu();
            head.atl();
   
                
               
   
            cont++;
        }
    }    
}
    

