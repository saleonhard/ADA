/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Materia;
import DAO.ConectarBD;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author 518141027
 */
public class MateriaDAO {
  
    
    private static final String sql_inserir = "insert into materias (nome) values (?) ";

    private static final String sql_deletar = "delete from materias where id=?";

    private static final String sql_alterar = "update materias set nome=? where id=?";

    private static final String sql_secionarTudo = "select * from materias";

    private boolean retorno = false;
    
    
    
    public boolean inserirMateria(Materia materia) {

        Connection con = null;

        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_inserir);
            stmt.setString(1, materia.getNome());
            retorno = stmt.execute();

        } catch (SQLException e) {

            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con,null, null);
        }
        return retorno;
    }
    
    public boolean deletarMateria(Materia materia) {
        

            Connection con = null;
            try {
                con = ConectarBD.conectar();
                PreparedStatement stmt = con.prepareStatement(sql_deletar);
                stmt.setInt(1, materia.getId());
                retorno = stmt.execute();

            } catch (SQLException e) {
                e.printStackTrace(); //throw new RuntimeException (e);
            } finally {
                ConectarBD.desconectar(con, null, null);
            }
        
        return retorno;
    }
    
    
    public boolean alterarMateria(Materia materia) {
        

            Connection con = null;
            try {
                con = ConectarBD.conectar();
                PreparedStatement stmt = con.prepareStatement(sql_alterar);
                stmt.setString(1, materia.getNome());
                stmt.setInt(2, materia.getId());

                retorno = stmt.execute();

            } catch (SQLException e) {
                e.printStackTrace(); //throw new RuntimeException (e);
            } finally {
                ConectarBD.desconectar(con, null, null);
            }
       
        return retorno;
    }

    public List<Materia> selecioarMaterias(Materia materia) {
        
        

            Connection con = null;

            List <Materia> listaMaterias =  new ArrayList();

            try {
                con = ConectarBD.conectar();
                PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql_secionarTudo);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Materia materiaTPM = new Materia();
                    materiaTPM.setId(rs.getInt(1));
                    materiaTPM.setNome(rs.getString(2));
                    listaMaterias.add(materia);

                }

            }catch(SQLException e){
            
             e.printStackTrace();
            } finally {
                ConectarBD.desconectar(con, null, null);
            }
       
        return listaMaterias;
    }
       

    

}
