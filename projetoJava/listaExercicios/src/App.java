import java.util.ArrayList;
import java.util.Arrays;

import listaBinaria.ListaBinaria;
import ordenacaoPorSelecao.OrdenacaoPorSelecao;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-> Lista Binaria");
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var item = 7;

        var listaBinaria = new ListaBinaria();
        var teste = listaBinaria.pesquisaBinaria(item, lista);

        System.out.println(" retorno: " + teste);

        System.out.println("///////////");

        System.out.println("-> Ordenacao Por Selecao");
        var array = new ArrayList<Integer>(Arrays.asList(33, 333, 34, 22, 35, 1, 443));
        var ordenacaoPorSelecao = new OrdenacaoPorSelecao();
        var arrayOrdenado = ordenacaoPorSelecao.ordenaPorSelecao(array);
        System.out.println("ARRAY ORDENADO: " + arrayOrdenado);
        System.out.println("///////////");
    }
}
