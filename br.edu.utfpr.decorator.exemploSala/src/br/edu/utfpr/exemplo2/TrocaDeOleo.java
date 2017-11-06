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
public class TrocaDeOleo implements ServicoAutomotivo{
    
    private ServicoAutomotivo servico;
    
    public TrocaDeOleo(ServicoAutomotivo s)
    {
        this.servico = s;
    }

    @Override
    public float custo() {
        return this.servico.custo() + 250.00f;
    }

    @Override
    public String descricao() {
        return this.servico.descricao() + "e troca de oleo";
    }
    
}
