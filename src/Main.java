public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("That tinh", "From trinh dinh quang", "12004", 59.99f);
        Book book = new Book("Java", "Ngon ngu lap trinh", "67890", 39.99f, "Dat", 100, "Programming");

        System.out.println("Thong tin mp3:");
        mp3.showInfo();

        System.out.println("\nthong tin book:");
        book.showInfo();
    }
}
