import math  # Importação de biblioteca, similar ao uso de 'import' em Java

def calcular_bhaskara(a, b, c):  # Função: em Python usamos 'def', diferente de 'public void' ou 'public static'
    """Esta função calcula o delta."""
    delta = b**2 - 4 * a * c  # Cálculo do delta, note a ausência de ponto e vírgula ';'
    
    if delta < 0:  # Sem necessidade de parênteses na condição
        print("A equação não tem raízes reais")
    elif delta == 0:  # elif é como o 'else if' no Java
        raiz = -b / (2 * a)
        print(f"A equação tem uma raiz real: {raiz}")
    else:
        raiz1 = (-b + math.sqrt(delta)) / (2 * a)
        raiz2 = (-b - math.sqrt(delta)) / (2 * a)
        print(f"As raízes da equação são: {raiz1} e {raiz2}")

# Interação com o usuário, sem ponto e vírgula
a = float(input("Digite o valor de a: "))  # Note que 'input' é usado para capturar entrada do usuário, diferente de 'Scanner' no Java
b = float(input("Digite o valor de b: "))
c = float(input("Digite o valor de c: "))

calcular_bhaskara(a, b, c)  # Chamada da função, sem a necessidade de usar 'main' como em Java

print(calcular_bhaskara.__doc__) # Acessa a docstring da função .__doc__


