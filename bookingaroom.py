from random import *
size, num2 = map(int, input().split())
listA = []
listB = []
work = bool(True)
ban = bool(True)
henlo = bool(True)
c = []
num3 =0

if(num2 == 0):
  print("1")
  
else:
  listA.extend(range(1,int(size)+1))
  
  for i in range(int(num2)):
    listB.append(int(input()))
    
  c = set(listA) & set(listB)
  
  if(set(listA) == set(listB)):
    henlo = False
    print("too late")
  
  

  if(henlo == True):
    while work == True:
      num3 = randint(1,size)
      if num3 not in c:
        print(num3)
        work = False
    
