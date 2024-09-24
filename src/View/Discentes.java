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
@Table(name = "discentes", catalog = "ada_bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Discentes.findAll", query = "SELECT d FROM Discentes d"),
    @NamedQuery(name = "Discentes.findByIdDi", query = "SELECT d FROM Discentes d WHERE d.idDi = :idDi"),
    @NamedQuery(name = "Discentes.findByNome", query = "SELECT d FROM Discentes d WHERE d.nome = :nome"),
    @NamedQuery(name = "Discentes.findByLogin", query = "SELECT d FROM Discentes d WHERE d.login = :login"),
    @NamedQuery(name = "Discentes.findBySenha", query = "SELECT d FROM Discentes d WHERE d.senha = :senha")})
public class Discentes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDi")
    private Integer idDi;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Discentes() {
    }

    public Discentes(Integer idDi) {
        this.idDi = idDi;
    }

    public Discentes(Integer idDi, String nome, String login, String senha) {
        this.idDi = idDi;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdDi() {
        return idDi;
    }

    public void setIdDi(Integer idDi) {
        Integer oldIdDi = this.idDi;
        this.idDi = idDi;
        changeSupport.firePropertyChange("idDi", oldIdDi, idDi);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDi != null ? idDi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discentes)) {
            return false;
        }
        Discentes other = (Discentes) object;
        if ((this.idDi == null && other.idDi != null) || (this.idDi != null && !this.idDi.equals(other.idDi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Discentes[ idDi=" + idDi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
