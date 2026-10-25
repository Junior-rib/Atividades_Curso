hinicial = int(input("Hora do inicio do jogo. \n"))
if hinicial < 0:
    print("hora invalida.\n")
else:
    if hinicial > 23:
        print("hora invalida. \n")
    else:
        minicial = int(input("Minuto do inicio do jogo. \n"))
        if minicial < 0: 
            print ("Minuto invalido. \n")
        else:
            if minicial > 59:
                print("Minuto invalido. \n")
            else:
                hfinal = int(input("Hora do final do jogo. \n"))
                if hfinal < 0:
                  print("hora invalida.\n")
                else:
                  if hfinal > 23:
                   print("hora invalida. \n")
                  else:
                     mfinal = int(input("Minuto do final do jogo. \n"))
                     if mfinal < 0:
                        print("Minuto invalido. \n")
                     else:
                        if mfinal > 59:
                         print("Minuto invalido. \n")
                        else:
                           if hinicial > hfinal and minicial > mfinal:
                              resultadom =  (minicial + mfinal - 58) +(hinicial*60) + (hfinal *60) -(23 *60)
                              resultadoh = 0
                              print(resultadoh , resultadom)