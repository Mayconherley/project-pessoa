package src.main.projetopessoa;

public class PessoaJuridica  extends Pessoa{
    public String CNPJ;

    //TODO: CRIAR MÉTODO CONSTRUTOR

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String validacaoCnpj(){
        if (CNPJ.length()!=14){
            return "::::::::CNPJ inválido::::::::";
        }else {
            return "::::::::CNPJ válido::::::::";
        }
    }
}
