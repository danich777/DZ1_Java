import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task1();
        task2();
        //task3();
    }

    static void task1() {
        //1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("N-ое треугольного число (сумма чисел от 1 до "
                + n + ") равно: " + sum);
    }

    static void task2() {
        //2. Вычислить n! (произведение чисел от 1 до n)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа "
                + n + " равен: " + result);
    }

    static void task3() {
        //3. Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.
        // Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)

        for (int i = 1; i < 1000; ++i) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                System.out.println(i);
        }
    }
}