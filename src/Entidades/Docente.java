/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author professor
 */
import java.util.ArrayList;

public class Docente extends Usuario{
    
    private ArrayList <Materia> materiasLecionadas = new ArrayList <>();
    private ArrayList <Turma> turmasQLeciona = new ArrayList <>();

    /**
     * @return the materiasLecionadas
     */
    public ArrayList <Materia> getMateriasLecionadas() {
        return materiasLecionadas;
    }

    /**
     * @param materiasLecionadas the materiasLecionadas to set
     */
    public void setMateriasLecionadas(ArrayList <Materia> materiasLecionadas) {
        this.materiasLecionadas = materiasLecionadas;
    }

    /**
     * @return the turmasQLeciona
     */
    public ArrayList <Turma> getTurmasQLeciona() {
        return turmasQLeciona;
    }

    /**
     * @param turmasQLeciona the turmasQLeciona to set
     */
    public void setTurmasQLeciona(ArrayList <Turma> turmasQLeciona) {
        this.turmasQLeciona = turmasQLeciona;
    }

    
    
    
    
    
}
