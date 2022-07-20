package easy;

/**
 * *****************************
 * ***** Problem Statement ***
 * *****************************
 *You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 *  Example 1:
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 *
 * */

public class MergeTwoSortedList {

    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }

//        class Solution {
//            public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//                List<Integer> mergeList=new ArrayList<>();
//                while(list1!=null ){
//                    mergeList.add(list1.val);
//                    list1=list1.next;
//                }
//                while(list2!=null ){
//                    mergeList.add(list2.val);
//                    list2=list2.next;
//                }
//                ListNode merge=new ListNode(0,null);
//                ListNode node=merge;
//                mergeList=mergeList.stream().sorted().collect(Collectors.toList());
//                for (int value: mergeList){
//                    node.next = new ListNode(value,null);
//                    node = node.next;
//                }
//                return merge.next;
//              }
         // }
**/
    }
}
