/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quien.es.quien;

import java.util.Scanner;

/**
 *
 * @author Francisco Ruiz Nieto
 */
public class QuienEsQuien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); // Inicializamos el escaner de teclado
        System.out.println("Vamos a jugar quién es quién.");
        String sombrero1, bigote1, gafas1;
        boolean sombrero2, bigote2, gafas2;
        while(true){
            //Comprobamos los atributos que tiene el personaje (sombrero, gafas y bigote)
            System.out.println("¿Tiene sombrero tu personaje? (si/no)");
            sombrero1 = teclado.next();
            if("Si".equalsIgnoreCase(sombrero1)){
                sombrero2 = true;
            } else {
                sombrero2 = false;
            }
            System.out.println("¿Tiene bigote tu personaje? (si/no)");
            bigote1 = teclado.next();
            if("Si".equalsIgnoreCase(bigote1)){
                bigote2 = true;
            } else {
                bigote2 = false;
            }
            System.out.println("¿Tiene gafas tu personaje? (si/no)");
            gafas1 = teclado.next();
            if("Si".equalsIgnoreCase(gafas1)){
                gafas2 = true;
            } else {
                gafas2 = false;
            }
            
            
            //Comparamos el texto almacenado en la string con si y no para saber que personaje es
            
            // "si".equals(String) compara si el texto guardado en la String es "si".
            if(bigote2 && sombrero2 && gafas2){
                System.out.println("Tu personaje es Antonio.");
                break; //Al imprimir un nombre pedimos que el juego se cierre directamente
            } else if (bigote2 && !sombrero2 && !gafas2){
                System.out.println("Tu personaje es Daniel.");
                break; 
            } else if (!bigote2 && !sombrero2 && gafas2){
                System.out.println("Tu personaje es Rafa.");
                break; 
            } else if (!bigote2 && sombrero2 && !gafas2){
                System.out.println("Tu personaje es Marcos.");
                break; 
            } else {
                System.out.println("Personaje erróneo, introduce los datos de nuevo.");
                //En caso de personaje erróneo el programa se incia de nuevo
            }
        }
        
        
/*        boolean sombrero, gafas, bigote;
        
        System.out.println("Vamos a jugar a quién es quién");
        
        do{
            System.out.println("¿Tiene sombrero tu personaje? (true/false)");       
            sombrero = teclado.nextBoolean();
            System.out.println("¿Tiene gafas tu personaje? (true/false)");
            gafas = teclado.nextBoolean();
            System.out.println("¿Tiene bigote tu personaje? (true/false)");
            bigote = teclado.nextBoolean();
        
            if(sombrero && gafas && bigote){
                System.out.println("Tu personaje es Antonio.");
            } else if (bigote && !sombrero && !gafas){
                System.out.println("Tu personaje es Daniel.");
            } else if (gafas && !sombrero && !bigote){
                System.out.println("Tu personaje es Rafa.");
            } else if (sombrero && !gafas && !bigote){
                System.out.println("Tu personaje es Marcos.");
            } else {
                System.out.println("Personaje erróneo, introduce los datos de nuevo.");
            }
        }while (!bigote && !gafas && !sombrero);
*/
    }
    
}
