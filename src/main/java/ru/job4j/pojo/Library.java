package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Зеленая миля", 368);
        Book book1 = new Book("Унесенные ветром", 411);
        Book book2 = new Book("Граф Монте - Кристо", 387);
        Book book3 = new Book("Clean code", 256);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < books.length; i++) {
            Book bookIndex = books[i];
            System.out.println(bookIndex.getName() + " - " + bookIndex.getPageCount());
        }
        System.out.println();
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bookIndex = books[i];
            System.out.println(bookIndex.getName() + " - " + bookIndex.getPageCount());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPageCount());
            }
        }

    }
}
