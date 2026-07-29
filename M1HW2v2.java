import java.util.Scanner;

public class M1HW2v2 {
    public static void main(String[] args) {
        // Создаём объект Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        
        // Запрос дохода
        System.out.print("Введите ваш доход (руб): ");
        int income = scanner.nextInt();
        
        // Запрос расхода
        System.out.print("Введите ваш расход (руб): ");
        int spending = scanner.nextInt();
        
        // Расчёт остатка
        int balance = income - spending;
        
        // Вывод результата
        System.out.println("Итого (руб):");
        System.out.println(balance);
        
        // Закрываем Scanner
        scanner.close();
    }
}
