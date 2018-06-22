package reed.test.leetcode;

/**  一个链表中包含环，请找出该链表的环的入口结点。
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/21
 * @time 14:17
 */
public class SolutionCirleK {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            //说明有环
            if(fast == slow){
                //将快指针重新指向pHead
                fast = pHead;
                //找到相遇的位置就是入口
                while (fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
