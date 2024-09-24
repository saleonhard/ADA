/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Discente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 518141027
 */
public class DiscenteDAO {
    
    
    
    
    private static final String sql_inserir = "insert into discentes (nome,login,senha) values(?,?,?) ";

    private static final String sql_deletar = "delete from discentes where id=?";

    private static final String sql_alterar = "update discentes set nome=?,login=?,senha=? where id=?";

    private static final String sql_secionarTudo = "select * from discentes";

    private boolean retorno = false;
    
    public boolean inserirDiscente( Discente discente) {

        Connection con = null;
        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_inserir);
            stmt.setString(1, discente.getNome());
            stmt.setString(2, discente.getLogin());
            stmt.setString(3, discente.getSenha());
            

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }

 

    public boolean deletarDiscente(Discente discente) {

        Connection con = null;
        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_deletar);
            stmt.setInt(1, discente.getId());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }
  
    public boolean alterarDiscente(Discente discente) {
   
    Connection con = null;

    
        try{
        con = ConectarBD.conectar();
        PreparedStatement stmt = con.prepareStatement(sql_alterar);
        stmt.setString(1, discente.getNome());
        stmt.setString(2, discente.getLogin());
        stmt.setString(3, discente.getSenha());
        stmt.setInt(5, discente.getId());
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

    
     public List<Discente> selecioarDiscentes(Discente discente) {

        Connection con = null;

        List<Discente> listaDiscentes =  new ArrayList ();

        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_secionarTudo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Discente discenteTPM = new Discente();
                discenteTPM.setId(rs.getInt(1));
                discenteTPM.setNome(rs.getString(2));
                discenteTPM.setLogin(rs.getString(3));
                discenteTPM.setSenha(rs.getString(4));
                

                listaDiscentes.add(discenteTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
    
    return listaDiscentes ;
}

    
    
}
