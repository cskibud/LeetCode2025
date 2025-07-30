# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from typing import Optional


class Solution:
    # def reverseList2(self, head: Optional[ListNode]) -> Optional[ListNode]:
    #     if head is None: return None
    #     retNode = ListNode(head.val)
    #     while head.next is not None:
    #         head = head.next
    #         retNode = ListNode(head.val, retNode)
    #     return retNode 
    
    # in-place
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        prevNode = None
        while head:
            nextNode = head.next
            head.next = prevNode
            prevNode = head
            head = nextNode
        return prevNode    
        
        