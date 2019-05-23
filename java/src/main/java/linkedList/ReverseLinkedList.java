package linkedList;

import entities.ListNode;

/** Reverse a singly linked list. Example: Input: 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL */
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {

    return null;
  }

  private static ListNode recursion(ListNode node) {
    if (node == null) return new ListNode(0);

    ListNode temp = recursion(node.next);
    temp.next = node;
    return null;
  }

  private static ListNode iteration(ListNode node) {
    ListNode pre = null;
    ListNode curr = node;
    ListNode next = node;
    while (curr != null) {
      next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;
    }
    return pre;
  }
}
