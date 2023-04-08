package listaBinaria;

public class ListaBinaria {
    public Integer pesquisaBinaria(int item, int[] lista) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (int) (baixo + alto) / 2;
            int chute = (int) lista[meio];

            if (chute == item) {
                System.out.println(" VC ESCOLHEU " + chute + " NA POS " + meio);
                return chute;
            }

            // tudo do meio pra cima não vale mais
            if (chute > item) {
                alto = meio - 1;
            }

            // tudo do meio pra baixo não vale mais
            else {
                baixo = meio + 1;
            }
        }

        return null;
    }
}
