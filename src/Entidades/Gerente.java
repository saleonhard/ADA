/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author professor
 */
public class Gerente extends Usuario {
    
    private String novaSenha;
    private String novaSenhaConf ;

    /**
     * @return the novaSenha
     */
    public String getNovaSenha() {
        return novaSenha;
    }

    /**
     * @param novaSenha the novaSenha to set
     */
    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }

    /**
     * @return the novaSenhaConf
     */
    public String getNovaSenhaConf() {
        return novaSenhaConf;
    }

    /**
     * @param novaSenhaConf the novaSenhaConf to set
     */
    public void setNovaSenhaConf(String novaSenhaConf) {
        this.novaSenhaConf = novaSenhaConf;
    }
    
    
    
    
}
