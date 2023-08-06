import java.util.HashMap;

public class leetcode_linked_list_cycle {

//      Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            HashMap<Integer,Integer> h = new HashMap<>();
            ListNode curr = head;
            // h.put(curr.val, 0);
            for(int i=0;curr!=null;curr=curr.next){
                if(h.containsKey(curr.val)){
                    return curr;
                }
                h.put(curr.val,i);
                i++;
            }
            return null;

        }
    }








}
