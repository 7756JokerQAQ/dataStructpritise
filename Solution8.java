package pri;

public class Solution8 {
    public void reverseString(char[] s) {
        int r=s.length-1;
        int l=0;
        while(l<r){
            swap(s,l,r);
            l++;
            r--;
        }

    }
    private void swap(char[] s,int  a,int b){
        char temp;
        temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}
