package O_eterno_problema_do_mapeamento_de_chaves_compostas.EmbeddedId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tb_chave_composta")
public class MusicaEmbeddedId {

    @EmbeddedId
    private MusicaId id;

    public MusicaEmbeddedId() {
    }

    public MusicaEmbeddedId(MusicaId id) {
        this.id = id;
    }

    public MusicaId getId() {
        return id;
    }

    public void setId(MusicaId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicaEmbeddedId musica = (MusicaEmbeddedId) o;
        return Objects.equals(id, musica.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MusicaEmbeddedId{" +
                "id=" + id +
                '}';
    }
}
