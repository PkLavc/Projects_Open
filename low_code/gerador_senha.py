import random

# Gera uma letra maiúscula aleatória
letra_maiuscula = chr(random.randint(65, 90))  # Entre 'A' (65) e 'Z' (90)

# Gera uma letra minúscula aleatória
letra_minuscula = chr(random.randint(97, 122))  # Entre 'a' (97) e 'z' (122)

# Gera um caractere especial aleatório
char_especial = chr(random.randint(33, 38))  # Caractere especial entre '!' (33) e '&' (38)

# Cria uma lista de 5 números aleatórios
lista_numeros = [random.randint(0, 9) for _ in range(5)]  # Gera 5 números entre 0 e 9

# Embaralha a lista de números
random.shuffle(lista_numeros)

# Converte a lista de números para uma string, substituindo vírgulas por '*'
lista_numeros_str = ''.join(str(num) for num in lista_numeros)  # Junta os números como uma string
lista_numeros_str = lista_numeros_str.replace(',', '*')  # Substitui as vírgulas por '*'

# Concatena todos os componentes gerados em uma única string
resultado = f"{letra_maiuscula}{letra_minuscula}{lista_numeros_str}{char_especial}"

# Exibe o resultado final
print(resultado)
