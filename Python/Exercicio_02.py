nun = int(input("Digite seu número.\n"))
if nun % 5 == 0 or nun % 7 == 0:
    if nun % 5 == 0 and nun % 7 > 0:
        if nun % 5 > 0 and nun % 7 == 0:
             print()
        else:
            print ("Positivo.\n")
    else:
     print("Positivo.\n")
else:
    print ("O número que foi informado,não é valido. \n")
if nun == 0:
   print("O numero 0 nao é valido, pois 0 nao e divisivel por outros numeros, porque 0/7 ou 0/5 é 0")
else:
   print()