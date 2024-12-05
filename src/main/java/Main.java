import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Введите натуральное число n: ");
                int n = scanner.nextInt();
                List<Integer> fibonacciNumbers = FibonacciGenerator.generateFibonacci(n);
                System.out.println("Первые " + n + " чисел Фибоначчи: " + fibonacciNumbers);
            } catch (Throwable var5) {
                try {
                    scanner.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            scanner.close();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (Exception var7) {
            System.err.println("Произошла ошибка. Пожалуйста, введите натуральное число.");
        }

    }
}
