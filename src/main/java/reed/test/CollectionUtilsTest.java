package reed.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/4/12
 * @time 10:54
 */
public class CollectionUtilsTest {

    public static void main(String[] args) {
        System.out.println(CollectionUtils.isEmpty(null));   //true
        System.out.println(CollectionUtils.isEmpty(new ArrayList())); //true
        List<String> testList = new ArrayList<String>();
        testList.add("");
        System.out.println(CollectionUtils.isEmpty(testList));  //false

        String[] arrayA = new String[] { "A", "B", "C", "D", "E", "F" };
        String[] arrayB = new String[] { "B", "D", "F", "G", "H", "K" };
        List<String> listA = Arrays.asList(arrayA);
        List<String> listB = Arrays.asList(arrayB);
        //2个数组取并集
        System.out.println(ArrayUtils.toString(CollectionUtils.union(listA, listB)));  //[A, B, C, D, E, F, G, H, K]
        System.out.println(CollectionUtils.intersection(listA,listB));  //2个数组取交集  [B, D, F]

    }
}
