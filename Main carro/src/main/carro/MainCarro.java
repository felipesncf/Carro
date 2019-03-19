/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.carro;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class MainCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ligarcarro;
        double acelera;
        int marcha;
        
        carro Ferrari = new carro();
        
        Ferrari.setModelo(JOptionPane.showInputDialog("Insira o modelo do carro: "));
        Ferrari.setCor(JOptionPane.showInputDialog("Insira a cor do carro: "));
        Ferrari.setvA(Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade atual: ")));
        Ferrari.setvM(Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade maxima do carro: ")));
        
        int menu=50;
        while(menu!=0){
            menu=Integer.parseInt(JOptionPane.showInputDialog("Insira a area desejada: \n 1.Liga/Desliga. \n2.Acelera. \n3.Pegar Marcha. \n0.Sair"));
            
            if(menu==1){
                ligarcarro=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ligar o carro."));
                if(Ferrari.liga(ligarcarro)){
                    JOptionPane.showMessageDialog(null, "O carro esta ligado!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "O carro esta desligado!");
                }
            }
           
            if(menu==2){
                acelera=Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade que voce deseja acrescentar: "));
                if(Ferrari.acelerar(acelera)){
                    JOptionPane.showMessageDialog(null, "A velocidade atual do carro eh: " + Ferrari.getvA());
            }
                else{
                    JOptionPane.showMessageDialog(null, "Voce excedeu o limite de velocidade e bateu o carro");
                }
        }
            
            if(menu==3){
                JOptionPane.showMessageDialog(null, Ferrari.pegaMarcha());
            }
        
    }
    }
}
