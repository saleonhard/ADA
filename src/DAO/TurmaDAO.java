/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidades.Turma;
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
public class TurmaDAO {
    
    
    
    
    
    private static final String sql_inserir = "insert into turmas (nome) values (?) ";

    private static final String sql_deletar = "delete from turmas where id=?";

    private static final String sql_alterar = "update turmas set nome=? where id=?";

    private static final String sql_secionarTudo = "select * from turma";

    private boolean retorno = false;
    
    
    
    public boolean inserirTurma(Turma turma) {

        Connection con = null;

        try {
            con = ConectarBD.conectar();
            PreparedStatement stmt = con.prepareStatement(sql_inserir);
            stmt.setString(1, turma.getNome());
            retorno = stmt.execute();

        } catch (SQLException e) {

            e.printStackTrace(); //throw new RuntimeException (e);
        } finally {
            ConectarBD.desconectar(con, null, null);
        }
        return retorno;
    }
    
    public boolean deletarTurma(Turma turma) {
        

            Connection con = null;
            try {
                con = ConectarBD.conectar();
                PreparedStatement stmt = con.prepareStatement(sql_deletar);
                stmt.setInt(1, turma.getId());
                retorno = stmt.execute();

            } catch (SQLException e) {
                e.printStackTrace(); //throw new RuntimeException (e);
            } finally {
                ConectarBD.desconectar(con, null, null);
            }
        
        return retorno;
    }
    
    
    public boolean alterarTurma(Turma turma) {
        

            Connection con = null;
            try {
                con = ConectarBD.conectar();
                PreparedStatement stmt = con.prepareStatement(sql_alterar);
                stmt.setString(1, turma.getNome());
                stmt.setInt(2, turma.getId());

                retorno = stmt.execute();

            } catch (SQLException e) {
                e.printStackTrace(); //throw new RuntimeException (e);
            } finally {
                ConectarBD.desconectar(con, null, null);
            }
       
        return retorno;
    }

    public List<Turma> selecioarTurma(Turma turma) {
        
        

            Connection con = null;

            List <Turma> listaTurmas =  new ArrayList();

            try {
                con = ConectarBD.conectar();
                PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql_secionarTudo);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Turma turmaTPM = new Turma();
                    turmaTPM.setId(rs.getInt(1));
                    turmaTPM.setNome(rs.getString(2));
                    listaTurmas.add(turma);

                }

            }catch(SQLException e){
            
             e.printStackTrace();
            } finally {
                ConectarBD.desconectar(con, null, null);
            }
       
        return listaTurmas;
    }
       

    
    
}
