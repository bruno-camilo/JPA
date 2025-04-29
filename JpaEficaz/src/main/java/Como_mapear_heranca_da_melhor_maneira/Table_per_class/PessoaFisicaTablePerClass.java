package Como_mapear_heranca_da_melhor_maneira.Table_per_class;

import javax.persistence.Entity;

@Entity
public class PessoaFisicaTablePerClass extends PessoaHerancaTablePerClass {
    private String CPF;

    public PessoaFisicaTablePerClass() {
    }

    public PessoaFisicaTablePerClass(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
