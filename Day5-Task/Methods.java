
public class Methods {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5,",");
        System.out.println(sb);
        sb.replace(0,5,"Hi");
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("Hello");
        System.out.println(sb1);
        sbf.append(" World");
        System.out.println(sb1);
        sbf.insert(5,",");
        System.out.println(sb1);
        sbf.replace(0,5,"Hi");
        System.out.println(sb1);
        sbf.delete(2,3);
        System.out.println(sb1);
        sbf.reverse();
        System.out.println(sb1);
    }
}
