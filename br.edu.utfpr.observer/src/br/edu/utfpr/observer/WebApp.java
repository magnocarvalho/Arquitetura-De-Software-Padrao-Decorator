/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.observer;

/**
 *
 * @author magno
 */
public class WebApp implements Observer{
    
    protected UsersService usuarios;
    
    public WebApp(UsersService u)
    {
        this.usuarios = u;
    }
    
    @Override
    public void update() 
    {
     System.out.println("Amigos Chat Celular");
        
        for(String nome: this.usuarios.getState().lista)
        {
            System.out.println(nome);
        }
    }
    
}
