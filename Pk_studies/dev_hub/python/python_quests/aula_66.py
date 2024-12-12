""" Calculadora com while """
indice = 0
indice_repeticao = True
sair = False
resultado = 0
conversor = 0
operador_incorreto = (f'''Operador não reconhecido 
Use: 
+ para adição,
- para subtração,
* para multiplicação,
/ para divisão,
** para exponenciação.''')
operando_incorreto = (f'''Numero não reconhecido''')
print('''Calculadora
Para finalizar, digite [s]air ''')
digitado = input()

try:
    conversor = float(digitado)

    while sair is False :
            
            indice += 1
            if indice == 1:
                resultado = float(conversor)

            if indice_repeticao:
                digitado = input()
            indice_repeticao = True

            if digitado == '+':
                digitado = input()
                try:
                    conversor = float(digitado)
                    resultado += conversor
                except:
                    print(operando_incorreto)
                    indice_repeticao = False
            elif digitado == '-':
                digitado = input()
                try:
                    conversor = float(digitado)
                    resultado -= conversor
                except:
                    print(operando_incorreto)
                    indice_repeticao = False
            elif digitado == '*':
                digitado = input()
                try:
                    conversor = float(digitado)
                    resultado *= conversor
                except:
                    print(operando_incorreto)
                    indice_repeticao = False
            elif digitado == '/':
                digitado = input()
                try:
                    conversor = float(digitado)
                    resultado /= conversor
                except:
                    print(operando_incorreto)
                    indice_repeticao = False
            elif digitado == '**':
                digitado = input()
                try:
                    conversor = float(digitado)
                    resultado **= conversor
                except:
                    print(operando_incorreto)
                    indice_repeticao = False
            elif digitado == '=':
                print(resultado)
            else:
                sair = digitado.lower().startswith('s')
                if sair is True:
                    break
                else:
                    print(operador_incorreto)
except:
    pass

print(resultado)

