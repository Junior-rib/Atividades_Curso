a = int(input("Digite um número. \n"))
b = int(input("Digite um número. \n"))
c = int(input("Digite um número. \n"))
if a > b and a > c:
    print (a, "e o maior. \n")
else:
    if b > a and b > c:
        print(b, "É o maior. \n")
    else:
     print(c, "É o maior. \n")