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


/* ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO SIMULANDO
    A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    // Retorna a Lista de Alunos(objetos)
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDAO.getMinhaLista();
    }
    // Cadastra novo aluno

    public boolean insertAlunoBD(String nome, String marca, double custo) {
        int id = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        getMinhaLista().add(objeto);
        return true;
    }
    // Deleta um aluno específico pelo seu campo ID

    public boolean deleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        getMinhaLista().remove(indice);
        return true;
    }

    // Edita um aluno específico pelo seu campo ID
    public boolean updateAlunoBD(int id, String nome,
            int idade) {
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        int indice = this.procuraIndice(id);
        getMinhaLista().set(indice, objeto);
        return true;
    }
    // procura o INDICE de objeto da minhaLista que
    // contem o ID enviado.

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < getMinhaLista().size(); i++) {
            if (getMinhaLista().get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    // carrega dados de um aluno específico pelo seu ID

    public Ferramenta carregaAluno(int id) {
        int indice = this.procuraIndice(id);
        return (Ferramenta) getMinhaLista().get(indice);
    }
    // retorna o maior ID da nossa base de dados

    public int maiorID() {
        return FerramentaDAO.maiorID();
    } */
