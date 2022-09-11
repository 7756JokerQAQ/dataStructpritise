package pri;


public class Solution9 {
    public String reverseWords(String s) {
     Stack stack=new Stack();
     int n=s.length()-1;
        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i));
        }
        String temp="";
        for (int i = 0; i < n; i++) {
            temp=temp+stack.pop();
        }
    return temp;
    }

    public static void main(String[] args) {
        Solution9 s=new Solution9();
        String q = "Let's take LeetCode contest";

        System.out.println(s.reverseWords(q));
    }
  /*  public String res(String s){
        int n = s.length();
        String temp = "";
        for (int i = n - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }
        System.out.println(temp);
        String tag = "";
        for (int i = 0; i < n; i++) {
            if (temp.charAt(i) != ' ') {
                tag = tag + temp.charAt(i);
            } else {
                tag = tag + ' ';
            }
        }
        System.out.println(tag);
        return  tag;

    }*/

   /* public static void main(String[] args) {
*/
      //  String s = "Let's take LeetCode contest";
        /*int n = s.length();
        String temp = "";
        for (int i = n - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }
        System.out.println(temp);
        String tag = "";
        for (int i = 0; i < n; i++) {
            if (temp.charAt(i) != ' ') {
                tag = tag + temp.charAt(i);
            } else {
                tag = tag + ' ';
            }
        }
        System.out.println(tag);*/
       /* Solution9 sd=new Solution9();
        String g;
        g=sd.res(s);
        System.out.println(g);*/

    //}
}
