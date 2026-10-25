a = int(input("Digite um número. \n"))
b = int(input("Digite um número. \n"))
c = int(input("Digite um número. \n"))
if a < b and a < c:
    print (a, "e o menor. \n")
else:
    if b < a and b < c:
        print(b, "É o menor. \n")
    else:
     print(c, "É o menor. \n")