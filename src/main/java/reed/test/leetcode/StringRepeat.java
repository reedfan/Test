package reed.test.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/20
 * @time 16:37
 * 查找第一个重复的字符
 */
public class StringRepeat {
    public static void main(String[] args) {
        String str = "abcdefbjhg";
        Set<Character> strSet = new HashSet<Character>();
        for (int i = 0; i < str.length() ; i++) {
            if(!strSet.add(str.charAt(i))){
                System.out.println(str.charAt(i));
            }

        }
    }
}
