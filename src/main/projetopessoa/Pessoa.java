package src.main.projetopessoa;

public class Pessoa {
    public Endereco endereco;
    public String nome;
    public String anoNascimento;

    //TODO: CRIAR MÉTODO CONSTRUTOR

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //TODO: Criar funcionalidade que pegue o ano de nascimento e calcule a idade da pessoa
}
