/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 518141027
 */
public class Tabela extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
   public Tabela ( ArrayList lin, String[] col){

       
        setLinhas(lin);
        setColunas(col);
   } 
    
   public  ArrayList getLinhas(){
       
       return linhas;
   }
   private void setLinhas( ArrayList dados){
       
       linhas = dados;
   }
   
   public  String[] getColunas(){
       
       return colunas;
   }
   public  int getColumnCount(){
       
       return colunas.length;
   }
   
  private void setColunas( String[] nomes){
       
       colunas = nomes;
   }
   
  public  int getRowCount(){
       
       return linhas.size();
       
          
   } 
  public  String getColumnName(int numCol){
       
       return colunas[numCol];
   }
  
  
    @Override
  public Object getValueAt(int numLin,int numCol){
       
      Object[] linha = (Object[])getLinhas().get(numLin);
       
      return linha [numCol];
   }

    
  
   
   
}
