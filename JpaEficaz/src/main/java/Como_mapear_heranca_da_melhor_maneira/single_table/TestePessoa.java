package Como_mapear_heranca_da_melhor_maneira.single_table;

import utils.JpaUtils;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestePessoa {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtils.getEntityManager();
        List<PessoaHeranca> pessoas = new ArrayList<>();

        try {
            entityManager.getTransaction().begin();
            var pf = new PessoaFisica("Snakonwu", "469.259.280-09");
            pessoas.add(pf);
            var pj = new PessoaJuridica("Maitê e Tomás Adega Ltda", "14.433.888/0001-60");
            pessoas.add(pj);

            for (PessoaHeranca pessoa : pessoas)
                entityManager.persist(pessoa);

            entityManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }
        }
    }
