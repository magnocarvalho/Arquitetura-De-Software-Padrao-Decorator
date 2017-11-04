/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.exemplo1;

/**
 *
 * @author magno
 */
public class AnaliseRisco  implements AutorizarCartao{
    
    protected AutorizarCartao autorizador;
    
    public AnaliseRisco(AutorizarCartao autori)
    {
        this.autorizador = autori;
    }

    @Override
    public boolean autorizar(CartaoDeCredito cartao, double i) {
        if(cartao.cliente.equals("marinaldo"))
        {
            System.out.println("Auto risco, cliente mal caracter hahahha");
            return false;
        }
        else{
            System.out.println("Sem risco, pode pa!");
            this.autorizador.autorizar(cartao, i);  //segredo ta aqui 
            return true;
        }
                    
                
    }
    
}
