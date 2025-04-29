package capitulo2.Entidades_e_o_seu_papel_no_banco_de_dados;

import javax.persistence.*;

@Entity
@Table(name = "tb_music_2421638")
public class Musica {

    @Id
    private int id;

    @Basic(optional = false)
    @Column(name = "NM_MUSICA", length = 100, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
