package capitulo2.Entidades_e_o_seu_papel_no_banco_de_dados;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_TB",
        catalog = "jpaEficaz",
        schema = "jpaEficaz")
      //  uniqueConstraints =  @UniqueConstraint(columnNames={"codigo", "nome"}))

public class Pessoa2 {
    @Id
    private int codigo;
    private String nome;
    private String outroCampo;
    private String outroNome;

    public Pessoa2(int codigo, String nome, String outroCampo, String outroNome) {
        this.codigo = codigo;
        this.nome = nome;
        this.outroCampo = outroCampo;
        this.outroNome = outroNome;
    }

    public Pessoa2() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOutroCampo() {
        return outroCampo;
    }

    public void setOutroCampo(String outroCampo) {
        this.outroCampo = outroCampo;
    }

    public String getOutroNome() {
        return outroNome;
    }

    public void setOutroNome(String outroNome) {
        this.outroNome = outroNome;
    }
}
