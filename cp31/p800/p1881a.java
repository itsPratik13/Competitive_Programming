package cp31.p800;

import java.util.HashSet;

public class p1881a {
    public int MinOpsSubstr(String x, String s) {
        int n = x.length();
        int m = s.length();

        if (x.contains(s)) {
            return 0;
        }
        if (!hasSameChars(x, s) ) {
            return -1;
        }
        int minOps=0;
        String str=x;
        while(str.length()<=2*m){
           str=str+str;
            minOps++;
            if(str.contains(s)){
                return minOps;
            }
          
           

        }
        return -1;
               
    }

    public boolean hasSameChars(String x, String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : x.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        p1881a obj = new p1881a();
        String x = "abc";
        String s = "abcbc";
        int result = obj.MinOpsSubstr(x, s);
        System.out.println("Minimum operations: " + result);

    }

}
