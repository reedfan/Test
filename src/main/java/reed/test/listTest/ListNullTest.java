package reed.test.listTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/30
 * @time 14:02
 */
public class ListNullTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(String str:list){
            System.out.println(str);
        }
    }
}
