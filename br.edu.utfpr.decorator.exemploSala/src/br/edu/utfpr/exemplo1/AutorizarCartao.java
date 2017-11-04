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
public interface AutorizarCartao {

    public boolean autorizar(CartaoDeCredito cartao, double i);
    
}
