package dao;

import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ferramenta;
import util.ConexaoDB;

/**
 * Aqui vamos simular a persistência de dados.
 */
public class FerramentaDAO {

    private ConexaoDB conexaoDB = new ConexaoDB();

    public List<Ferramenta> getFerramentas() {
        try {
            this.conexaoDB.conectar();

            ResultSet ferramentas = this.conexaoDB.consultar("SELECT * FROM ferramenta");

            List<Ferramenta> listaFerramenta = new ArrayList<>();

            while (ferramentas.next()) {
                Ferramenta ferramenta = new Ferramenta(ferramentas.getInt("id"), ferramentas.getString("nome"), ferramentas.getString("marca")
                        , ferramentas.getDouble("custo"), ferramentas.getInt("disponivel"));
                listaFerramenta.add(ferramenta);

            }

            this.conexaoDB.desconectar();
            return listaFerramenta;
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Ferramenta getFerramenta(int id) {
        try {
            this.conexaoDB.conectar();

            String sql = "SELECT * from ferramenta WHERE id = " + id ;

            ResultSet ferramentas = this.conexaoDB.consultar(sql);
            Ferramenta ferramenta = null;

            if (ferramentas.next()) {
                ferramenta = new Ferramenta(ferramentas.getInt("id"), ferramentas.getString("nome"), ferramentas.getString("marca"), ferramentas.getDouble("custo"), ferramentas.getInt("disponivel"));

            }

            this.conexaoDB.desconectar();
            return ferramenta;
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public List<Ferramenta> getFerramentasDisponiveis() {
        try {
            this.conexaoDB.conectar();

            String sql = "SELECT * from ferramenta WHERE disponivel = 1";

            ResultSet ferramentas = this.conexaoDB.consultar(sql);

            List<Ferramenta> listaFerramenta = new ArrayList<>();

            while (ferramentas.next()) {
                Ferramenta ferramenta = new Ferramenta(ferramentas.getInt("id"), ferramentas.getString("nome"), ferramentas.getString("marca")
                        , ferramentas.getDouble("custo"), ferramentas.getInt("disponivel"));
                listaFerramenta.add(ferramenta);

            }

            this.conexaoDB.desconectar();
            return listaFerramenta;
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public List<Ferramenta> getFerramentasCusto() {
        try {
            this.conexaoDB.conectar();

            String sql = "SELECT * from ferramenta WHERE custo > 0";

            ResultSet ferramentas = this.conexaoDB.consultar(sql);

            List<Ferramenta> listaFerramenta = new ArrayList<>();

            while (ferramentas.next()) {
                Ferramenta ferramenta = new Ferramenta(ferramentas.getInt("id"), ferramentas.getString("nome"), ferramentas.getString("marca")
                        , ferramentas.getDouble("custo"), ferramentas.getInt("disponivel"));
                listaFerramenta.add(ferramenta);

            }

            this.conexaoDB.desconectar();

            return listaFerramenta;
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }


    public void inserirFerramenta(Ferramenta ferramenta) {
        try {
            this.conexaoDB.conectar();
            String sql = "INSERT INTO ferramenta (nome, marca, custo, disponivel) VALUES ('" + ferramenta.getNome() + "','"+ ferramenta.getMarca() + "','" + ferramenta.getCusto() + "','"+ ferramenta.getDisponivel() + "')";
            
            this.conexaoDB.inserir(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        
    }
    
    public void editarFerramenta(Ferramenta ferramenta) {
        try {
            this.conexaoDB.conectar();
            String sql = "UPDATE ferramenta SET nome = '" + ferramenta.getNome() + "', marca = '" + ferramenta.getMarca() + "', custo = '" + ferramenta.getCusto() + "' WHERE id = '" + ferramenta.getId()+"'";
            
            this.conexaoDB.editar(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        
    }
    
    public void atualizarDisponibilidade(int id, int disponivel) {
        try {
            this.conexaoDB.conectar();
            String sql = "UPDATE ferramenta SET disponivel = " + disponivel +  " WHERE id = " + id;
            
            this.conexaoDB.editar(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        
    }
    
    public void atualizarDisponibilidade(String nome, int disponivel) {
        try {
            this.conexaoDB.conectar();
            String sql = "UPDATE ferramenta SET disponivel = " + disponivel +  " WHERE nome = '" + nome + "'";
            
            this.conexaoDB.editar(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        
    }
    public void excluirFerramenta(Ferramenta ferramenta) {
        try {
            this.conexaoDB.conectar();
            String sql = "DELETE FROM ferramenta WHERE id = " + ferramenta.getId();
            
            this.conexaoDB.excluir(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FerramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        
    }

}
