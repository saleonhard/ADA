/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 518141027
 */
public class GerenteDAO {
    
    
    
    
    
    private static final String sql_inserir = "insert into gerentes (nome,login,senha) values(?,?,?) ";

    private static final String sql_deletar = "delete from gerentes where id=?";

    private static final String sql_alterar = "update gerentes set nome=?,login=?,senha=? where id=?";

    private static final String sql_secionarTudo = "select * from gerentes";

    private boolean retorno = false;
    
    public boolean inserirGerente(Gerente gerente) {

        Connection con = null;
        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_inserir);
            stmt.setString(1, gerente.getNome());
            stmt.setString(2, gerente.getLogin());
            stmt.setString(3, gerente.getSenha());

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }

 

    public boolean deletarGerente(Gerente gerente) {

        Connection con = null;
        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_deletar);
            stmt.setInt(1, gerente.getId());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }
  
    public boolean alterarGerente(Gerente gerente) {
   
    Connection con = null;

    
        try{
     con = ConectarBD.conectar();
        PreparedStatement stmt = con.prepareStatement(sql_alterar);
        stmt.setString(1, gerente.getNome());
        stmt.setString(2, gerente.getLogin());
        stmt.setString(3, gerente.getSenha());
        stmt.setInt(5, gerente.getId());
        retorno = stmt.execute();
    }
    catch(SQLException e

    
        ){
      e.printStackTrace(); //throw new RuntimeException (e);
    }

    
        finally{
     ConectarBD.desconectar(con, null, null);
    }
    return retorno ;
}

    
     public List<Gerente> selecioarGerentes(Gerente gerente) {

        Connection con = null;

        List<Gerente> listaGerentes =  new ArrayList ();

        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_secionarTudo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Gerente gerenteTPM = new Gerente();
                gerenteTPM.setId(rs.getInt(1));
                gerenteTPM.setNome(rs.getString(2));
                gerenteTPM.setLogin(rs.getString(3));
                gerenteTPM.setSenha(rs.getString(4));
                

                listaGerentes.add(gerenteTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
    
    return listaGerentes ;
}

    
    
    
    
    
    
}
