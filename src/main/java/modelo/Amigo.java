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

    /* ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO SIMULANDO
    A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS. */
    // Retorna a Lista de Alunos(objetos)
    //public ArrayList<Amigo> getMinhaLista() {
    //    return AmigoDAO.getMinhaLista();
    //}
    // Cadastra novo aluno

//     public boolean insertAlunoBD(String nome, int telefone) {
//        int id = this.maiorID() + 1;
//        Amigo objeto = new Amigo(id, nome, telefone);
//        getMinhaLista().add(objeto);
//        return true;
//    }
//    // Deleta um aluno específico pelo seu campo ID
//
//    public boolean deleteAlunoBD(int id) {
//        int indice = this.procuraIndice(id);
//        getMinhaLista().remove(indice);
//        return true;
//    }
//
//    // Edita um aluno específico pelo seu campo ID
//    public boolean updateAlunoBD(int id, String nome,
//            int telefone) {
//        Amigo objeto = new Amigo(id, nome, telefone);
//        int indice = this.procuraIndice(id);
//        getMinhaLista().set(indice, objeto);
//        return true;
//    }
//    // procura o INDICE de objeto da minhaLista que
//    // contem o ID enviado.
//
//    private int procuraIndice(int id) {
//        int indice = -1;
//        for (int i = 0; i < getMinhaLista().size(); i++) {
//            if (getMinhaLista().get(i).getId() == id) {
//                indice = i;
//            }
//        }
//        return indice;
//    }
//    // carrega dados de um aluno específico pelo seu ID
//
//    public Amigo carregaAluno(int id) {
//        int indice = this.procuraIndice(id);
//        return (Amigo) getMinhaLista().get(indice);
//    }
//    // retorna o maior ID da nossa base de dados
//
//    public int maiorID() {
//        return AmigoDAO.maiorID();
//    }

}
