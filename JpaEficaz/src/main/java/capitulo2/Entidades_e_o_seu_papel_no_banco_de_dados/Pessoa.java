package capitulo2.Entidades_e_o_seu_papel_no_banco_de_dados;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
}
