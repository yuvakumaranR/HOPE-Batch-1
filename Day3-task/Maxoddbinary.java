import java.util.*;
public class Maxoddbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')
                ones++;
        }
        String ans = "";
        for (int i = 0; i < ones - 1; i++) {
            ans += "1";
        }
        for (int i = 0; i < s.length() - ones; i++) {
            ans += "0";
        }
        ans += "1";
        System.out.println(ans);
    }
}