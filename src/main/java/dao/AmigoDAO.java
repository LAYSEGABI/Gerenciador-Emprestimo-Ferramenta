package dao;

import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Amigo;
import util.ConexaoDB;

/**
 * Aqui vamos simular a persistência de dados.
 */
public class AmigoDAO {

    private ConexaoDB conexaoDB = new ConexaoDB();

    public List<Amigo> getAmigos() {
        try {
            this.conexaoDB.conectar();

            ResultSet amigos = this.conexaoDB.consultar("SELECT * FROM amigo");

            List<Amigo> listaAmigos = new ArrayList<>();

            while (amigos.next()) {
                Amigo amigo = new Amigo(amigos.getInt("id"), amigos.getString("nome"), amigos.getInt("telefone"));
                listaAmigos.add(amigo);

            }

            this.conexaoDB.desconectar();
            return listaAmigos;
        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Amigo getAmigo(int id) {
        try {
            this.conexaoDB.conectar();

            String sql = "SELECT * from amigo WHERE id = " + id;

            ResultSet amigos = this.conexaoDB.consultar(sql);
            Amigo amigo = null;

            if (amigos.next()) {
                amigo = new Amigo(amigos.getInt("id"), amigos.getString("nome"), amigos.getInt("telefone"));

            }

            this.conexaoDB.desconectar();
            return amigo;
        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void inserirAmigo(Amigo amigo) {
        try {
            this.conexaoDB.conectar();
            String sql = "INSERT INTO amigo (nome, telefone) VALUES ('" + amigo.getNome() + "','" + amigo.getTelefone() + "')";

            this.conexaoDB.inserir(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void editarAmigo(Amigo amigo) {
        try {
            this.conexaoDB.conectar();
            String sql = "UPDATE amigo SET nome = '" + amigo.getNome() + "', telefone = '" + amigo.getTelefone() + "' WHERE id = '" + amigo.getId() + "'";

            this.conexaoDB.editar(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void excluirAmigo(Amigo amigo) {
        try {
            this.conexaoDB.conectar();
            String sql = "DELETE FROM amigo WHERE id = " + amigo.getId();

            this.conexaoDB.excluir(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
