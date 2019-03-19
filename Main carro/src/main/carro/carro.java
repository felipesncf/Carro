/*,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.carro;

/**
 *
 * @author pioca_000
 * 
 */
public class carro {
    private String cor;
    private String modelo;
    private double vA;
    private double vM;
    
    public boolean liga(int opcao){
        if(opcao==1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean acelerar(double velo){
        velo = velo + this.getvA();
        this.setvA(velo);
        if(velo<=this.getvM()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int pegaMarcha(){
        if(this.getvA()<=20){
            return 1;
        }
        if(this.getvA()>20 && this.getvA()<=40){
            return 2;
        }
        if(this.getvA()>40 && this.getvA()<=70){
            return 3;
        }
        if(this.getvA()>70 && this.getvA()<=100){
            return 4;
        }
        if(this.getvA()>100){
            return 5;
        }
        return 0;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the vA
     */
    public double getvA() {
        return vA;
    }

    /**
     * @param vA the vA to set
     */
    public void setvA(double vA) {
        this.vA = vA;
    }

    /**
     * @return the vM
     */
    public double getvM() {
        return vM;
    }

    /**
     * @param vM the vM to set
     */
    public void setvM(double vM) {
        this.vM = vM;
    }
    
}

