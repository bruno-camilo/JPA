package Como_mapear_heranca_da_melhor_maneira.Joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class PessoaJuridicaJoined extends PessoaHerancaJoined {

    private String CNPJ;

    public PessoaJuridicaJoined() {
    }

    public PessoaJuridicaJoined(String nome, String CNPJ) {
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
