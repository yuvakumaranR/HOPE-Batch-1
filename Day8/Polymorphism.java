class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}
class Elephant extends Animal {
    void sound() {
        System.out.println("Elephant trumpets");
    }
}
class Monkey extends Animal {
    void sound() {
        System.out.println("Monkey chatters");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal=new Lion();//Upcasting: Lion object is being referred to by an Animal reference variable
        animal.sound();
        animal=new Elephant();
        animal.sound();
        animal=new Monkey();
        animal.sound();
    }

    
}
