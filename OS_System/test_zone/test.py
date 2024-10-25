import sys
import os
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))


# ===================================== Lista 3 - Energia Cinética ======================================
while True:
    while True:

        print('''\t\t\t\tLista de Exercícios - 3 (Energia Cinética)
        Formula {energia_cinetica}
        m  =  Distancia em Metros (m)
        v{ao_quadrado} =  Velocidade ao quadrado
        ''')

        opcao = input("Pressione 'Enter' para próxima lista ou digite '0' para voltar ao início: ")
            
        if opcao == "":
            continue  # Recomeça o loop do início para a próxima lista
        elif opcao == "0":
            break  # Sai do loop e encerra o programa
        else:
            print("Opção inválida. Tente novamente.\n")
# =============================== Lista 4 - Energia Potencial Gravitacional ==============================
    while True:

        print('''\t\t\t\tLista de Exercícios - 4 (Energia Potencial Gravitacional)
        Formula {energia_potencial_gravitacional}
        m  =  Distancia em Metros (m)
        g  =  Aceleração da gravidade (10 ou 9,81 m/s{ao_quadrado})
        h  =  Altura em relação ao ponto de referência (em metros, m)
        ''')

        input('Pressione ENTER para continuar')

        opcao = input("Pressione 'Enter' para proxima lista ou digite '0' para voltar ao início: ")
        
        if opcao == "":
            break  # Sai do loop e encerra o programa
        elif opcao == "0":
            continue  # Recomeça o loop do início
        else:
            print("Opção inválida. Tente novamente.\n")
# ================================ Lista 6 - Energia Potencial Elástica ===============================
    # while True:

        print('''\t\t\t\tLista de Exercícios - 5 (Energia Potencial Elástica)'
        Formula {energia_potencial_elastica}
        k  =  Constante elástica da mola (em Newtons por metro, N/m)
        x  =  Deformação da mola (deslocamento em relação à posição de equilíbrio, em metros, m)
        ''')
    
        opcao = input("Pressione 'Enter' para voltar ao início ou digite qualquer coisa para sair: ")
        
    if opcao == "":
        continue  # Sai do loop e encerra o programa
    else:
        print("Opção inválida. Tente novamente.\n")