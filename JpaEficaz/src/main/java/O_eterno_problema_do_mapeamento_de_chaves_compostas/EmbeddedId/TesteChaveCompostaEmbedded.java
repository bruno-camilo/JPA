package O_eterno_problema_do_mapeamento_de_chaves_compostas.EmbeddedId;

import utils.JpaUtils;

import javax.persistence.EntityManager;

public class TesteChaveCompostaEmbedded {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtils.getEntityManager();
        final  Integer SEGUNDOS = 196;
        final String  NOME = "Breathe Into me";

        MusicaId id = new MusicaId(SEGUNDOS, NOME);
        MusicaEmbeddedId musica = entityManager.find(MusicaEmbeddedId.class, id);
        System.out.println(musica.getId());

        entityManager.close();
    }
}
