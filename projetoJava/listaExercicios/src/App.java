import listaBinaria.ListaBinaria;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-> Lista Binaria");
        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var item = 7;

        var listaBinaria = new ListaBinaria();
        var teste = listaBinaria.pesquisaBinaria(item, lista);

        System.out.println(" retorno: " + teste);

        System.out.println("///////////");
    }
}
