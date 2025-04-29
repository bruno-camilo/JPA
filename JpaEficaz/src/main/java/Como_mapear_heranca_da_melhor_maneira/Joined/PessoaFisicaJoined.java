package Como_mapear_heranca_da_melhor_maneira.Joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class PessoaFisicaJoined extends PessoaHerancaJoined {
    private String CPF;

    public PessoaFisicaJoined() {
    }

    public PessoaFisicaJoined(String nome, String CPF) {
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
