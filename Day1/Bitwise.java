public class Bitwise {
    public static void main(String[] args) {
        int a=6; //0101
        int b=10; //1010
        System.out.println(a&b); //0001 1
        System.out.println(a|b); //0111 7
        System.out.println(a^b); //0110 6
        System.out.println(~a);   //1010 -7
        System.out.println(a<<1); //1010 10
        System.out.println(a>>1); //0010 2
    }
}
