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
public class Carro {
    
    public static void main(String[] args) 
    {
        ServicoAutomotivo servico = new Alinhamento(new TrocaDeOleo(new RevisaoBasica()));
        System.out.println(servico.descricao());
    }
}
