package pri;

import java.util.HashMap;
import java.util.Map;
//该题涉及图论的方法
public class Solution4 {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];  //首先定义一个入度和出度的数组开辟的空间为n+1因为 村民有n个所以下标为1~n
        int[] outDegree = new int[n + 1];//这个是出度代表不相信任何人
        for (int[] tag :    //取出trust内的一个数组然后根据得到的两个下标进行++操作
                            // tag[0]代表出度(谁都不信) tag[1]代表入度被信任的数目
                trust) {
            inDegree[tag[1]]++;
            outDegree[tag[0]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[][] trust = {{1, 3}, {2, 3}};
        System.out.println(trust[0][1]);
        Solution4 s = new Solution4();
        int k = s.findJudge(3, trust);
        System.out.println(k);
    }
}
