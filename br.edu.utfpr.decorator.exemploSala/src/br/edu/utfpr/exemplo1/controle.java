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
public class controle {
    
    public static void main(String[] args) {
        CartaoDeCredito cartao = new CartaoDeCredito("Joao", "4333 888 4448 48493", "01/19", "298", 2220);
        
        AutorizarCartao autorizador = new AutorizadorCartaoCielo();
        
        autorizador.autorizar(cartao, 500);
    }
}
