/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.observer.pratico1;

/**
 *
 * @author Aluno
 */
public interface Grupo {
     public void attach(Usuario us);
    
    public void detach(Usuario us);
    
    public void notiificar();
}
