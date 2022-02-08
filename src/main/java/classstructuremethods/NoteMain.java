package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Kovács Kazimír");
        note.setTopic("Receptek");
        note.setText("Végy egy kiló marhahúst maj főzd meg!");

        System.out.println(note.getNoteText() );
    }
}
