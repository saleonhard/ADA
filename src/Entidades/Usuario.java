/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author professor
 */
public class Usuario {

    private int id;
    private String nome;
    private String login;
    private String senha;
    private Date data_cadastro;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getSenha() {

        return senha ;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public Date getData_cadastro() {

        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {

        this.data_cadastro = data_cadastro;
    }
}
