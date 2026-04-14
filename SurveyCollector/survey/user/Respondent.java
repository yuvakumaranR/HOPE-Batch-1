package survey.user;
import java.util.*;
import survey.model.*;

public class Respondent extends User {

    public Respondent(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println("Respondent");
    }

    public void answerSurvey(Survey s) {
        Scanner sc = new Scanner(System.in);

        for (Question q : s.getQuestions()) {
            System.out.println(q.getText());

            String ans = sc.nextLine();
            if (ans.isEmpty()) {
                System.out.println("Empty answer not allowed");
                ans = sc.nextLine();
            }

            s.saveAnswer(ans);
        }
    }
}