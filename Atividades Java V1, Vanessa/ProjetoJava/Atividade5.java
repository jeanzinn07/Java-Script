import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        
        try ( Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Informe o valor do salário mínimo: R$ ");
            double salarioMinimo = scanner.nextDouble();  
            
            System.out.print("Informe o valor do salário do usuário: R$ ");
            double salarioUsuario = scanner.nextDouble();  
            
            double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
            
            System.out.println("O usuário ganha o equivalente a " + quantidadeSalariosMinimos + " salários mínimos.");
            
        }
    }
}
