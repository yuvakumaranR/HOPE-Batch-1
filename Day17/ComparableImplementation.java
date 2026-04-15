import java.util.*;

    class Student implements Comparable<Student>{
        int rollNo;
        String name;
        Student(int rollNo,String name){
            this.rollNo=rollNo;
            this.name=name;
        }
        public int compareTo(Student s){
            return s.rollNo - this.rollNo;
        }
    }

public class ComparableImplementation {      
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,"yuva"));
        students.add(new Student(1,"vig"));
        students.add(new Student(2,"siva"));

        Collections.sort(students);
        for(Student s: students){
            System.out.println(s.rollNo + " " + s.name);
        }
        
    }
    
}
