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
    public int f;
    private boolean celula = false;
    
    public Influencia(){
        
    }

    public Influencia(int x, int y) {
        super(x, y);
        setCor(5);
    }
    
    /**metodo mover implementado do IMoveable,se utiliza do generator para selecionar as opções do switch */
    @Override
    public void mover() {
        switch(generator.nextInt(3)){
            case 0:
                setX(getX()-getVelocidade());
                if(getX()<1){
                    setX(28);
                }
                break;
            case 1:
                setX(getX()+getVelocidade());
                if(getX()>28){
                    setX(1);
                }
                break;
            case 2:
                setY(getY()-getVelocidade());
                if(getY()<1){
                    setY(58);
                }
                break;
            case 3:
                setY(getY()+getVelocidade());
                if(getY()>58){
                    setY(1);
                }
                break;
                default:
                break;
        }
    }
    
    
    public boolean estaNaCelula(){
        setCelula(true);
        return true;
    }

    public boolean isCelula() {
        return celula;
    }

    public void setCelula(boolean celula) {
        this.celula = celula;
    }
    

}
