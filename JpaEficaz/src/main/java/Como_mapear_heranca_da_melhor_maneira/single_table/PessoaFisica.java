package Como_mapear_heranca_da_melhor_maneira.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PessoaFisica")
public class PessoaFisica extends PessoaHeranca {
    private String CPF;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, String CPF) {
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
