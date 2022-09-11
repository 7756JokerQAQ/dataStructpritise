package pri;

public class Solution11 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length()-1;
        int res=0;
        int count=0;
        int []map=new int[128];
        for (int i = 0; i < n; i++) {
        if(map[s.charAt(i)]==0){
            map[s.charAt(i)]++;
            count++;
        }
        }
        return 1;
    }
}
