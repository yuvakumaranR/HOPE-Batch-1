import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Item> catalog = new ArrayList<>();

    void add(Item item) {
        catalog.add(item);
        System.out.println(item.title + " added.");
    }

    void remove(Item item) {
        catalog.remove(item);
        System.out.println(item.title + " removed.");
    }

    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Programming", "yuva", 2020, "1234567890");
        Book b2 = new Book("Data Structures", "vignesh", 2019, "0987654321");
        Magazine m1 = new Magazine("Tech Today", "sivachandran", 2023, 45);

        lib.add(b1);
        lib.add(b2);
        lib.add(m1);

        b1.show();
        b2.show();
        m1.show();

        lib.remove(b2);
        b1.show();
        m1.show();
    }
}

class Item {
    String title, author;
    int year;
    boolean available = true;

    Item(String t, String a, int y) { title = t; author = a; year = y; }

    void show() {
        System.out.println(title + " | " + author + " | " + year + " | Available: " + (available ? "Yes" : "No"));
    }
}

class Book extends Item {
    String isbn;
    Book(String t, String a, int y, String i) { super(t, a, y); isbn = i; }

    @Override
    void show() {
        super.show();
        System.out.println("ISBN: " + isbn + " | Type: Book\n");
    }
}

class Magazine extends Item {
    int issue;
    Magazine(String t, String a, int y, int i) { super(t, a, y); issue = i; }

    @Override
    void show() {
        super.show();
        System.out.println("Issue: " + issue + " | Type: Magazine\n");
    }
}
