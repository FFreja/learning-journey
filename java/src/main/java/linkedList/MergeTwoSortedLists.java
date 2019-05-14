package linkedList;

import entities.ListNode;

/**
 * 21. Merge Two Sorted Lists Input: Merge two sorted linked lists and return it as a new list. The
 * new list should be made by splicing together the nodes of the first two lists. Input:
 * 1->2->4,1->3->4 Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);

    ListNode dummy = head;
    while (l1 != null && l2 != null) {
      if (l1.getVal() < l2.getVal()) {
        dummy.setNext(l1);
        l1 = l1.getNext();
      } else {
        dummy.setNext(l2);
        l2 = l2.getNext();
      }
      dummy = dummy.getNext();
    }
    if (l1 != null) dummy.setNext(l1);
    if (l2 != null) dummy.setNext(l2);
    return head.getNext();
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(4);

    ListNode node4 = new ListNode(1);
    ListNode node5 = new ListNode(3);
    ListNode node6 = new ListNode(4);
    node1.setNext(node2);
    node2.setNext(node3);
    node4.setNext(node5);
    node5.setNext(node6);
    //    ListNode node7 = new ListNode(5);
    //    node6.setNext(node7);
    //    node3.setNext(node7);

    //    mergeTwoLists(node7, node1);
    mergeTwoLists(node1, node4);
    ListNode dummy = node1;
    while (dummy != null) {
      System.out.println(dummy.getVal()); // 1 1 2 3 4 4
      dummy = dummy.getNext();
    }
  }
}
