/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federico
 */
public class SeaWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new SeaWar();
    }
    
    public SeaWar(){
        System.out.println("Hi");
        GUI gui = new GUI();
        gui.setVisible(true);
    }
    
}
