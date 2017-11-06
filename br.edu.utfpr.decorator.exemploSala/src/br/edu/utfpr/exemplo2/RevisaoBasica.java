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
public class RevisaoBasica implements ServicoAutomotivo{

    @Override
    public float custo() 
    {
          return 400.00f;
    }

    @Override
    public String descricao() {
    
        return "Revisao basica";
    }
    
    
    
}
