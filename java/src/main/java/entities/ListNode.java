package entities;

import lombok.Getter;
import lombok.Setter;

//  Definition for singly-linked list.
@Getter
@Setter
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }
}
