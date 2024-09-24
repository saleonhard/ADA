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
@Table(name = "gerentes", catalog = "ada_bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Gerentes.findAll", query = "SELECT g FROM Gerentes g"),
    @NamedQuery(name = "Gerentes.findByIdG", query = "SELECT g FROM Gerentes g WHERE g.idG = :idG"),
    @NamedQuery(name = "Gerentes.findByNome", query = "SELECT g FROM Gerentes g WHERE g.nome = :nome"),
    @NamedQuery(name = "Gerentes.findByLogin", query = "SELECT g FROM Gerentes g WHERE g.login = :login"),
    @NamedQuery(name = "Gerentes.findBySenha", query = "SELECT g FROM Gerentes g WHERE g.senha = :senha")})
public class Gerentes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idG")
    private Integer idG;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Gerentes() {
    }

    public Gerentes(Integer idG) {
        this.idG = idG;
    }

    public Gerentes(Integer idG, String nome, String login, String senha) {
        this.idG = idG;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdG() {
        return idG;
    }

    public void setIdG(Integer idG) {
        Integer oldIdG = this.idG;
        this.idG = idG;
        changeSupport.firePropertyChange("idG", oldIdG, idG);
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
        hash += (idG != null ? idG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gerentes)) {
            return false;
        }
        Gerentes other = (Gerentes) object;
        if ((this.idG == null && other.idG != null) || (this.idG != null && !this.idG.equals(other.idG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Gerentes[ idG=" + idG + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
