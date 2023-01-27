/**
 * <h1>Equacao2Grau</h1>
 * Programa que calcula as raízes de uma Equação do 2º Grau
 * 
 * 
 * @author baldez
 * @version 1.0
 * @since 10-10-2022
 *
 */

 import java.util.Scanner;
 
 public class Equacao2Grau {
 
     public static void main(String[] args) {
         int a, b, c;
         double delta,x1,x2;
         
         Scanner teclado = new Scanner(System.in);

         System.out.println("┌────────────────────────────────────┐");
         System.out.println("│Inserção dos coeficientes da equação│");
         System.out.println("└────────────────────────────────────┘");
         System.out.println("Ax² + Bx + C = 0");
         System.out.println("Digite o valor de A");
         a = teclado.nextInt();
         System.out.println("Digite o valor de B");
         b = teclado.nextInt();
         System.out.println("Digite o valor de C");
         c = teclado.nextInt();
         
         delta = b*b - 4*a*c;
         
        System.out.println("Delta = b² - 4ac = " + delta);

        if (a > 0) { //Verificação da concavidade da parábola
            System.out.println("A parábola é voltada pra cima!");
        }
        else 
            System.out.println("A parábola está voltada pra baixo!");

         if(delta >= 0) //existem raízes reais
         { //Início
             x1 = (-b + Math.sqrt(delta))/2*a;
             x2 = (-b - Math.sqrt(delta))/2*a;
             System.out.println("O valor de x1= "+x1);
             System.out.println("O valor de x2= "+x2);			
         } //Fim
         else
             System.out.println("Não existem raízes reais!");

         teclado.close();
     }
 }
 