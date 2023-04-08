import ListaBinaria from "./listaBinaria"
console.log("-> lista binaria")
const listaBinaria = new ListaBinaria();
const lista = [2, 4, 5, 6, 7, 3, 9];
const item = 6;

const teste = listaBinaria.PesquisaBinaria(item, lista);
console.log("retorno ", teste)
console.log("/////////")