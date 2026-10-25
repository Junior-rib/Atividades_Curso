valor_hora = float(input("Valor da sua hora: "))
quantidade_hora = int(input("Quantidade de horas trabalhadas: "))
valor_imposto = float(input("informe o valor de desconto: "))
salario = valor_hora * quantidade_hora
salario_liquido = salario - valor_imposto
print(f"O valor do seu salario é: R$  {salario_liquido: .2f}")









print("Digite um número e direi se e divisivel por dois e três. \n ")
nun = int(input("Digite seu número.\n"))
if nun % 2 == 0 and nun % 3 == 0:
    print("Esse número é divisivel por 2 e 3. \n")
    if nun % 2 == 0 and nun % 3 > 0:
        if nun % 2 > 0 and nun % 3 == 0:
             print()
        else:
            print ("Esse numero não é divisivel por 3, mas é divisivel por 2.\n")
    else:
     print("Esse numero não é divisivel por 2, mas é divisivel por 3.\n")
else:
             print ("O número que foi informado, nao é divisivel por 2 ou 3. \n")