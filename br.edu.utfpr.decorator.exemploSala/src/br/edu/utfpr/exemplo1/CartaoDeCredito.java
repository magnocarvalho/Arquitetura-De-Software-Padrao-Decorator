/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.exemplo1;


public class CartaoDeCredito {
    
    protected String cliente;
    protected String numero;
    protected String validade;
    protected String codigo;
    protected double limite;
    
    public CartaoDeCredito(String cliente, String numero, String validade, String codigo, double limite)
    {
        this.cliente = cliente;
        this.codigo = codigo;
        this.validade = validade;
        this.codigo = codigo;
        this.limite = limite;
    }
}
