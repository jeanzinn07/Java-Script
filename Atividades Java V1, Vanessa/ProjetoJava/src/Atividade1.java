import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Digite a idade em anos: ");
            anos = scanner.nextInt();
            System.out.print("Digite a idade em meses: ");
            meses = scanner.nextInt();
            System.out.print("Digite a idade em dias: ");
            dias = scanner.nextInt();
        
        }

        
        int diasPorAno = 365;
        int diasPorMes = 30;

        int idadeEmDias = (anos * diasPorAno) + (meses * diasPorMes) + dias;

        System.out.println("A idade total em dias é: " + idadeEmDias);
    }
}
