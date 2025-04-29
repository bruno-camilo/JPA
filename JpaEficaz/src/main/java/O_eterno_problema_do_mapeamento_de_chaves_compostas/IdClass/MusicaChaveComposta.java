package O_eterno_problema_do_mapeamento_de_chaves_compostas.IdClass;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_musica")
@IdClass(MusicaId.class)
public class MusicaChaveComposta {

    @Id
    private int duracaoSegundos;

    @Id
    private String nome;

    public MusicaChaveComposta() {
    }

    public MusicaChaveComposta(int duracaoSegundos, String nome) {
        this.duracaoSegundos = duracaoSegundos;
        this.nome = nome;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicaChaveComposta that = (MusicaChaveComposta) o;
        return duracaoSegundos == that.duracaoSegundos && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duracaoSegundos, nome);
    }

    @Override
    public String toString() {
        return "MusicaChaveComposta{" +
                "duracaoSegundos=" + duracaoSegundos +
                ", nome='" + nome + '\'' +
                '}';
    }
}
