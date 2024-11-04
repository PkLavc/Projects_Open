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
        Exercício 6

        A figura mostra três forças aplicadas a um baú que se desloca 3 m para a esquerda em um piso sem atrito. 
        Os módulos das forças são F{um_para_baixo} = 5 N, F{dois_para_baixo} = 9 N, e F{tres_para_baixo} = 3 N; o
        ângulo indicado é θ = 60°. No deslocamento,                                               F2 
                                                                                                ↗ θ 
        a) qual é o trabalho total realizado sobre o baú pelas três                    F1 ←  █████ 
        forças?                                                                                ↓
        b) A energia cinética do baú aumenta ou diminui?                                       F3
        ''') # exercicio 6

        print(f'''
                    F2 = 9 N
        F1        ↗ θ = 60°
        5 N ←  █████  
                 ↓
                F3 3 N
            /|
           / |             x           x
         9/  |3  cos(60) = ― = {cos_60} = ― = {9 * 0.866}
         /60 |             9           9
        /____|             
          x
                      
        Resposta(s):
        6) 1,5 J''')

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