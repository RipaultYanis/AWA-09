/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awa.pkg09;

import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class specialite {
    
    private String libelle ;

    @Override
    public String toString() {
        return libelle;
    }

    public specialite(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
   
    
    
    
}
