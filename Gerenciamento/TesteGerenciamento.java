/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento;

/**
 *
 * @author Patric
 */
public class TesteGerenciamento {
     public static void main(String[] args) {
        // TODO code application logic here
        
        Gerenciamento t;
        int i = 0;
        
        do{
            t = new Gerenciamento(i,"nome"+i, "usuario"+i);
               System.out.println( "foram criados");
               t.mostrarInfo();
               i++;
            }while(i<10000);
        System.gc();
        System.out.println(".      - no final ");
        t.mostrarInfo();
    }
}
