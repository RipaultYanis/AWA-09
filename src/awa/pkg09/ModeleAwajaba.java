/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awa.pkg09;

import awa.pkg09.specialite;
import awa.pkg09.hote;

/**
 *
 * @author root
 */
public class ModeleAwajaba {
    
    private hote unHote;
    private specialite uneSpecialite;

    public ModeleAwajaba(hote unHote, specialite uneSpecialite) {
        this.unHote = unHote;
        this.uneSpecialite = uneSpecialite;
    }

    public hote getUnHote() {
        return unHote;
    }

    public specialite getUneSpecialite() {
        return uneSpecialite;
    }

    public void setUnHote(hote unHote) {
        this.unHote = unHote;
    }

    public void setUneSpecialite(specialite uneSpecialite) {
        this.uneSpecialite = uneSpecialite;
    }
    
    
    
}
