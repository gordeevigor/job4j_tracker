package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War And Peace", 1300);
        Book mumu = new Book("Mu-Mu", 40);
        Book dune = new Book("Dune", 500);
        Book cleanCode = new Book("Clean code", 250);
        Book[] books = new Book[4];
        books[0] = warAndPeace;
        books[1] = mumu;
        books[2] = dune;
        books[3] = cleanCode;
        System.out.println("Let's take a look at our bookshelf:");
        for (Book book : books) {
            System.out.println("\tThe book \"" + book.getName() + "\" has " + book.getCount() + " pages");
        }
        books[0] = cleanCode;
        books[3] = warAndPeace;
        System.out.print(System.lineSeparator());
        System.out.println("Let's swap the books with index 0 and 3:");
        for (Book book : books) {
            System.out.println("\tThe book \"" + book.getName() + "\" has " + book.getCount() + " pages");
        }
        System.out.print(System.lineSeparator());
        System.out.println("Let's show the books with \"Clean code\" name:");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("\tThe book \"" + book.getName() + "\" has " + book.getCount() + " pages");
            }
        }
    }
}
