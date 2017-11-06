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
public interface Subject {
    public void attach(Observer ob);
    
    public void detach(Observer ob);
    
    public void notiificar();
}
