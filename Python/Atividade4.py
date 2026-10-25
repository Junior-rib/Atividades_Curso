valor = int(input("Informe o valor da conta. \n"))
percentual = int(input("Informe o valor da taxa. \n"))
divisao = int(input("Informe a quantidade de amigos a racharem a conta. \n"))
total = valor * percentual /100 + valor
pagar = total / divisao
print(f"O valor total a ser pago é R$ {total: .2f}", "reais. \n")
print(f"O valor para cada amigo é R$ {pagar: .2f}", "reais. \n")








