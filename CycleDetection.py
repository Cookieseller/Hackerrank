visitedNodes = []
def checkForCycles(node):
    if node == None:
        return False
    
    if node in visitedNodes:
        return True
    
    visitedNodes.append(node)
    return False

def has_cycle(head):
    while head != None:
        head = head.next
        cycle = checkForCycles(head)
        if cycle:
            return cycle