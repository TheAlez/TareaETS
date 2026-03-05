/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaets;

/**
 *
 * @author Ale
 */
public class TareaETS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nunu=67;
        
        
        // keloke aki juanjo 
         int espaciosBlancos = 0;
        int asteriscos = 2 * nunu - 1;
        
        for (int fila = nunu; fila >= 1; fila--) {
            for (int columnavacia = 1; columnavacia <= espaciosBlancos; columnavacia++) {
                System.out.print(" ");
            }
            for (int columna =1; columna <= asteriscos; columna++) {   
                System.out.print("*");
            }
            espaciosBlancos++;
            asteriscos -= 2;
            System.out.println();
            
        }
    }
    
}
