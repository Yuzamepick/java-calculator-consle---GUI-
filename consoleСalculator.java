import  java.util.Scanner;

public class consoleСalculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int num1 = a.nextInt(); // переменные для  хранения  значений
        int num2 = a.nextInt(); // переменные для  хранения  значений
        System.out.println("Первое число : " + num1 + "." + " Второе число : " + num2);
        Scanner b = new Scanner(System.in);
        System.out.println(""); // отступы
        System.out.println("Введите знак : ");
        String symb = b.nextLine(); // // переменные для  хранения  оператора
        System.out.println(""); // отступы
        String addition = "+";
        String subtraction = "-";
        String division = "/";
        String multiplication = "*";

        if (symb.equals(addition)) System.out.println("Результат операции: " + (num1 + num2));        // Вычисления
        if (symb.equals(subtraction)) System.out.println("Результат операции: " + (num1 - num2));     // Вычисления
        if (symb.equals(division)) System.out.println("Результат операции: " + (num1 / num2));        // Вычисления
        if (symb.equals(multiplication)) System.out.println("Результат операции: " + (num1 * num2));  // Вычисления
    }
}


