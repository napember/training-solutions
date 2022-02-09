package introdate;

import java.time.LocalDateTime;

public class University {
    public static void main(String[] args) {
        Exam exam1 = new Exam("Math", LocalDateTime.of(2022,5,3,8,0));
        Exam exam2 = new Exam("Prog", LocalDateTime.of(2022,5,12,10,30));

        String s;
        s = exam1.getSubject() + exam1.getExamDate();
        s += " " + exam1.examDate.getYear() + "-" + exam1.examDate.getMonth() + "-";
        s += exam1.examDate.getDayOfMonth() + " ";
        s += exam1.getExamDate().getHour() + ":" + exam1.getExamDate().getMinute();
        System.out.println( s );

        s = exam1.getSubject() + " exam will be " + (exam1.getExamDate().isBefore(exam2.getExamDate())?"before":"after" );
        s += " " + exam2.getSubject();
        System.out.println(s);

        System.out.println(exam1.getMessage());
        System.out.println(exam2.getMessage());
    }
}
