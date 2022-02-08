package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Tolsztoj","Háború és béke");

        book.register("Reg/2022/121");

        System.out.println("Szerző: " + book.getAuthor() + "; cím: " + book.getTitle() + "; Reg number: " + book.getRegNumber() );
    }
}
