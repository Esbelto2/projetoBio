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
public class Cabeca {
    Random generator = new Random();
    public int mapa[][] = new int[30][60];
    
    //CelulasBoca boca = new CelulasBoca();
    //CelulasNasais nariz = new CelulasNasais();
    //CelulasOculares olhos = new CelulasOculares();
    ArrayList <CelulasOculares> olhoss = new ArrayList();
    ArrayList <CelulasNasais> nariz = new ArrayList();
    ArrayList <CelulasBoca> boca = new ArrayList();
    ArrayList <Leucocitos> defesa = new ArrayList();
    ArrayList <Virus> ataque = new ArrayList();
    
    public int i= 0;
    public int j = 0;
    public String paint;
    
    public void criaOlhos(){
        for(int i=11;i<15;i++){
            for(j=11;j<15;j++){
                olhoss.add(new CelulasOculares(i,j));
            }
        }
    }
        
    public void criaNariz(){
        for(i=17;i<21;i++){
            for(j=24;j<26;j++){
                nariz.add(new CelulasNasais(i,j));
            }
        }
    }
    
    public void criaBoca(){
        for(i=26;i<28;i++){
            for(j=28;j<30;j++){
                boca.add(new CelulasBoca(i,j));
            }
        }
    }
    
    
    
    public void desenharCabeca(){

    for(j=0;j<30;j++){
       mapa[j][0] = 1;
       mapa[j][59] = 1;
    }
       
    for(j=0; j<60; j++ ){
        mapa[0][j] = 1;
        mapa[29][j] = 1;
         
    }
    for(i=0;i<olhoss.size();i++){
       mapa[olhoss.get(i).getX()][olhoss.get(i).getY()]= olhoss.get(i).getCor();
    }
    for(i=0;i<nariz.size();i++){
       mapa[nariz.get(i).getX()][nariz.get(i).getY()]= nariz.get(i).getCor();
    }
    
   // mapa[11][12]= 3;//olhos.getCor();
    //mapa[11][13]= olhos.getCor();
    //mapa[11][14]= olhos.getCor();
    //mapa[12][11]= olhos.getCor();
    //mapa[13][11]= olhos.getCor();
    //mapa[14][11]= 3;//olhos.getCor();
        for(i=0;i<30;i++){
            
            for(j=0;j<60;j++){
                switch(mapa[i][j]){
            case 0:
                paint = "\u001B[40m";//Black
                break;
            case 1:
                paint = "\u001B[47m";//white
                break;
            case 2:
                paint = "\u001B[43m";//yellow
                break;
            case 3:
                paint = "\u001B[44m";//blue
                break;
            case 4:
                paint = "\u001B[41m";//red
                break;
            case 5:
                paint = "\u001B[42m";//green
                break;
            default:
                break;
                
                }
                System.out.print(paint + " " + "\u001B[0m");
            }
         System.out.println();   
        }
        System.out.println();
        System.out.println();
    }
    
}
