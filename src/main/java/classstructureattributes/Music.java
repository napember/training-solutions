package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite band? ");
        song.band = scanner.nextLine();

        System.out.println("What is your favorite song title? ");
        song.title = scanner.nextLine();

        System.out.println("Length in minute? ");
        song.length = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");

    }
}
