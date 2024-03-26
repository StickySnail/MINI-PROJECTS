# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:

        vals = list()
        while head.next != None:

            vals.append(head.val)
            head = head.next

            if head.val in vals:
                return True
            else:
                return False
