package O_eterno_problema_do_mapeamento_de_chaves_compostas.IdClass;

import java.io.Serializable;
import java.util.Objects;

public class MusicaId implements Serializable {

    private int duracaoSegundos;
    private String nome;

    public MusicaId() {
    }

    public MusicaId(int duracaoSegundos, String nome) {
        this.duracaoSegundos = duracaoSegundos;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicaId musicaId = (MusicaId) o;
        return duracaoSegundos == musicaId.duracaoSegundos && Objects.equals(nome, musicaId.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duracaoSegundos, nome);
    }
}
