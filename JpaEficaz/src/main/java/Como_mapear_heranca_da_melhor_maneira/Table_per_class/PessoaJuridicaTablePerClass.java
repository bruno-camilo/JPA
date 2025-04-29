package Como_mapear_heranca_da_melhor_maneira.Table_per_class;

import javax.persistence.Entity;

@Entity
public class PessoaJuridicaTablePerClass extends PessoaHerancaTablePerClass {

    private String CNPJ;

    public PessoaJuridicaTablePerClass() {
    }

    public PessoaJuridicaTablePerClass(String nome, String CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
