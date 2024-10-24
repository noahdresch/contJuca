/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sextou;

/**
 *
 * @author Noa
 */
public class Sextou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // ou tirar variavel daqui e ja colocar la em baixo
        String nome;
        int cont = 0;
        int contJuca = 0;
        
        
    // com comando: for (int i = 0; i < 10; ii+ {
        while (cont < 10) {
    // ou Stringnome = Entrada.leiaString("Informe um nome:"); com variavel direto aqui
            nome = Entrada.leiaString("Informe um nome:");
            
        if (nome.equalsIgnoreCase("Juca")) {
            contJuca ++;
        } else {
            
        }
        
        cont++;
        }
        
        System.out.println("Qtde de Jucas: " + contJuca );
        
        
        
        System.exit(0);
    }
    
}
