public class PDataType {
    public static void main(String[] args) {
        // byte range -128  to 127
        byte a=127;
        byte b=-128;
        System.out.println(a);
        System.out.println(b);

        // short range −32,768 to 32,767
           short sh=-5;
           System.err.println(sh);


        // int range −2,147,483,648 to 2,147,483,647
        int i=100000;
        System.out.println(i);

        // long range −9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l=100000000000L;
        System.out.println(l);


        // float range 1.4E-45 to 3.4028235E38
        float f=3.14F;
        System.out.println(f);


        // double range 4.9E-324 to 1.7976931348623157E308
        double d=3.14159D;
        System.out.println(d);

        // char range 0 to 65535
        char c='A';
        System.out.println(c);
    }
}
