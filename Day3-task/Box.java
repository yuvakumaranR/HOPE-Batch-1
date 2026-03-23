import java.util.*;
class Box{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();
        boolean bulky = false;
        boolean heavy = false;
        long volume = (long) length * width * height;
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            bulky = true;
        }
        if (mass >= 100) {
            heavy = true;
        }
        if (bulky && heavy) {
            System.out.println("Both");
        } else if (bulky) {
            System.out.println("Bulky");
        } else if (heavy) {
            System.out.println("Heavy");
        } else {
            System.out.println("Neither");
        }
    }
}