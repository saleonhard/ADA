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
@Table(name = "docentes", catalog = "ada_bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Docentes.findAll", query = "SELECT d FROM Docentes d"),
    @NamedQuery(name = "Docentes.findByIdDo", query = "SELECT d FROM Docentes d WHERE d.idDo = :idDo"),
    @NamedQuery(name = "Docentes.findByNome", query = "SELECT d FROM Docentes d WHERE d.nome = :nome"),
    @NamedQuery(name = "Docentes.findByDocentescol", query = "SELECT d FROM Docentes d WHERE d.docentescol = :docentescol"),
    @NamedQuery(name = "Docentes.findByLogin", query = "SELECT d FROM Docentes d WHERE d.login = :login"),
    @NamedQuery(name = "Docentes.findBySenha", query = "SELECT d FROM Docentes d WHERE d.senha = :senha")})
public class Docentes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDo")
    private Integer idDo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "docentescol")
    private String docentescol;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Docentes() {
    }

    public Docentes(Integer idDo) {
        this.idDo = idDo;
    }

    public Docentes(Integer idDo, String nome, String login, String senha) {
        this.idDo = idDo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdDo() {
        return idDo;
    }

    public void setIdDo(Integer idDo) {
        Integer oldIdDo = this.idDo;
        this.idDo = idDo;
        changeSupport.firePropertyChange("idDo", oldIdDo, idDo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDocentescol() {
        return docentescol;
    }

    public void setDocentescol(String docentescol) {
        String oldDocentescol = this.docentescol;
        this.docentescol = docentescol;
        changeSupport.firePropertyChange("docentescol", oldDocentescol, docentescol);
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
        hash += (idDo != null ? idDo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docentes)) {
            return false;
        }
        Docentes other = (Docentes) object;
        if ((this.idDo == null && other.idDo != null) || (this.idDo != null && !this.idDo.equals(other.idDo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Docentes[ idDo=" + idDo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
