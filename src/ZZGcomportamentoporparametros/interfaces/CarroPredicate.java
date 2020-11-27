package ZZGcomportamentoporparametros.interfaces;

import ZZGcomportamentoporparametros.Classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test (Carro carro);
}

// quando vc marca a classe com interface funcional, está dizendo que só há um método.
// Só pode usar a lamda onde tem interface funcional. Lambda é a assinatura do método.

// (parametro) -> <expressao>
// (Carro carro) -> carro.getCor().equals("verde")