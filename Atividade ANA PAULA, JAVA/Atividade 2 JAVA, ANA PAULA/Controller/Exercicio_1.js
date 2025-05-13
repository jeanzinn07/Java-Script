function valorfrete() {
    const parametro = 70;

    if (parametro <= 100) {
        const porcentagem = parametro / 100;
        const resultado1 = porcentagem * 20;
        const resultado2 = parametro + resultado1;
        return resultado2;
    } else {
        return 0; 
    }
}

let valorfreteTotal = valorfrete();

console.log("O Valor do frete mais 20% é:", valorfreteTotal);