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
