import sys

s = raw_input().strip()
n = long(raw_input().strip())

cnt = s.count('a')
rep = int(n / len(s))

occ = rep * cnt

cutString = s[:n % len(s)]
occ += cutString.count('a')

print occ