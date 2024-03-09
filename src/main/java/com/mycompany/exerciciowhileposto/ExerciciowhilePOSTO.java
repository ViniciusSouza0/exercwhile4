package com.mycompany.exerciciowhileposto;
import java.util.Scanner;
public class ExerciciowhilePOSTO {
public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);

        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        System.out.println("Digite 1,2,3 para seu respectivo pedido e digite 4 para finalizar a compra:");
        int x = teclado.nextInt();
        while (x != 4){
            switch (x) {
                case 1:
                    alcool += 1;
                    System.out.println("Álcool adicionado");
                  break;
                case 2:
                    gasolina += 1;
                    System.out.println("Gasolina adicionada");
                  break;
                case 3:
                    diesel += 1;
                    System.out.println("Diesel adicionado");
                  break;
                default:
            break;
            }
        x = teclado.nextInt();
            
        }
        
        System.out.println("Quantidade adicionada\nÁlcool adicionado total: " + alcool);
        System.out.println("Gasolina adicionada total: " + gasolina);
        System.out.println("Diesel adicionado total: " + diesel);
        System.out.println("MUITO OBRIGADO");















    }
}
