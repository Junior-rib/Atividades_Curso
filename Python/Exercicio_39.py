log = "admin"
senha ="1234"
bio = "bio"
print ("Bem vindo ao nosso sitema bancario. \n")
print ("Escolha a opção desejada: \n")
print ("Escolha 1 para acessar com biometria. \n")
print ("Escolha 2 para acessar com seus dados. \n")
print ("Escolha 3 para sair do app. \n")
a = int(input("Escolha a opção desejada: \n"))
if a < 1 and a >=4:
    print("Opção inválida.")
else:
    match a:
        case 1:
            c = 0
            b = input("Insira sua biometria. \n")
            if b == "bio":
                print("Acesso permitido. Cofre aberto.")
            else:
                while c <= 2:
                 print("Acesso negado. Biometria não reconhecida. \n")
                 b = input("Insira sua biometria. \n")
                c = c+1