import java.util.*;
class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int result = (high + 1) / 2 - (low / 2);
        System.out.println(result);
    }
}