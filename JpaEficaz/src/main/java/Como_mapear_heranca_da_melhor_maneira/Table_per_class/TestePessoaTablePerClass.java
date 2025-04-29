package Como_mapear_heranca_da_melhor_maneira.Table_per_class;

import utils.JpaUtils;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TestePessoaTablePerClass {
    public static void main(String[] args) {
        EntityManager em = JpaUtils.getEntityManager();
        System.out.println(em.toString());
        try {
            List<PessoaHerancaTablePerClass> pessoas = new ArrayList<>();
            var pf = new PessoaFisicaTablePerClass("Snakonwu", "469.259.280-09");
            pessoas.add(pf);
            var pj = new PessoaJuridicaTablePerClass("Maitê e Tomás Adega Ltda", "14.433.888/0001-60");
            pessoas.add(pj);

            em.getTransaction().begin();
            for (PessoaHerancaTablePerClass pessoa: pessoas)
                em.persist(pessoa);
            em.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            em.close();
        }
    }
}
