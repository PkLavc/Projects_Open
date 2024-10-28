import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'resource')))
from botton import *
'''
OS_System
    ├──test_zone
    |   └──teste.py
    └──resource
        └── botton.py
'''
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'studies', 'exact_hub')))
from bd import *
'''
OS_System\
    ├── studies\
    │   └── exact_hub
    |       └──bd.py
    ├──test_zone
        └──test.py
'''
# =========================================== energias teste ========================================
while True:
    while True:
# ========================================== energias teste 1 =======================================

        print(f'''
        Exercício 5

        Um trenó e seu ocupante, com massa total de 85 kg, descem uma encosta e atingem um trecho horizontal 
        retilíneo com uma velocidade de 37 m/s. Se uma força desacelera o trenó até o repouso a uma taxa 
        constante de 2,0 m/s{ao_quadrado}, determine:

        a) o módulo F da força
        b) a distância d que o trenó percorre até parar
        c) o trabalho T realizado pela força sobre o trenó
        ''') # exercicio 5

        print(f'''
        m = 85 kg


        
        Resposta(s):
        5) 170 N; 342,25 m; 58.182,5 J''')

# =========================================== energias teste 2 =======================================
        opcao = input("Pressione 'Enter' para próxima lista ou digite '0' para voltar ao início: ")
            
        if opcao == "":
            break  # Sai do loop e encerra o programa
        elif opcao == "0":
            continue  # Recomeça o loop do início
        else:
            print("Opção inválida. Tente novamente.\n")

    opcao = input("Pressione 'Enter' para voltar ao início ou digite qualquer coisa para sair: ")
        
    if opcao == "":
        continue  # Sai do loop e encerra o programa
    else:
        print("Opção inválida. Tente novamente.\n")
# =========================================== energias teste F =======================================