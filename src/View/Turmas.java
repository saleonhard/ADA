/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Junior
 */
@Entity
@Table(name = "turmas", catalog = "dbtest", schema = "")
@NamedQueries({
    @NamedQuery(name = "Turmas.findAll", query = "SELECT t FROM Turmas t"),
    @NamedQuery(name = "Turmas.findByIdturmas", query = "SELECT t FROM Turmas t WHERE t.idturmas = :idturmas"),
    @NamedQuery(name = "Turmas.findByNome", query = "SELECT t FROM Turmas t WHERE t.nome = :nome")})
public class Turmas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer idturmas;
    @Column(name = "nome")
    private String nome;

    public Turmas() {
    }

    public Turmas(Integer idturmas) {
        this.idturmas = idturmas;
    }

    public Integer getIdturmas() {
        return idturmas;
    }

    public void setIdturmas(Integer idturmas) {
        Integer oldIdturmas = this.idturmas;
        this.idturmas = idturmas;
        changeSupport.firePropertyChange("id", oldIdturmas, idturmas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idturmas != null ? idturmas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turmas)) {
            return false;
        }
        Turmas other = (Turmas) object;
        if ((this.idturmas == null && other.idturmas != null) || (this.idturmas != null && !this.idturmas.equals(other.idturmas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Turmas[ idturmas=" + idturmas + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
