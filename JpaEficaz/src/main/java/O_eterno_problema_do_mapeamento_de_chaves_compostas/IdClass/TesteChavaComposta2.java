package O_eterno_problema_do_mapeamento_de_chaves_compostas.IdClass;

import utils.JpaUtils;

import javax.persistence.EntityManager;

public class TesteChavaComposta2 {
    public static void main(String[] args) {
        var duracaoSegundo = 196;
        var nome = "Breathe Into me";

        MusicaId musicaId = new MusicaId(duracaoSegundo, nome);

   //     MusicaChaveComposta musica = new MusicaChaveComposta(duracaoSegundo, nome);

        EntityManager entityManager = JpaUtils.getEntityManager();
        try {
            entityManager.getTransaction().begin();
 //           entityManager.persist(musica); //grava na tb_musica
            MusicaChaveComposta musica1 =  entityManager.find(MusicaChaveComposta.class, musicaId);
            entityManager.getTransaction().commit();
            System.out.println(musica1.toString());
            entityManager.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
