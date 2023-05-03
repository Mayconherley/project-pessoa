package src.main.projetopessoa;

public class PessoaFisica extends Pessoa{
    public String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String validacaoCpf(){
        if (CPF.length()!=11){
            return "CPF invalido";
        }else {
            return "CPF valido";
        }
    }
}
