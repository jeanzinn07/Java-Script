function verificarNumero(n) {

    if (n > 0) {
    return "Positivo";
    } 
    
    else if (n < 0) {
    return "Negativo";
    } 
    
    else {
    return "Zero";
    }

}
console.log("O número 5 é:", verificarNumero(5));
   