import math

def calcular bhaskara(a, b, c):
    delta = b**2 - 4 * a * c

    if delta < 0:
        print('A equação não tem raízes reais')
    elif delta == 0:
        raiz = -b / (2 * a)
        print('A equação tem uma raiz real: {raiz}')