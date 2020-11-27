package ZZGcomportamentoporparametros.predicate;

import ZZGcomportamentoporparametros.Classes.Carro;
import ZZGcomportamentoporparametros.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
