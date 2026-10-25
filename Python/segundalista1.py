hinicial = int(input("Quando começa o jogo. \n"))
if hinicial < 0:
    print("hora invalida.\n")
else:
    if hinicial > 23:
        print("hora invalida. \n")
    else:
        hfinal = int(input("Horário do fim do jogo. \n"))
        if hfinal < 0:
            print("hora invalida.\n")
        else:
            if hfinal > 23:
             print("hora invalida. \n")
            else:
                if hfinal > hinicial:
                    resultado = hfinal - hinicial
                    print("a duraçao foi de: ", resultado, "horas. \n")
                else:
                    if hinicial > hfinal:
                        resultado = hfinal + hinicial - 22
                        print("a duraçao foi de: ", resultado, "horas. \n")