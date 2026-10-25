peca = int(input("Quantidades de pecas produzidas ao dia. \n"))
defeito =int(input("Quantidade de peças defeituosas produzidas por dia \n"))
dia = int(input("Quantidade de dias trabalhados no mes. \n"))
defeitos = defeito * dia
pecas = peca *dia
total= pecas - defeitos
print("O numero de pecas produzidas ao total são: ", pecas, "peças produzidas. \n")
print ("O total de pecas defeituosas são: ", defeitos, "peças produzidas. \n")
print ("O total de peças com otima qualidade são: ", total, "peças produzidas. \n")