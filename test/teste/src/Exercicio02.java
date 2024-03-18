 
import java.util.Scanner;

public class Exercicio02 {

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

