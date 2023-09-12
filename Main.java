import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Delcaramos las variables a usar
        Scanner entrada = new Scanner(System.in);

        int matriz[][], nfil, ncol; //Instanciamos la matriz, las variables para las filas y columnas
        boolean simetrica = true; //Definimos una variable booleana para verificar si es simetrica o no

        nfil = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de las matriz: ")); //Pedimos que nos diga cuantas filas va tener
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de las matriz: ")); //Pedimos que nos diga cuantas columnas va tener

        matriz = new int[nfil][ncol]; //Definimos el tamaño de la matriz con las filas y columnas que ingreso el usuario

        for(int f=0; f<nfil ; f++){ //Primero for cuenta las filas y almacena los datos
            for(int c=0 ; c<ncol ; c++) { //Segundo for cuenta las columnas y almacena los datos
                System.out.println("Digite los elementos de la matriz: ");
                matriz[f][c] = entrada.nextInt(); //Por ultimo pedimos los datos al usuario y lo guardamos en la matriz de f filas y c columnas
            }
        }
        if(nfil == ncol) { //Hacemos la logica, para que sea simetrica debe ser de igual filas y columnas

            int f = 0, c = 0;
            while (f < nfil && simetrica == true) { //Hacemos doble while para poder recorrer la matriz
                while (c < ncol && simetrica == true) {
                    if (matriz[f][c] != matriz[c][f]) { //Si la matriz transpuesta es diferente, la simetria no se cumple
                        simetrica = false; //Por lo tanto simetrica es falso

                    }
                    c++; //Corremos una columna para poder seguir evaluando una por una
                }
                f++; //Corremos una fila para poder seguir evaluando una por una
            }
            if(simetrica == true){ //Casos fuera del while, si se cumple la simetria.
                JOptionPane.showMessageDialog(null,"La matriz es  simetrica. "); //Le informamos al usuario que es simetrica


            }else{ //Caso contrario no es simetrica
                    JOptionPane.showMessageDialog(null,"La matriz no es simetrica"); //Se le informa al usario que no es simetrica
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica.");

        }
        //Mostramos la matriz
        System.out.println("Matriz Ingresada: ");
        for(int f=0; f<nfil ; f++){ //Primero for cuenta las filas y almacena los datos
            for(int c=0 ; c<ncol ; c++) { //Segundo for cuenta las columnas y almacena los datos
                System.out.print("["+matriz[f][c]+"] "+" ");

            }
            System.out.println(" ");
        }
    }
}
