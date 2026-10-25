a = int(input("Digite seu número. \n"))
b = int(input("Digite seu número. \n"))
if a >= b and a % b == 0:
    print("São multiplos.\n")   
else:
    if b >= a and b % a == 0:
        print("São multiplos.\n")
    else:
        print("Não são multiplos.\n")