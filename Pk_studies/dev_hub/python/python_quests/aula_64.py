"""
Iterando strings com while
"""
#       012345678910
nome = 'Luiz Otávio'  # Iteráveis
#      1110987654321
tamanho_nome = len(nome)
# print(nome)
# print(tamanho_nome)
# print(nome[3])

nova_string = ''
# nova_string += '*L*u*i*z* *O*t*á*v*i*o'

contador = len(nome)
i = 0
while i < contador:
    nova_string += '*' + nome[i]
    i += 1
    if i == contador:
        print(nova_string)


