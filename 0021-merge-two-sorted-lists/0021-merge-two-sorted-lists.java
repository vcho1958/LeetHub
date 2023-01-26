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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = null, answerP = null;
        while(list1 != null && list2 != null){
            ListNode target = null;
            System.out.println(list1.val +""+list2.val);
            if(list1.val < list2.val){
                target = list1;
                list1 = list1.next;
            }
            else if(list2.val <= list1.val){
                target = list2;
                list2 = list2.next;
            }
            if(answer == null){
                answer = target;
                answerP = answer;
            }
            else {
                answerP.next = target; 
                answerP = answerP.next;
            };
        }
        if(list1 == null || list2 == null ){
            ListNode target = null;
            if(list1 == null)target= list2;
            if(list2 == null)target= list1;
            if(answer == null)return target;
            else answerP.next = target;
        }
        return answer;
    }
}