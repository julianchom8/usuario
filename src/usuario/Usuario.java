/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static int suma(){
        
        
        
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x=0;
        int y=0;
        int total;
        
        System.out.println("digite primer valo: "+x);
        x = leer.nextInt();
        
        System.out.println("digite segundo valor"+y);
        y= leer.nextInt();
        total=x+y;
        System.out.println(total);
    }
    
}
