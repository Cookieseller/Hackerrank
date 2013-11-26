nodeLst = []
def FindMergeNode(headA, headB):
    while headA != None:
        nodeLst.append(headA)
        headA = headA.next
    
    while headB != None:
        if headB in nodeLst:
            del nodeLst[:]
            return headB.data
        headB = headB.next