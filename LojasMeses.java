/**
 * <h1>LojasMeses</h1>
 * Programa que insere o faturamento de diferentes lojas ao longo dos meses em uma tabela 2x3.
 * Versão utilizando Scanner.
 *
 * @author balde
 * @version 1.0
 * @since 07-10-2022
 *
 */

import java.util.Scanner;

public class LojasMeses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double tabela[][] = new double[2][3];

        // Inserção de dados
        System.out.println("┌───────────────────────────┐");
        System.out.println("│Inserção de dados na tabela│");
        System.out.println("└───────────────────────────┘");
        for (int i=0;i<=1;i++) {
            for (int j=0;j<=2;j++) {
                System.out.println("Digite o faturamento da loja "+i+" no mês "+j+": ");
                tabela[i][j] = sc.nextDouble();
            }
        }

        // Exibição dos dados da tabela
        System.out.println("┌───────────────────────────┐");
        System.out.println("│Exibição de dados da tabela│");
        System.out.println("└───────────────────────────┘");
        System.out.println("Os dados registrados foram:" );
        for (int i=0;i<=1;i++) {
            for (int j=0;j<=2;j++) {
                if(j == 2) {
                    System.out.println("|"+tabela[i][j]+"|");
                    } else {
                    System.out.print("|" + tabela[i][j] + "|");
                }
            }
        }

        sc.close();
    }
}
