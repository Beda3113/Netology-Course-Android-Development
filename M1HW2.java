public class M1HW2 {
    public static void main(String[] args) {
        // Проверка, что аргументы переданы
        if (args.length < 2) {
            System.out.println("Ошибка! Укажите доход и расход:");
            System.out.println("Пример: java M1HW2 44 30");
            return;
        }
        
        // Преобразование аргументов в числа
        int income = Integer.parseInt(args[0]);
        int spending = Integer.parseInt(args[1]);
        
        // Расчёт остатка
        int balance = income - spending;
        
        // Вывод результата
        System.out.println("Итого (тыс. руб):");
        System.out.println(balance);
    }
}
