function QuantidadePC() {

    const quantidade = 10;
    
    if (quantidade >= 5) {
        ValorTotal = quantidade * 1050; 
    } else {
        ValorTotal = quantidade * 1200; 
    }
    return ValorTotal; 
}

let ValorTotal = QuantidadePC(); 

console.log("O valor dos PCs ficou:", ValorTotal);
