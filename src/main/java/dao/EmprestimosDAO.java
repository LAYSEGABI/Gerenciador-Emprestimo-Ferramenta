package dao;

import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Emprestimo;
import util.ConexaoDB;

public class EmprestimosDAO {

    private ConexaoDB conexaoDB = new ConexaoDB();

    public List<Emprestimo> getEmprestimos() {
        try {
            this.conexaoDB.conectar();

            ResultSet emprestimos = this.conexaoDB.consultar("SELECT * FROM emprestimo");

            List<Emprestimo> listaEmprestimos = new ArrayList<>();

            while (emprestimos.next()) {
                Emprestimo emprestimo = new Emprestimo(
                        emprestimos.getInt("id"),
                        emprestimos.getInt("amigo"),
                        emprestimos.getInt("ferramenta"),
                        emprestimos.getInt("ativo"),
                        emprestimos.getString("data_emprestimo"),
                        emprestimos.getString("data_devolucao")
                );
                listaEmprestimos.add(emprestimo);
            }

            this.conexaoDB.desconectar();
            return listaEmprestimos;
        } catch (SQLException ex) {
            Logger.getLogger(EmprestimosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public List<Emprestimo> getEmprestimosAtivos() {
        try {
            this.conexaoDB.conectar();

            ResultSet emprestimos = this.conexaoDB.consultar("SELECT * FROM emprestimo WHERE ativo = 1");

            List<Emprestimo> listaEmprestimos = new ArrayList<>();

            while (emprestimos.next()) {
                Emprestimo emprestimo = new Emprestimo(
                        emprestimos.getInt("id"),
                        emprestimos.getInt("amigo"),
                        emprestimos.getInt("ferramenta"),
                        emprestimos.getInt("ativo"),
                        emprestimos.getString("data_emprestimo"),
                        emprestimos.getString("data_devolucao")
                );
                listaEmprestimos.add(emprestimo);
            }

            this.conexaoDB.desconectar();
            return listaEmprestimos;
        } catch (SQLException ex) {
            Logger.getLogger(EmprestimosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void inserir(Emprestimo emprestimo) {
        try {
            this.conexaoDB.conectar();
            String sql = "INSERT INTO emprestimo (amigo, ferramenta, data_emprestimo, ativo) VALUES (" + emprestimo.getIdAmigo()
                    + "," + emprestimo.getIdFerramenta() + ",'" + emprestimo.getDataEmprestimo() + "', 1)";

            this.conexaoDB.inserir(sql);

        } catch (SQLException ex) {
            Logger.getLogger(EmprestimosDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void finalizarEmprestimo(int idEmprestimo, String dataDevolucao) {
        try {
            this.conexaoDB.conectar();
            String sql = "UPDATE emprestimo SET data_devolucao = '" + dataDevolucao + "' , ativo = 0 WHERE id = " + idEmprestimo ;

            this.conexaoDB.editar(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    public void excluir(Emprestimo emprestimo) {
        try {
            this.conexaoDB.conectar();
            String sql = "DELETE FROM emprestimo WHERE id = " + emprestimo.getId();

            this.conexaoDB.excluir(sql);

        } catch (SQLException ex) {
            Logger.getLogger(AmigoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
