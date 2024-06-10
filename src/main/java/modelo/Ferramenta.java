package modelo;

import java.util.ArrayList;
import dao.FerramentaDAO;

public class Ferramenta {

    //Inicializando
    private int id;
    private String nome;
    private String marca;
    private double custo;
    private int disponivel;

    //Construtor vazio
    public Ferramenta() {
        this(0, "", "", 0, 1);
    }

    // Construtor com parâmetro
    public Ferramenta(int id, String nome, String marca, double custo, int disponivel) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.disponivel = disponivel;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
     public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int ativo) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome="
                + nome + ", marca="
                + marca + ", custo=" 
                + custo + ", disponivel=" 
                + disponivel;
    }
}