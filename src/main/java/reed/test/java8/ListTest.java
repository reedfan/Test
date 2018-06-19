package reed.test.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/23
 * @time 10:40
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        System.out.println("---------list lambda --------");
        items.forEach(item-> System.out.println(item));

        items.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

        Map<String,Integer> itemMap = new HashMap<>();
        itemMap.put("A", 10);
        itemMap.put("B", 20);
        itemMap.put("C", 30);
        itemMap.put("D", 40);
        itemMap.put("E", 50);
        itemMap.put("F", 60);
        for(Map.Entry<String,Integer>entry : itemMap.entrySet()){
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        System.out.println("---------------------map   lambda");
        itemMap.forEach((k,v)-> System.out.println("Item : " + k + " Count : " + v));

        itemMap.forEach((k,v)->{
            if("C".equals(k)){
                System.out.println(k);
            }
        });




    }
}
