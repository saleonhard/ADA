/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author professor
 */
public class Discente extends Usuario {
  
    private Turma turmaAtual;  

    /**
     * @return the turmaAtual
     */
    public Turma getTurmaAtual() {
        return turmaAtual;
    }

    /**
     * @param turmaAtual the turmaAtual to set
     */
    public void setTurmaAtual(Turma turmaAtual) {
        this.turmaAtual = turmaAtual;
    }
}
