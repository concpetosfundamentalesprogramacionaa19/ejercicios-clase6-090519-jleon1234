/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Desarrollar una palicacion que me permita ingresar placas de carros,
            se asume que las placas ingresadas pertenecen a la region costa del ecuador
            en base a la placa nuestro programa determinana y presentara la placa 
            con la provincia a la que pertenece
        */
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su placa: ");
        String placa = entrada.nextLine();
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Su placa pertenece a la provincia: %s", "El Oro");
                break;
            
            case 'e':
            case 'E':
                System.out.printf("Su placa pertenece a la provincia: %s", "Esmeraldas");
                break;
            case 'g':
            case 'G':
                System.out.printf("Su placa pertenece a la provincia: %s", "Guayas");
                break;  
                
            case 'r':
            case 'R':
                System.out.printf("Su placa pertenece a la provincia: %s", "Los Rios");
                break;  
                
            case 'm':
            case 'M':
                System.out.printf("Su placa pertenece a la provincia: %s", "Manabi");
                break;
                
            case 'y':
            case 'Y':
                System.out.printf("Su placa pertenece a la provincia: %s", "Santa Elena");
                break;  
            
            default:
                System.out.println("Su placa no pertenece a la costa");
                
        }
        
    }
}
