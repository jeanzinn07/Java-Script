import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int saldo;
            
            System.out.print("Informe o saldo: ");
            saldo = scanner.nextInt();
            
            int reajuste = saldo * 1 / 100;
            int saldoComReajuste = saldo + reajuste;
            
            System.out.println("Saldo original: " + saldo);
            System.out.println("Saldo com reajuste de 1%: " + saldoComReajuste);
        }
    }
}