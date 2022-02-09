package introdate;

import java.time.LocalDateTime;

public class Exam {
    private String subject;
    LocalDateTime examDate;

    public Exam(String subject, LocalDateTime examDate) {
        this.subject = subject;
        this.examDate = examDate;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public String getMessage() {
        String message;

        message = "The exam in subject " + subject + " will be on the ";
        message += examDate.getDayOfMonth() + "th ";
        message += examDate.getMonth();
        return message;
    }
}
