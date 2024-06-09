package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDB {
    private String url;
    private String user;
    private String password;
    private Connection connection;

    public ConexaoDB() {
        this.url = "jdbc:mysql://localhost:3306/sistema";
        this.user = "root";
        this.password = "";
    }

    // Método para conectar ao banco de dados
    public void conectar() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                this.connection = DriverManager.getConnection(this.url, this.user, this.password);
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver MySQL não encontrado!", e);
            }
        }
    }

    // Método para executar consultas SELECT
    public ResultSet consultar(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

    // Método para executar atualização INSERT
    public int inserir(String query) throws SQLException {
        Statement statement = connection.createStatement();
        
         int linhasInseridas = statement.executeUpdate(query);
            if (linhasInseridas > 0) {
                System.out.println("Um novo amigo foi inserido com sucesso!");
                return linhasInseridas;
            }
            return 0;
    }
    
     public int editar(String query) throws SQLException {
        Statement statement = connection.createStatement();
        
         int linhasInseridas = statement.executeUpdate(query);
            if (linhasInseridas > 0) {
                System.out.println("Amigo atualizado com sucesso!");
                return linhasInseridas;
            }
            return 0;
    }
    
    public int excluir(String query) throws SQLException {
        Statement statement = connection.createStatement();
        int linhasInseridas = statement.executeUpdate(query);
            if (linhasInseridas > 0) {
                System.out.println("Amigo deletado com sucesso!");
                return linhasInseridas;
            }
            return 0;
    }


    // Método para fechar a conexão
    public void desconectar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Conexão fechada com sucesso!");
        }
    }
}