import java.util.*;

class Student implements Comparable<Student>{
    int rollNo;
    String name;

    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
}

public class ComparableString {      
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3,"nithin"));
        students.add(new Student(1,"vishal"));
        students.add(new Student(2,"yuvaa"));
        students.add(new Student(4,"siva"));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}
