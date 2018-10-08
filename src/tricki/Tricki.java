/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tricki;

import java.util.Scanner;

/**
 *
 * @author Helder Castrillon
 */
public class Tricki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // char marcas[][]= new char[2][2];
       Scanner leer = new Scanner(System.in); 
       char marcas[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
       char marca=' ';
       boolean ganar=false;
       boolean tiroValido=false;
       String jugadorActual;
        System.out.println("#####  Vamos a Jugar tricki #####");
        System.out.println("Ingrese el primer jugador");
        String jugador1= leer.next();
        jugadorActual=jugador1;
        System.out.println("Ingrese el segudo jugador");
        String jugador2= leer.next();
        do{
        System.out.println("Es tu turno de tirar :"+ jugadorActual);
        
        
        if(jugadorActual.equals(jugador1)){
            marca='X';
            jugadorActual=jugador2; //cambia de turno
        }
        else{
            marca='O';
            jugadorActual=jugador1; //cambia de turno
        }
        do{
            System.out.println("Digite la posición en X");
            int posX=leer.nextInt();
            System.out.println("Digite la posición en Y");
            int posY= leer.nextInt();
            tiroValido=false;
            if( marcas[posX][posY]==' '){
                marcas[posX][posY]=marca;
                tiroValido=true;
            }
            else{
                tiroValido=false;
                System.out.println("La posición en el tricki no está disponible");
            }
        }while(tiroValido==false);
        
        System.out.printf("[%c][%c][%c]\n",marcas[0][0],marcas[0][1],marcas[0][2]);
        System.out.printf("[%c][%c][%c]\n",marcas[1][0],marcas[1][1],marcas[1][2]);
        System.out.printf("[%c][%c][%c]\n",marcas[2][0],marcas[2][1],marcas[2][2]);
        //verificar que el jugador ganó
        if(marcas[0][0]==marcas[0][1] && marcas[0][0]==marcas[0][2] && marcas[0][0]!=' '){
            ganar=true;
        }
        else if(marcas[1][0]==marcas[1][1] && marcas[1][0]==marcas[1][2] && marcas[1][0]!=' '){
            ganar=true;
        }
       else if(marcas[2][0]==marcas[2][1] && marcas[2][0]==marcas[2][2] && marcas[2][0]!=' '){
            ganar=true;
        }
        /// gana en y
        
       else if(marcas[0][0]==marcas[1][0] && marcas[0][0]==marcas[2][0] && marcas[0][0]!=' '){
            ganar=true;
        }
       else if(marcas[0][1]==marcas[1][1] && marcas[0][1]==marcas[2][1] && marcas[0][1]!=' '){
            ganar=true;
        }
       else if(marcas[0][2]==marcas[1][2] && marcas[0][2]==marcas[2][2] && marcas[0][2]!=' '){
            ganar=true;
        }
       //diagonal
        else if(marcas[0][0]==marcas[1][1] && marcas[0][0]==marcas[2][2] && marcas[0][0]!=' '){
            ganar=true;
        }
       else if(marcas[0][2]==marcas[1][1] && marcas[0][2]==marcas[2][0] && marcas[0][2]!=' '){
            ganar=true;
        }
        else
       {
           ganar=false;
       }
        }while(ganar==false);
        
        
    }
    
}
