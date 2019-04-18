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
public class Cabeca {
    /** variavel que gera numeros aleatorios*/
    Random generator = new Random();
    /* matriz que gera o mapa*/
    public int mapa[][] = new int[30][60];
    /**variavel que instancia o project*/
    Project menu = new Project();
    /**variavel que instancia o Virus*/
    Virus gripe = new Virus();
    /**variavel que instancia a influencia*/
    Influencia flu = new Influencia();
    /**variavel que instancia o Leucocitos*/
    Leucocitos leo = new Leucocitos();
    /**ArrayList de Celulas Olhos*/
    ArrayList <CelulasOculares> olhoss = new ArrayList();
    /**ArrayList de Celulas Nasais*/
    ArrayList <CelulasNasais> nariz = new ArrayList();
    /**ArrayList de Celulas boca*/
    ArrayList <CelulasBoca> boca = new ArrayList();
    /**ArrayList de leucocitos*/
    ArrayList <Leucocitos> defesa = new ArrayList();
    /**ArrayList de Influencia*/
    ArrayList <Influencia> ataque = new ArrayList();
    
    public int i= 0;
    public int j = 0;
    public String paint;
    /**função que define o x e o y dos olhos*/
    public void criaOlhos(){
        for(int i=11;i<15;i++){
            for(j=11;j<15;j++){
                olhoss.add(new CelulasOculares(i,j));
            }
        }
        for(int i=11;i<15;i++){
            for(j=41;j<45;j++){
                olhoss.add(new CelulasOculares(i,j));
            }
        }
    }
    /**função que define o x e o y do nariz*/
    public void criaNariz(){
        for(i=17;i<21;i++){
            for(j=24;j<26;j++){
                nariz.add(new CelulasNasais(i,j));
            }
        }
    }
    /**função que define o x e o y da boca*/
    public void criaBoca(){
        for(i=26;i<28;i++){
            for(j=20;j<40;j++){
                boca.add(new CelulasBoca(i,j));
            }
        }
    }
    /**função que define o x e o y dos virus de forma aleatoria, utiliza influencia*/
    public void criaVirus(){
        ataque.add(new Influencia(generator.nextInt(29),generator.nextInt(59)));
        
    }
    /**função que define o x e o y dos virus de forma aleatoria*/
    public void criaLeu(){
        defesa.add(new Leucocitos(generator.nextInt(29),generator.nextInt(59)));
    }
    /**função que soma ou subtrai x e y da arraylist ataque,de forma aleatoria*/
    public void moverVirus(){
        
       for(i=0;i<ataque.size();i++){
       
       ataque.get(i).mover();
       
       }
       
    }
    /*função que soma ou subtrai x e y da arraylist defesa,de forma aleatoria*/
    public void moverLeu(){
        
       for(i=0;i<defesa.size();i++){
       
       defesa.get(i).mover();
       
       }
       
    }
    /**remove um objeto da arraylist ataque*/
    public void removerVirus(int i){
        
        ataque.remove(i);
       
    }
    
     /**remove um objeto da arraylist defesa*/
    public void removerLeu(int i){
        defesa.remove(i);
    }
    
    /**definir o tempo e remover objetos da arratlist defesa,são removidos a partir de 10 unidades a cada 7 sec*/
    public void atl(){
        Date var = new Date();
        for(int k =0; k<defesa.size();k++){
            if(defesa.size()>10){
                long segT = defesa.get(k).getData().getSeconds();
                long segG = var.getSeconds();
                long seg = segG - segT;
                if(seg == 7){
                    removerLeu(k);
                }
            }
        }
    }
    
    /**função que controi,atualiza e gera a colisão dentro da matriz mapa*/    
    public void desenharCabeca(){
    /*reinicia a matriz*/
    for(i=0;i<30;i++){
        for(j=0;j<60;j++){
            mapa[i][j]=0;
        }
    }
    /**controi as bords*/
    for(j=0;j<30;j++){
       mapa[j][0] = 1;
       mapa[j][59] = 1;
       
    }
       
    for(j=0; j<60; j++ ){
        mapa[0][j] = 1;
        mapa[29][j] = 1;
        
    }
    
    
    /**define o valor da posição x e y da mariz, a partir desse valor sera definido a cor*/
    for(i=0;i<olhoss.size();i++){
       mapa[olhoss.get(i).getX()][olhoss.get(i).getY()]= olhoss.get(i).getCor();
    }
    for(i=0;i<nariz.size();i++){
       mapa[nariz.get(i).getX()][nariz.get(i).getY()]= nariz.get(i).getCor();
    }
    
    for(i=0;i<boca.size();i++){
       mapa[boca.get(i).getX()][boca.get(i).getY()]= boca.get(i).getCor();
    }
    
    for(i=0;i<ataque.size();i++){
       mapa[ataque.get(i).getX()][ataque.get(i).getY()]= ataque.get(i).getCor();
       
    }
    
    for(i=0;i<defesa.size();i++){
       mapa[defesa.get(i).getX()][defesa.get(i).getY()]= defesa.get(i).getCor();
      
    }
    /** caso o x e o y de uns dos valores dos virus seja iguas a alguma celula gerara um resultado*/
    for(i=0;i<ataque.size();i++){
        /*caso colida remove e cria 2 virus*/
        for(j=0;j<nariz.size();j++){
            if(ataque.get(i).getX()==nariz.get(j).getX()){

                if(ataque.get(i).getY()==nariz.get(j).getY()){
                    criaVirus();
                    criaVirus();
                    removerVirus(i);
                }
           }
        }
        /**caso colida remove e cria 2 virus*/
        for(j=0;j<olhoss.size();j++){
            if(ataque.get(i).getX()==olhoss.get(j).getX()){
                if(ataque.get(i).getY()==olhoss.get(j).getY()){

                    criaVirus();
                    criaVirus();
                    removerVirus(i);
                }
            }
        }
        /**caso colida remove e cria 2 virus*/
        for(j=0;j<boca.size();j++){
            if(ataque.get(i).getX()==boca.get(j).getX()){
                if(ataque.get(i).getY()==boca.get(j).getY()){

                    criaVirus();
                    criaVirus();
                    removerVirus(i);
                }
            }
        }
        /**caso colida remove virus e cira leucocito*/
        for(j=0;j<defesa.size();j++){
            if(ataque.get(i).getX()==defesa.get(j).getX()){
                if(ataque.get(i).getY()==defesa.get(j).getY()){
                    removerVirus(i);
                    criaLeu();
                }
            }
            
            
        }
    }
                    
    
    
    
    
    /**definir a cor baseado no valor da matriz*/
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
            case 6:
                paint ="\u001B[45m";//roxo
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
