function triangulo (a, b, c){

    if ( a == b && b == c && c == a){
        return "Equilátero";
    }

    else if (a == b || b == c || c == a){
        return "Isósceles"
    }

    else {
        return "Escaleno"
    }

}

console.log ("O triangulo é:", triangulo(10, 7, 5));