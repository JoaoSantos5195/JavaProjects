package SistemaBanco;

public class Usuario {
    private String nome, senha;
    private int cpf, score;
    private int id, numAnterior;
    private float saldo, divida, emprestimo;

    public Usuario(int id, String nome, String senha, int cpf, int score, float saldo, float divida, float emprestimo){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.score = score;
        this.saldo = saldo;
        this.divida = divida;
        this.emprestimo = emprestimo;
    }
    
}
