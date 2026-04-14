package survey.main;
import java.util.Scanner;
import survey.model.*;
import survey.user.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admin name: ");
        String adminName = sc.nextLine();

        Admin admin = new Admin(adminName);
        Survey s = admin.createSurvey();
        System.out.print("Enter Respondent name: ");
        String userName = sc.nextLine();

        Respondent r = new Respondent(userName);
        r.answerSurvey(s);

        s.showAnswers();
    }
}