import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String spendStr = scanner.nextLine();
                    int spend = Integer.parseInt(spendStr);
                    spendings += spend;
                    break;
                case 3:
                    printBestTaxSystem(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }

        System.out.println("Программа завершена!");
    }

    // УСН доходы: 6% от доходов
    public static int taxEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    // УСН доходы минус расходы: 15% от разницы
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, налог посчитается отрицательным
            return 0;
        }
    }

    // Выбор лучшей системы налогообложения и вывод информации
    public static void printBestTaxSystem(int earnings, int spendings) {
        int taxOnEarnings = taxEarnings(earnings);
        int taxOnEarningsMinusSpendings = taxEarningsMinusSpendings(earnings, spendings);

        if (taxOnEarnings < taxOnEarningsMinusSpendings) {
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + taxOnEarnings + " рублей");
            System.out.println("Налог на другой системе: " + taxOnEarningsMinusSpendings + " рублей");
            System.out.println("Экономия: " + (taxOnEarningsMinusSpendings - taxOnEarnings) + " рублей");
        } else if (taxOnEarningsMinusSpendings < taxOnEarnings) {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + taxOnEarningsMinusSpendings + " рублей");
            System.out.println("Налог на другой системе: " + taxOnEarnings + " рублей");
            System.out.println("Экономия: " + (taxOnEarnings - taxOnEarningsMinusSpendings) + " рублей");
        } else {
            System.out.println("Можете выбрать любую систему налогообложения");
            System.out.println("Ваш налог составит: " + taxOnEarnings + " рублей");
        }
    }
}
