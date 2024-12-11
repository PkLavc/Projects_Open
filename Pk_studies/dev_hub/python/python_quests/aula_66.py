""" Calculadora com while """
indice = 0
indice_repeticao = True
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

    while digitado != 's':
        if digitado != '=':
            digitado = input()

            while digitado != '=':
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
                    continue
                else:
                    try:
                        digitado = digitado.lower()
                        digitado = digitado.startswith
                        digitado = 's'
                    except:
                        print(operador_incorreto)
except:
    pass

print(resultado)

