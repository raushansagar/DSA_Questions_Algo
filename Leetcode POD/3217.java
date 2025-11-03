
// 3217. Delete Nodes From Linked List Present in Array


import  java.util.*;
class Solution{
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            st.add(nums[i]);
        }

        ListNode curr = head;
        ListNode prev = new ListNode(0);
        ListNode ans = prev;

        while(curr != null){
            if(st.contains(curr.val)){
                ListNode temp = curr;
                curr = curr.next;

                // delete curr node
                temp.next = null;
                prev.next = null;
            }
            else{
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        

        return ans.next;
    }
}