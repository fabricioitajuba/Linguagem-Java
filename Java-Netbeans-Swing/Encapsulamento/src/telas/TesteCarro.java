/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Carro;

/**
 *
 * @author fabricio
 */
public class TesteCarro {
    
    public static void main(String[] args) {

        Carro van = new Carro();
		
        van.setMarca("Fiat");
        System.out.println(van.getMarca());
        van.setModelo("Uno");
        System.out.println(van.getModelo());
    }    
}
