import java.util.*;

public class Strings {
    char[] way1 = {'h', 'e', 'l', 'l', 'o'};
    String way2 = "hello";
    String way3 = new String("hello");
    
    public static boolean isPalindrome(String toCheck){
        int n=toCheck.length();
        int s=0;
        int l=n-1;
        /*
         * for (int i=0; i<n/2; i++){
         *      if (toCheck.charAt(i) != toCheck.charAt(n-1-i)) return false;
         * }
         */
        while (s<l){
            if (toCheck.charAt(s) != toCheck.charAt(l)) return false;
            s++;
            l--;
        }
        return true;
    }

    public static float displacement(String path){
        path = path.toLowerCase();
        int x=0, y=0;
        for (int i=0; i<path.length(); i++){
            char ch = path.charAt(i);
            if (ch == 'n') y++;
            else if (ch == 'e') x++;
            else if (ch == 's') y--;
            else x--;
        }

        return (float) Math.sqrt(x*x+y*y);
    }
    
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        // String inp = sc.next();
        String inp = sc.nextLine();
        System.out.println(inp);
        sc.close();
    }
}
