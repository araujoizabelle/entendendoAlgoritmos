export default class OrdenacaoPorSelecao {
    private buscaMenor (arr: Array<number>) {
        let menorNumero = arr[0];
        for (let i = 0; i <= arr.length -1; i++) {
            if (arr[i] < menorNumero) {
                menorNumero = arr[i];
            }
        }
        return menorNumero;
    }

    public ordenaPorSelecao(arr: Array<number>) {
        let novoArray: Array<number> = [];
        const lenArr = arr.length;
        for (let i = 0; i < lenArr; i++) {
            const menor = this.buscaMenor(arr);
            const index = arr.indexOf(menor);
            arr.splice(index, 1);
            novoArray.push(menor);
        }

        return novoArray;
    }
}