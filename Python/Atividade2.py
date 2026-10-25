distancia_pecorrida = float (input("Informe a distancia pecorrida: "))
tempo_corrida = int (input("Informe o tempo gasto em minutos: "))
valor_corrida = float (input("Informo o valor total da corrida: "))
valor_km = distancia_pecorrida / valor_corrida
valor_minuto = valor_corrida / tempo_corrida
print (f"O valor da distancia pecorrida por Km: R$ {valor_km: .2f}")
print(f"O valor da distancia pecorrida por Km: R$ {valor_minuto: .2f}")
print(f"O total é: {total:.2f}")
