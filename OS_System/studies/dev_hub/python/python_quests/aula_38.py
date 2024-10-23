primeiro_valor = input('Digite o primeiro valor: ')
segundo_valor = input('Digite o segundo valor: ')

if primeiro_valor < segundo_valor:
    print(
        f'{primeiro_valor=} é menor ' 
        f'que o {segundo_valor=}')
elif primeiro_valor == segundo_valor:    
    print(
        f'{primeiro_valor=} é igual '
        f'ao {segundo_valor=}')
else:
    print(
        f'{primeiro_valor=} é maior '
        f'que o {segundo_valor=}')