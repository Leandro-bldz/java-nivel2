/**
 * <h1>Determinante</h1>
 * Programa que calcula o valor do determinante de uma matriz de 2ª ordem.
 * Versão utilizando Scanner.
 *
 * @author balde
 * @version 1.0
 * @since 07-10-2022
 *
 */

import java.util.Scanner;

public class Determinante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matrix[][] = new double[2][2];
        double det, diagPri, diagSec;

        System.out.println("┌─────────────────────────────────────────────────┐");
        System.out.println("│Cálculo do determinante de uma matriz de 2ª ordem│");
        System.out.println("└─────────────────────────────────────────────────┘");

        for (int i=0;i<=1;i++) {
            for (int j=0;j<=1;j++) {
                System.out.print("Informe o elemento da linha "+i+" , coluna "+j+": ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("──────────────────────────────────────────────────");
        System.out.println("A matriz é: ");

        for (int i=0;i<=1;i++) {
            for (int j=0;j<=1;j++) {
                System.out.println(matrix[i][j]);
            }
        }

        diagPri = matrix[0][0]*matrix[1][1];
        diagSec = matrix[0][1]*matrix[1][0];
        det = diagPri - diagSec;

        System.out.println("──────────────────────────────────────────────────");
        System.out.println("Prod. diagonal principal:   "+diagPri);
        System.out.println("Prod. diagonal secundária:  "+diagSec);
        System.out.println("Determinante:               "+det);

    }
}
