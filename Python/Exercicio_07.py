a = int(input("Digite a idade do aluno.\n"))
if a <= 0:
    print("Idade nao e valida.\n")
else:
    if a <=4: 
        print(" O nadador ainda não possui categoria definida.\n")
    else:
        if a >=5 and a <= 7:
            print(" Infantil A.\n")
        else:
            if a <=10:
                print(" Infantil B.\n")
            else:
                if a <= 13:
                    print(" Juvenil A.\n")
                else:
                    if a <= 17:
                        print("Juvenil B. \n")
                    else:
                        if a >= 120:
                            print("Raramente um humano cehga a essa idade. \n")
                        else:
                            print("Adulto. \n")
                       