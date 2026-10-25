distancia =  float(input("Informe a distancia a ser pecorrida: "))
gasolina = float (input("Preço da gasolina: "))
carro = float (input("Quantidade de litros por KM: "))
quantidade_gasolina = distancia / carro
valor_viagem = quantidade_gasolina * gasolina
print(f"Quantidade necesarria de gasolina são: {quantidade_gasolina: .2f}")
print(f"O valor de gastos são: R$ {valor_viagem: .2f} ") 