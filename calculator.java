import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведи първо число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Въведи операция (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Въведи второ число: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Грешка: Деление на 0 не е позволено!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Невалидна операция!");
                return;
        }

        System.out.println("Резултат: " + result);
    }
}
