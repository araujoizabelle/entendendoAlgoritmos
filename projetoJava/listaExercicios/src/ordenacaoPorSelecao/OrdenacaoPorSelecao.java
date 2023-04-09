package ordenacaoPorSelecao;

import java.util.ArrayList;

public class OrdenacaoPorSelecao {
    private Integer buscaMenorItem(ArrayList<Integer> array) {
        // as duas variaveis ja presumem o valor int por causa do tipo do array
        var menorNumero = array.get(0);
        for (int i = 0; i <= array.size() - 1; i++) {
            if (array.get(i) < menorNumero)
                menorNumero = array.get(i);
        }
        return menorNumero;
    }

    public ArrayList<Integer> ordenaPorSelecao(ArrayList<Integer> arr) {
        var novoArray = new ArrayList<Integer>();
        var antigoArray = new ArrayList<Integer>(arr);
        var originalSize = antigoArray.size();

        for (int i = 0; i <= originalSize - 1; i++) {
            var menor = buscaMenorItem(antigoArray);
            novoArray.add(menor);
            antigoArray.remove(menor);
        }
        return novoArray;
    }

}
