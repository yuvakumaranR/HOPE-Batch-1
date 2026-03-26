public class Multilevel {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.display1();
        c.display2();           
    }
}
class Father{
    void display(){
        System.out.println("Hi");
    }
}
class Son extends Father {
    void display1(){
        System.out.println("Hello");
    }
} 
class Child extends Son {
    void display2(){
        System.out.println("Welcome");
    }
}
