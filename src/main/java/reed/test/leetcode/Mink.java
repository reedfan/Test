package reed.test.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/19   最小的k个数
 * @time 17:45
 */
public class Mink {
    public static void main(String[] args) {

        int[] input = {5,3,67,9,3,2,3};
        int k = 3;
        ArrayList<Integer> list = GetLeatestNumbers_solution(input,k);
        for(Integer integer:list){
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> GetLeatestNumbers_solution(int[] input,int k){
        ArrayList<Integer> result = new ArrayList<>();
        int length = input.length;

        if(k > length || k == 0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if(maxHeap.size() != k){
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek() > input[i]){
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for(Integer integer : maxHeap){
            result.add(integer);
        }

        return result;

    }
}
