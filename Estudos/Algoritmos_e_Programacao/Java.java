import java.util.Scanner;

public class Java {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numeroInteiro = ler.nextInt();
        ler.nextLine();
        System.out.println("O numero inteiro digitado foi "+numeroInteiro);

        System.out.println("Digite uma palavra:");
        String outraCoisa = ler.nextLine(); // Problema aqui
        System.out.println("A palavra digitada foi "+outraCoisa);

        ler.close();
        }
}
