lastAns = 0
n, q = map(int, raw_input().strip().split(" "))
S0 = []

for _ in range(n):
    S0.append([])
    
for i in range(q):
    q, x, y = map(int, raw_input().strip().split(" "))
    if q == 1:
        idx = ((x ^ lastAns) % n)
        S0[idx].append(y)
    elif q == 2:
        idx = ((x ^ lastAns) % n)        
        lastAns = S0[idx][y % len(S0[idx])]
        print lastAns