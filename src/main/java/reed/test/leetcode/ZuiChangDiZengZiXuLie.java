package reed.test.leetcode;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/20
 * @time 10:22
 * 最长递增子序列
 */
public class ZuiChangDiZengZiXuLie {

    public static void main(String[] args) {

        int[] array = {3,5,7,3,4,7,9,3,2};
        int[] dp = new int[array.length];
        dp[0] = 1;
        int result = 0;
        for (int i = 1; i <array.length ; i++) {
            dp[i] = 1;
            for(int j = 0;j < i;j++){
                if(array[i] > array[j]){
                    dp[i] = dp[i]>(dp[j]+1)?dp[i]:dp[j]+1;
                }
            }
            if(dp[i]>result){
                result = dp[i];
            }

        }
        System.out.println(result);
    }
}
