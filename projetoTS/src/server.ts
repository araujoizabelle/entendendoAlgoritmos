import ListaBinaria from "./listaBinaria"
import OrdenacaoPorSelecao from "./ordenacaoPorSelecao";

// console.log("-> lista binaria")
// const listaBinaria = new ListaBinaria();
// const lista = [2, 4, 5, 6, 7, 3, 9];
// const item = 6;

// const teste = listaBinaria.PesquisaBinaria(item, lista);
// console.log("retorno ", teste)
// console.log("/////////")

console.log("-> ordenacao por selecao")
const ordenacaoPorSelecao = new OrdenacaoPorSelecao();
const listaDesordenada = [33, 333, 34, 22, 35, 1, 443];
const novaListaOrdenada = ordenacaoPorSelecao.ordenaPorSelecao(listaDesordenada);
console.log("nova lista ordenada ", novaListaOrdenada)
console.log("/////////")