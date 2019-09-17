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
public class Assistente extends Funcionario {

    public Assistente() {
    }

    public Assistente(String nome, double sal_base) {
        super(nome, sal_base);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSal_base() {
        return sal_base;
    }

    public void setSal_base(double sal_base) {
        this.sal_base = sal_base;
    }
    
    
    
    @Override
    public void calcularSalario(){
        System.out.println(sal_base);
    }
    
}
