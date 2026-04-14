package survey.user;
import survey.model.Survey;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override 
    public void displayRole() {
        System.out.println("Admin");
    }

    public Survey createSurvey() {
        Survey s = new Survey();
        s.addQuestion("1. How is the course?");
        s.addQuestion("2. Rate teacher (1-5):");
        s.addQuestion("3. Is syllabus easy?");
        s.addQuestion("4. Are classes interesting?");
        s.addQuestion("5. Any suggestions?");

        return s;
    }
}