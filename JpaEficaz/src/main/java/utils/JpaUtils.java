package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaUtils {
    private static EntityManagerFactory entityManagerFactory;
    private static final String PERSISTENCE_UNIT = "PU_BANCO";
    private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<EntityManager>();

    public JpaUtils() {
    }

    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null)
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        var entityManager = threadEntityManager.get();

        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = entityManagerFactory.createEntityManager();
            JpaUtils.threadEntityManager.set(entityManager);
        }

        return entityManager;
    }

    public static void closeEntityManager() {
        EntityManager em = threadEntityManager.get();
        if (em != null) {
            EntityTransaction transaction = em.getTransaction();
            if (transaction.isActive()) {
                transaction.commit();
            }
            em.close();
            threadEntityManager.set(null);
        }
    }

    public static void closeEntityManagerFactory() {
        closeEntityManager();
        entityManagerFactory.close();
    }
}
