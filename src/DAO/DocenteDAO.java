/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Docente;
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
public class DocenteDAO {
    
     private static final String sql_inserir = "insert into docentes (nome,login,senha) values(?,?,?) ";

    private static final String sql_deletar = "delete from docentes where id=?";

    private static final String sql_alterar = "update docentes set nome=?,login=?,senha=? where id=?";

    private static final String sql_secionarTudo = "select * from docentes";

    private boolean retorno = false;
    
    public boolean inserirDocente( Docente docente) {

        Connection con = null;
        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_inserir);
            stmt.setString(1, docente.getNome());
            stmt.setString(2, docente.getLogin());
            stmt.setString(3, docente.getSenha());
            

            retorno = stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }

 

    public boolean deletarDiscente(Docente docente) {

        Connection con = null;
        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_deletar);
            stmt.setInt(1, docente.getId());
            retorno = stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }
  
    public boolean alterarDiscente(Docente docente) {
   
    Connection con = null;

    
        try{
        con = ConectarBD.conectar();
        PreparedStatement stmt = con.prepareStatement(sql_alterar);
        stmt.setString(1, docente.getNome());
        stmt.setString(2, docente.getLogin());
        stmt.setString(3, docente.getSenha());
        stmt.setInt(5, docente.getId());
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

    
     public List<Docente> selecioarDiscentes(Docente docente) {

        Connection con = null;

        List<Docente> listaDocentes =  new ArrayList ();

        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_secionarTudo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Docente discenteTPM = new Docente();
                discenteTPM.setId(rs.getInt(1));
                discenteTPM.setNome(rs.getString(2));
                discenteTPM.setLogin(rs.getString(3));
                discenteTPM.setSenha(rs.getString(4));
                

                listaDocentes.add(discenteTPM);

            }

        } catch (SQLException e) {
            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
    
    return listaDocentes ;
}
    
}
