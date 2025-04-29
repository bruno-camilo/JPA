package Como_mapear_heranca_da_melhor_maneira.Mapped_Superclass;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Departamento {
    private String nome;

    public Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void calcularDespesasDoMes();
}
