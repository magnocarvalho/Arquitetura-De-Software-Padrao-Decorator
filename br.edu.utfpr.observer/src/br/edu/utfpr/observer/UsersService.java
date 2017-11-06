/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magno
 */
public class UsersService implements Subject{
    
    protected List<Observer> observers;
    protected UsuarioConectads usuarios;
    
    public UsersService()
    {
        this.observers = new ArrayList<>();
        this.usuarios = new UsuarioConectads();
    }

    @Override
    public void attach(Observer ob) 
    {
        this.observers.add(ob);
    }

    @Override
    public void detach(Observer ob) 
    {
        this.observers.add(ob);
    }

    @Override
    public void notiificar() 
    {
        for(Observer ob : observers)
        {
            ob.update();
        }
    }
    public void setState(String usuario)
    {
        this.usuarios.lista.add(usuario);
        notiificar();
    }
    public UsuarioConectads getState()
    {
        return this.usuarios;
    }
          
    
}
