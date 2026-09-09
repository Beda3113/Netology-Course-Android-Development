public class Book {
    private String title;
    private int releaseYear;
    private String author;
    private int pages;

    // Конструктор для заполнения всех полей
    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    // Метод, возвращающий true, если книга содержит более 500 страниц
    public boolean isBig() {
        return pages > 500;
    }

    // Метод, проверяющий, содержится ли слово в названии или имени автора
    public boolean matches(String word) {
        // Приводим к нижнему регистру для регистронезависимого поиска (опционально)
        String lowerWord = word.toLowerCase();
        return title.toLowerCase().contains(lowerWord) ||
               author.toLowerCase().contains(lowerWord);
    }

    // Метод, оценивающий стоимость книги
    public int estimatePrice() {
        int price = pages * 3;
        return Math.max(price, 250); // минимум 250 рублей
    }

    // Геттеры (не обязательны, но могут пригодиться для вывода)
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
