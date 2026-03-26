public class Super {
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}
class Car{
    void display(){
        System.out.println("Car is the comfortable vehicle");
    }
}
class B extends Car{
    void display(){
        super.display();
        System.out.println("This is a  car");
    }
}
