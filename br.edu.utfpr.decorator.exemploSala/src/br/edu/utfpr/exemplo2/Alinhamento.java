/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.exemplo2;

/**
 *
 * @author magno
 */
public class Alinhamento implements ServicoAutomotivo{

    private ServicoAutomotivo servico;
    
    public Alinhamento(ServicoAutomotivo servi)
    {
        this.servico = servi;
    }
    
    @Override
    public float custo() {
       
        return this.servico.custo() + 60.00f;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String descricao() {
        return this.servico.descricao() + " alinhamento";
    }
    
    
}
