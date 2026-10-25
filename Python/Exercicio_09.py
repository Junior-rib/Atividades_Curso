p = 4
p1 = 3
p2 = 3
a = input("Digite o codico do aluno. \n")
if a != "aluno":
    print("Codico invalido.\n")
else:
    b = int(input("Digite a  nota do aluno.\n"))
    if b < 0 or b >= 11:
        print("Nota invalida.\n")
    else:
        c = int(input("Digite a  nota do aluno.\n"))
        if c < 0 or c >=11:
            print("Nota invalida.\n")
        else:
            d = int(input("Digite a  nota do aluno.\n"))
            if d < 0 or d >= 11:
                print("Nota invalida.\n")
            else:
               ponderada = (b*p + c*p1 + d*p2)/(p+p1+p2)
               if ponderada >= 5 and ponderada <= 10:
                   print(f"A sua media ponderada é: {ponderada: .2f}  Você está Aprovado.\n")
               else:
                   print(f"A sua media ponderada é: {ponderada: .2f}  Você está Reprovado.\n")
                
