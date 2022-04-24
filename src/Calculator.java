import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        int ans;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        operand1 = scanner.nextInt();
        operand2 = scanner.nextInt();
        System.out.println("+,-,/,*");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                ans = operand1 + operand2;
                break;
            case '-':
                ans = operand1 - operand2;
                break;
            case '*':
                ans = operand1 * operand2;
                break;
            case '/':
                ans = operand1 / operand2;
                break;
            default:
                System.out.printf("Error!");
                return;
        }
        System.out.printf(operand1 + " " + operation + " " + operand2 + " = " + ans);
    }
}
