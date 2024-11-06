import random

# Gera uma letra maiúscula aleatória
letra_maiuscula = chr(random.randint(65, 90))

# Gera uma letra minúscula aleatória
letra_minuscula = chr(random.randint(97, 122))

# Gera um caractere especial aleatório
char_especial = chr(random.randint(33, 38))

# Cria uma lista de números aleatórios
lista_numeros = []
for i in range(5):  # Gera até 5 dígitos
    numeros = random.randint(0, 9)  # Números entre 0 e 9
    lista_numeros.append(numeros)

# Embaralha a lista de números
random.shuffle(lista_numeros)

# Converte a lista de números para uma string e remove os colchetes
lista_numeros = str(lista_numeros)[1:-1]

# Substitui as vírgulas por "*"
lista_numeros = lista_numeros.replace(',', '*')

# Exibe os valores gerados
print(letra_maiuscula, letra_minuscula, lista_numeros, char_especial)