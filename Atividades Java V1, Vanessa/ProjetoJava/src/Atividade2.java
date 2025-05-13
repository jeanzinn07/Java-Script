public class Atividade2 {
    public static void main(String[] args) {
        // Números para as duas médias
        int num1 = 8, num2 = 9, num3 = 7;
        int num4 = 4, num5 = 5, num6 = 6;

        // Calculando as médias (como inteiros)
        int media1 = (num1 + num2 + num3) / 3;
        int media2 = (num4 + num5 + num6) / 3;

        // Soma das duas médias
        int somaDasMedias = media1 + media2;

        // Média das médias (como inteiro)
        int mediaDasMedias = somaDasMedias / 2;

        // Exibindo os resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
