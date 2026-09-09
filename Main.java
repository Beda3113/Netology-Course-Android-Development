public class Main {
    public static void main(String[] args) {
        // Создаём несколько книг
        Book book1 = new Book("Война и мир", 1869, "Лев Толстой", 1300);
        Book book2 = new Book("Мастер и Маргарита", 1967, "Михаил Булгаков", 480);
        Book book3 = new Book("Краткая история времени", 1988, "Стивен Хокинг", 256);

        // Проверяем метод isBig()
        System.out.println(book1.getTitle() + " большая? " + book1.isBig()); // true
        System.out.println(book2.getTitle() + " большая? " + book2.isBig()); // false
        System.out.println(book3.getTitle() + " большая? " + book3.isBig()); // false

        // Проверяем метод matches()
        System.out.println(book1.getTitle() + " содержит 'мир'? " + book1.matches("мир"));   // true
        System.out.println(book2.getTitle() + " содержит 'булгаков'? " + book2.matches("булгаков")); // true
        System.out.println(book3.getTitle() + " содержит 'время'? " + book3.matches("время")); // true
        System.out.println(book3.getTitle() + " содержит 'Вселенная'? " + book3.matches("Вселенная")); // false

        // Проверяем estimatePrice()
        System.out.println("Цена книги '" + book1.getTitle() + "': " + book1.estimatePrice() + " руб."); // 1300*3 = 3900
        System.out.println("Цена книги '" + book2.getTitle() + "': " + book2.estimatePrice() + " руб."); // 480*3 = 1440
        System.out.println("Цена книги '" + book3.getTitle() + "': " + book3.estimatePrice() + " руб."); // 256*3 = 768, минимум 250 -> 768
    }
}
