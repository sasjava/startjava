package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final int MAX_BOOKS_NUMBER = 5;
    private static Bookshelf bookshelf;

    public static void main(String[] args) {
        bookshelf = new Bookshelf(MAX_BOOKS_NUMBER);
        do {
            try {
                showBooks();
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
        } while (!run());
    }

    private static void showBooks() {
        printBookshelfTotal(bookshelf);
        printBorder();
        Book[] books = bookshelf.getBooks();
        for (Book book : books) {
            printBookInfo(book);
        }
        if (books.length > 0 && books.length < MAX_BOOKS_NUMBER) {
            printBookInfo(null);
        }
    }

    private static void printBookshelfTotal(Bookshelf bookshelf) {
        int numOfBooks = bookshelf.getNumberOfBooks();
        int emptyShelves = bookshelf.getEmptyShelves();
        System.out.print((numOfBooks == 0) ? "Шкаф пуст." : "Книг в шкафу: " + numOfBooks + ".");
        System.out.print(" Свободных полок: ");
        System.out.print((emptyShelves == 0) ? "нет" : emptyShelves);
        System.out.println(".");
    }

    private static void printBookInfo(Book book) {
        int len = bookshelf.getMaxLengthInfo();
        if (book == null) {
            System.out.println("| ..." + " ".repeat(len - 4) + "|");
        } else {
            int spaceLen = len - book.getLengthInfo();
            System.out.println("|" + book + " ".repeat(spaceLen) + "|");
        }
        printBorder();
    }

    private static void printBorder() {
        int len = bookshelf.getMaxLengthInfo();
        if (len > 0) {
            System.out.println("|" + "-".repeat(len) + "|");
        }
    }

    private static boolean run() {
        String menu = """
                \nВведите комманду:
                1. save
                2. delete
                3. find
                4. clear
                5. quit
                """;
        System.out.println(menu);
        boolean isQuit;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                isQuit = execCommand(scanner.nextLine()).equals("quit");
                break;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
        } while (1 == 1);
        if (!isQuit) {
            System.out.println("\nДля продолжения работы нажмите Enter...");
            scanner.nextLine();
        }
        return isQuit;
    }

    private static String execCommand(String command) {
        command = command.equals("1") ? "save" :
                command.equals("2") ? "delete" :
                        command.equals("3") ? "find" :
                                command.equals("4") ? "clear" :
                                        command.equals("5") ? "quit" : command;
        switch (command) {
            case "save" -> save();

            case "delete" -> delete();
            case "find" -> find();
            case "clear" -> clear();
            case "quit" -> quit();
            default -> throw new RuntimeException("Команда " + command + " не поддерживается");
        }
        return command;
    }

    private static void save() {
        if (bookshelf.isFull()) {
            throw new RuntimeException("В шкафу нет свободных мест");
        }
        System.out.println("Введите информацию о книге в формате: <Автор>, <Наименование>, <Год издания>");
        Scanner scanner = new Scanner(System.in);
        String[] bookInfo = scanner.nextLine().split(", ");
        try {
            if (bookInfo[0].isBlank()) {
                throw new RuntimeException("Отсутствует автор книги");
            }
            if (bookInfo[1].isBlank()) {
                throw new RuntimeException("Отсутствует наименование книги");
            }
            if (bookInfo[2].isBlank()) {
                throw new RuntimeException("Отсутствует год идания книги");
            }
            bookshelf.addBook(bookInfo[0], bookInfo[1], bookInfo[2]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new RuntimeException("Информация о книге не соответствует формату");
        }
    }

    private static void delete() {
        System.out.println("Введите наименование книги, которую надо удалить");
        try {
            int[] foundBooksIndex = doSearch();
            System.out.println("Убрать с полки?");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.nextLine().equals("no")) {
                bookshelf.deleteBooks(foundBooksIndex);
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());

        }
    }

    private static void find() {
        System.out.println("Введите наименование книги для поиска");
        try {
            doSearch();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int[] doSearch() {
        Scanner scanner = new Scanner(System.in);
        int[] foundBooksIndex = bookshelf.findBooks(scanner.nextLine());
        System.out.println("Найдены книги:");
        Book[] books = bookshelf.getBooks();
        for (int index : foundBooksIndex) {
            System.out.println(books[index]);
        }
        return foundBooksIndex;
    }

    private static void clear() {
        System.out.println("Очистка шкафа...");
        bookshelf.clear();
    }

    private static void quit() {
        System.out.println("Выход");
    }
}