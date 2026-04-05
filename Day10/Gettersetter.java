class Name{
    private String name;
   void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

public class Gettersetter {
    public static void main(String[] args) {
        Name n=new Name();
        n.setName("Surya");
        System.out.println(n.getName());
    }
}
