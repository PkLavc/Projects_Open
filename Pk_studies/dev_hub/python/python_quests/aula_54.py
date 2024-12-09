"""
Faça um programa que peça ao usuário para digitar um número inteiro,
informe se este número é par ou ímpar. Caso o usuário não digite um número
inteiro, informe que não é um número inteiro.
"""
"""
Faça um programa que pergunte a hora ao usuário e, baseando-se no horário 
descrito, exiba a saudação apropriada. Ex. 
Bom dia 0-11, Boa tarde 12-17 e Boa noite 18-23.
"""
"""
Faça um programa que peça o primeiro nome do usuário. Se o nome tiver 4 letras ou 
menos escreva "Seu nome é curto"; se tiver entre 5 e 6 letras, escreva 
"Seu nome é normal"; maior que 6 escreva "Seu nome é muito grande". 
"""

opcao = input('Quest(1-3): ')
if opcao == '1':
    numero = input('Digite um numero inteiro: ')
    try:
        int(numero)
        if int(numero) % 2 == 0:
            print('O numero digitado é par')
        else:
            print('O numero digitado é impar')
    except ValueError:
        try:
            float(numero)
            print('O numero digitado nao é um numero inteiro')
        except ValueError:
            print('Voce nao digitou um numero!')
elif opcao == '2':
    horas = input('Quantas horas são? ')
    horario = horas[0] + horas[1]
    if int(horario) < 12:
        print(f'Bom dia {horas}')
    elif int(horario) < 18:
        print(f'Boa tarde {horas}')
    elif int(horario) <= 24:
        print(f'Boa noite {horas}')
    else:
        print(f'Esta vivendo em Marte para ser {horas}?')
else:
    nome = input('Qual o seu nome? ')
    contagem_nome = len(nome)
    if contagem_nome <= 4:
        print('Seu nome é curto')
    elif contagem_nome <= 6:
        print('Seu nome é normal')
    else:
        print('Seu nome é muito grande')
