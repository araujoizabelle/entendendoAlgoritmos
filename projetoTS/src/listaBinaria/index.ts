export default class ListaBinaria {
    public PesquisaBinaria (item: number, lista: Array<number>): number | null {
        let baixo = 0;
        let alto = lista.length - 1;

        while(baixo <= alto) {
            let meio = (baixo + alto) / 2;
            let chute = lista[meio];

            if (chute === item) {
                console.log(`VC ESCOLHEU ${chute} NA POSICAO ${meio}`);
                return chute;
            }

            // tudo do meio pra cima não vale mais
            if (chute > item) {
                alto = meio - 1;
            } 

            // tudo do meio pra baixo não vale mais
            // elseif (chute < item) {
            baixo = meio + 1;
        }
        return null;
    }
}