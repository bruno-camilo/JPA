package Como_mapear_heranca_da_melhor_maneira.Mapped_Superclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecursosHumanos extends Departamento{

    @Id
    private Long id;

    @Override
    public void calcularDespesasDoMes() {
        // realiza Calculos.
    }
}
