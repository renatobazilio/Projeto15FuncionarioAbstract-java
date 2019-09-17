/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor vendedor01 = new Vendedor(100, "Renato", 1000);
        Assistente assistente01 = new Assistente("Yuri", 1500);
        Gerente gerente01 = new Gerente("Franscico", 2000);
        
        
        System.out.println("Vendedor01 \nNome: "+ vendedor01.getNome()+ 
                "\nSalario: "+ vendedor01.getSal_base()+ 
                "\nComissao: "+ vendedor01.getComissao());
        
        vendedor01.calcularSalario();
        
        System.out.println("\nAsistente01 \nNome: "+ assistente01.getNome()+
                "\nSalario: "+ assistente01.getSal_base());
        assistente01.calcularSalario();
        
        System.out.println("\nGerente01 \nNome: "+ gerente01.getNome()+
                "\nSalario: "+ gerente01.getSal_base());
        gerente01.calcularSalario();
        
    }
    
}
