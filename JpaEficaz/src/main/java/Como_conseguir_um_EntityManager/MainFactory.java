package Como_conseguir_um_EntityManager;

import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainFactory {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU_BANCO");
    public static void main(String[] args) {
        EntityManager entityManager =  JpaUtils.getEntityManager(); // usa o JPAUtils para gerenciar o conexao
        entityManager.getTransaction().begin();
            // faz algo
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
