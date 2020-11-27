package ZZHlamdas.test;

import ZZGcomportamentoporparametros.Classes.Carro;
import ZZHlamdas.interfaces.CarroPredicate;
import ZZHlamdas.interfaces.CarroPredicate;

public class Lambdatest {
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        CarroPredicate carroPredicate1 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println(carroPredicate.test(new Carro("verde", 2012)));
        System.out.println(carroPredicate1.test(new Carro("verde", 2012)));
        Runnable runnable = () -> System.out.println("Dentro do run");
        new Thread(runnable).start();
    }
}

// Lambda é:
// anônima, função, passada por aí (não possui classe, diferente do método), concisa.
// Ex: (Carro carro) -> carro.getcor().equals("verde");
//     parâmetro          corpo ou função u expressão
// se não houver parãmetro coloca-se ()
// (String s) -> s.length()