
public class teste {
    public static void main(String[] args) {
        // Intervalo de valores de x
        int inicio = -5;
        int fim = 5;

        System.out.println("x | Função Exponencial | Função Linear | Função Quadrática");
        System.out.println("----------------------------------------------------------");

        for (int x = inicio; x <= fim; x++) {
            double exp = Math.exp(x); // Função exponencial
            double linear = 2 * x + 3; // Função linear
            double quadratica = x * x + 3 * x - 4; // Função quadrática

            System.out.printf("%d | %18.2f | %13.2f | %17.2f%n", x, exp, linear, quadratica);
        }
    }
}
