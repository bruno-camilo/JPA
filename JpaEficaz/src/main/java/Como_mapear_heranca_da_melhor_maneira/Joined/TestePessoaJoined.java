package Como_mapear_heranca_da_melhor_maneira.Joined;

import Como_mapear_heranca_da_melhor_maneira.single_table.PessoaFisica;
import Como_mapear_heranca_da_melhor_maneira.single_table.PessoaJuridica;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TestePessoaJoined {
    public static void main(String[] args) {
        EntityManager em = JpaUtils.getEntityManager();
        try {
            List<PessoaHerancaJoined> pessoas = new ArrayList<>();
            var pf = new PessoaFisicaJoined("Snakonwu", "469.259.280-09");
            pessoas.add(pf);
            var pj = new PessoaJuridicaJoined("Maitê e Tomás Adega Ltda", "14.433.888/0001-60");
            pessoas.add(pj);

            em.getTransaction().begin();
            for (PessoaHerancaJoined pessoa: pessoas)
                em.persist(pessoa);
            em.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            em.close();
        }



    }
}
