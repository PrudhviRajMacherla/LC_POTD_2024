/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) 
    {
        ListNode dummy = new ListNode(0);
        Map<Integer,ListNode> mp = new HashMap<>();
        dummy.next=head;
        mp.put(0,dummy);
        int prefix_sum=0;
        while(head!=null)
        {
            prefix_sum+=head.val;
            if(mp.containsKey(prefix_sum))
            {
                ListNode start=mp.get(prefix_sum);
                ListNode temp=start;
                int p_sum=prefix_sum;
                while(temp!=head)
                {
                    temp=temp.next;
                    p_sum+=temp.val;
                    if(temp!=head)
                        mp.remove(p_sum);
                }
                start.next=head.next;   
            }
            else
            {
                mp.put(prefix_sum,head);
            }
            head=head.next;
        }
        return dummy.next;
    }
}