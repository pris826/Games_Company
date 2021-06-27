/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc;

import java.util.ArrayList;

/**
 *
 * @author Priscila
 */
public class VGC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> figuras= new ArrayList<Figura>();
        ArrayList<String> franquicias= new ArrayList<String>();
        franquicias.add("Marvel");
        franquicias.add("DC");
        franquicias.add("Capcom");
        Menu menu= new Menu(figuras, franquicias);
        menu.setVisible(true);
    }
    
}
