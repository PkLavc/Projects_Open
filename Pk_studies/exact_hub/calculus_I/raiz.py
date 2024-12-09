indice = 2
elevado = 1

radicando = float(input('Digite o valor do radicando: '))
pergunta = input('É uma raiz quadrada? ')

if pergunta.lower() != 'sim':
	indice = float(input('Digite o valor do índice da raiz: '))

pergunta = input('O radicando está elevado a algo? ')

if pergunta.lower() == 'sim':
	elevado = float(input('Digite o expoente do radicando: '))

raiz = radicando ** (elevado/indice)

print(f'A raiz deu {radicando ** (elevado/indice)}')
