package pri;

public class Solution12 {
    public boolean checkInclusion(String s1, String s2) {
        int n2 = s2.length() - 1;
        int n1 = s1.length();
        int t = 0;
        int flag = 1;
        for (int i = 0; i < n2; i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                if (n1 == 1) {
                    return true;
                }
                //往前
                for (int j = 1; j < n1; j++) {
                    if (s1.charAt(j) != s2.charAt(i + j)) {
                        t++;
                        break;
                    }
                }
                //往后
                for (int j = 0; j < n1; j++) {
                    if (s1.charAt(j) != s2.charAt(i - j)) {
                        t++;
                        break;
                    }
                }

            }
        }
        if (t == 2) {
            return false;
        }
        if (t == 1) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        String s1 = "a";
        String s2 = "ab";
        System.out.println(s.checkInclusion(s1, s2));
    }

}
