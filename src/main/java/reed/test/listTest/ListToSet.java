package reed.test.listTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/15
 * @time 9:35
 */
public class ListToSet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("222");
        list.add("222");
        Set<String> set = new HashSet<>(list);
      //  set.addAll(list);
        System.out.println(set.size());




    }



}
