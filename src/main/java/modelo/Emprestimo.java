package modelo;

import dao.EmprestimosDAO;

public class Emprestimo {

    //Inicializando
    private int id;
    private int idAmigo;
    private int idFerramenta;
    private int ativo;

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    private String dataEmprestimo;
    private String dataDevolucao;

    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    //Construtor vazio
    public Emprestimo() {
        this(0, 0, 0, 0, "", "");
    }

    // Construtor com parâmetro
    public Emprestimo(int id, int idAmigo, int idFerramenta, int ativo, String dataEmprestimo, String dataDevolucao) {
        this.id = id;
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
        this.ativo = ativo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao == null ? "" : dataDevolucao;
    }

    // Métodos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Datas
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "id=" + id + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao;
    }
}
/* ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO SIMULANDO
    A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS. */
// Retorna a Lista de Alunos(objetos)
//    public ArrayList<EmprestimosRealizados> getMinhaLista() {
//        return EmprestimosDAO.getMinhaLista();
//    }
//    // Cadastra novo aluno
//
//    public boolean insertAlunoBD(String nomeAmigo, int telefone,String nomeFerramenta,String marcaFerramenta
//            , String dataEmprestimo, String dataDevolucao) {
//        int id = this.maiorID() + 1;
//        Emprestimo objeto = new Emprestimo(id, nomeAmigo, telefone, nomeFerramenta, marcaFerramenta
//        , dataEmprestimo, dataDevolucao);
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
//    public boolean updateAlunoBD(int id, String nomeAmigo, int telefone,String nomeFerramenta,String marcaFerramenta
//            , String dataEmprestimo, String dataDevolucao) {
//        Emprestimo objeto = new Emprestimo(id, nomeAmigo, telefone, nomeFerramenta, marcaFerramenta,
//         dataEmprestimo, dataDevolucao);
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
//    public Emprestimo carregaAluno(int id) {
//        int indice = this.procuraIndice(id);
//        return (Emprestimo) getMinhaLista().get(indice);
//    }
//    // retorna o maior ID da nossa base de dados
//
//    public int maiorID() {
//        return EmprestimosDAO.maiorID();
//    }
//
//}
