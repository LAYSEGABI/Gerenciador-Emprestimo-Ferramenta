package modelo;

import java.util.ArrayList;
import dao.AmigoDAO;

public class Amigo {

    //Inicializando
    private int id;
    private String nome;
    private int telefone;

    //Construtor vazio
    public Amigo() {
        this(0, "", 0);
    }

    // Construtor com parâmetro
    public Amigo(int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;

    }

    // Métodos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", nome="
                + nome + ", telefone=" + telefone;
    }
}