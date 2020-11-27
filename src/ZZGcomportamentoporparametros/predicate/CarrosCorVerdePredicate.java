package ZZGcomportamentoporparametros.predicate;

import ZZGcomportamentoporparametros.Classes.Carro;
import ZZGcomportamentoporparametros.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
