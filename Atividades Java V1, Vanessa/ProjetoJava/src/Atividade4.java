import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe a porcentagem do IPI: ");
            int IPI = scanner.nextInt();
            
            System.out.print("Informe o valor unitário da peça 1: ");
            int valor1 = scanner.nextInt();
            
            System.out.print("Informe a quantidade de peças 1: ");
            int quant1 = scanner.nextInt();
            
            System.out.print("Informe o valor unitário da peça 2: ");
            int valor2 = scanner.nextInt();
            
            System.out.print("Informe a quantidade de peças 2: ");
            int quant2 = scanner.nextInt();
            
            int Formula = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);
            
            
            System.out.println("O valor total a ser pago, com o IPI incluso, é: R$ " + Formula);
        }
    }
}
