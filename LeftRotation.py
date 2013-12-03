n, d = map(int, raw_input().strip().split(" "))
arr = map(int, raw_input().strip().split(" "))

for _ in range(d):
    el = arr.pop(0)
    arr.append(el)
    
print " ".join(str(el) for el in arr)