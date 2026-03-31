class Children{
    Children(){
        System.out.println("Children are playing in parent class");
    }
    Children(String name){
        System.out.println(name+" is playing in the park");
    }
}
class ChildrenOverloading extends Children{
    void Children(){
        
        System.out.println("Children are playing in overring");
    }
}
public class Over {
    public static void main(String[] args) {
        ChildrenOverloading child1=new ChildrenOverloading();
        child1.Children();
    }
}
