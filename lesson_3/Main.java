package lesson_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Введите число и нажмите <Enter>:");

        int value = -1;
        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
            System.out.println("Сумма: " + sum);
            System.out.println("Введите ещё одно число или 0 для выхода из программы.");
        }
        sum = 0;
        System.out.println("Сумма сброшена к " + sum + ".");

    }
}

