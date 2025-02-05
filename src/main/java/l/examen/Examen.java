package l.examen;

/*
Edwin Rodriguez
31.117.957
*/
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Este solo sirve para el segundo ejercicio
        
/* Primer ejercicio
        // Primera matriz
            int [][] matriz1 = new int [2][2];
            matriz1[0][0] = 2;
            matriz1[0][1] = 4;
            matriz1[1][0] = 9;
            matriz1[1][1] = 5;

            // Segunda matriz
            int [][] matriz2 = new int [2][2];
            matriz2[0][0] = 1;
            matriz2[0][1] = 3;
            matriz2[1][0] = 7;
            matriz2[1][1] = 8;

            //matriz resultante
            int [][] matrizR = new int [2][2];
            
            //cuarta matriz
            int [][] matriz4 = new int [2][2];
            
            //matriz final
            int [][] matrizF = new int [2][2];
            
            System.out.println("Matriz 1:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz1[i][j] + "\t");
                }
                System.out.println("");
            }


            System.out.println("Matriz 2:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz2[i][j] + "\t");
                }
                System.out.println("");
            }
            
            
            System.out.println("Matriz resultante:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrizR[i][j] = matriz2[i][j] + matriz1[i][j];
                    System.out.print(matrizR[i][j] + "\t");
                    
                }
                System.out.println("");
            }
            

            int contador = 4;
            System.out.println("Matriz4:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matriz4[i][j] = contador;
                    System.out.print(matriz4[i][j] + "\t");
                    contador++;
                    
                }
                System.out.println("");
        }
            
            System.out.println("Matriz final:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrizF[i][j] = matrizR[i][j] * matriz4[i][j];
                    System.out.print(matrizF[i][j] + "\t");
                    
                }
                System.out.println("");
            }
    }
*/
/* Segundo ejercicio
        System.out.println("Ingrese el número de filas:");
        int f = scanner.nextInt();
        
        System.out.println("Ingrese el número de columnas:");
        int c = scanner.nextInt();
        
        int[][] matriz = new int[f][c];
        
        System.out.println("Matriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (23 * Math.pow(i, 4) + 20 * Math.pow(j, 3) - 3);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
*/
/* ejercicio 3       
        int [][] matriz = new int [2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 0;
        matriz[1][0] = 0;
        matriz[1][1] = 1;

        boolean es_identidad = true;
        System.out.println("Matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
                if (i == j && matriz[i][j] != 1) {
                    es_identidad = false;
                } else if (i != j && matriz[i][j] != 0) {
                    es_identidad = false;
                }
            }
            System.out.println();
        }

        if (es_identidad) {
            System.out.println("Es una matriz identidad.");
        } else {
            System.out.println("No es una matriz identidad.");
        }
    }
*/
/* ejercicio 4
        int [][] matriz = new int [3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 0;
        matriz[0][2] = 0;
        matriz[1][0] = 1;
        matriz[1][1] = 1;
        matriz[1][2] = 0;
        matriz[2][0] = 1;
        matriz[2][1] = 1;
        matriz[2][2] = 1;

        boolean es_triangular_inferior = true;
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + "\t");
            if (i < j && matriz[i][j] != 0) {
                es_triangular_inferior = false;
            }
        }
        System.out.println();
    }

        if (es_triangular_inferior) {
            System.out.println("Es una matriz identidad.");
        } else {
            System.out.println("No es una matriz identidad.");
        }
    }
*/  
    }//esto esta solo para que no salga la marca de error, de todas formas se puede quitar para que las matrizez funcionen con normalidad
}//esto es lo que salto
