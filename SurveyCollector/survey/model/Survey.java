package survey.model;
import java.util.*;

public class Survey {
    private List<Question> questions = new ArrayList<>();
    private List<String> answers = new ArrayList<>(); 

    public void addQuestion(String q) {
        if (q == null || q.isEmpty()) {
            System.out.println("Invalid question");
            return;
        }
        questions.add(new Question(q));
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void saveAnswer(String ans) {
        answers.add(ans);
    }

    public void showAnswers() {
        System.out.println("\n--- Answers ---");
        for (String a : answers) {
            System.out.println(a);
        }
    }
}