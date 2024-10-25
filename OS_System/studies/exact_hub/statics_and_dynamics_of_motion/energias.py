import sys
import os
sys.path.append(os.path.join(os.path.dirname(__file__), '..'))
from bd import *

# ===================================== Lista 3 - Energia Cinética ======================================
while True:
    while True:

        print(f'''\t\t\t\tLista de Exercícios - 3 (Energia Cinética)
        Formula {energia_cinetica}
        m  =  Distancia em Metros (m)
        v{ao_quadrado} =  Velocidade ao quadrado
        ''')

        print('''

        Exercício 1

        Um projétil de metralhadora de 25g não consegue atravessar as barricadas com saco de areia do inimigo.
        Qual o trabalho realizado pela bala ao penetrar as barricadas, considerando que os tiros ocorreram a 115m
        de distância e demoraram 0,4s até o impacto? (considere a trajetória a do projétil como MRU)
        ''') # exercicio 1

        print('''
        Exercício 2

        Um automóvel de 700 kg se desloca a 36 km/h.

        a) Qual é a Ec do carro?
        b) O que acontece com a Ec do carro se ele fosse 3 vezes mais leve?
        c) O que acontece com a Ec do carro se ele fosse 2 vezes mais veloz?
        d) O que acontece com a Ec do carro se a direção da velocidade fosse alterada?
        ''') # exercicio 2

        print('''
        Exercício 3

        Um corpo de 3,0 kg está em repouso em um colchão de ar horizontal de atrito desprezível quando uma 
        força horizontal constante F é aplicada, fazendo-o se deslocar por 20 metros com uma velocidade de 3m/s. 
        Qual é a força que foi aplicada
        ao corpo?
        ''') # exercicio 3

        print('''
        Exercício 4

        Uma caixa de ferramentas é empurrada por 2 m em um piso sujo de óleo (sem atrito) de uma oficina 
        de automóveis. A figura mostra o trabalho T realizado sobre a caixa pela força horizontal constante 
        em função da posição d da caixa. A escala vertical do gráfico é definida por Ts = 6,0 J.

        a) Qual é o módulo da força?
        b) Se a caixa tivesse uma energia cinética inicial de 3 J, qual seria a energia cinética
        ao final do deslocamento de 2 m?
        ''') # exercicio 4

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
        Exercício 6

        A figura mostra três forças aplicadas a um baú que se desloca 3 m para a esquerda em um piso sem atrito. 
        Os módulos das forças são F{um_para_baixo} = 5 N, F{dois_para_baixo} = 9 N, e F{tres_para_baixo} = 3 N; o
        ângulo indicado é θ = 60°. No deslocamento,

        a) qual é o trabalho total realizado sobre o baú pelas três
        forças?
        b) A energia cinética do baú aumenta ou diminui?
        ''') # exercicio 6

        print('''
        Exercício 7

        Uma bola de basquete e uma de golfe rolam em uma superfície plana com a mesma energia cinética.
        Analise as afirmativas:
        I. A velocidade da bola de golfe é maior que a de basquete
        II. O trabalho que deve ser realizado para fazer parar a bola de golfe é menor que o trabalho que deve ser
        realizado para parar a bola de basquete
        III. Se ambas são freadas até parar por meio de forças de mesmo valor, a distância percorrida pela bola de
        golfe será maior que a percorrida pela de basquete
        IV. Se ambas colidirem contra um anteparo e pararem, o trabalho realizado pela bola de golfe será igual ao
        realizado pela de basquete
        É correto apenas o que se afirma em

        A) I e II.
        B) I e IV.
        C) III e IV.
        D) I, II e III.
        E) II, III e IV.
        ''') # exercicio 7

        print('''
        Respostas

        1) 1033 J
        2) 3500 J; 3X menor; 4X maior; permanece o mesmo
        3) 0,675 N
        4) 3 N; 6 J
        5) 170 N; 342,25 m; 58.182,5 J
        6) 1,5 J
        7) B
        ''')

        opcao = input("Pressione 'Enter' para próxima lista ou digite '0' para voltar ao início: ")
            
        if opcao == "":
            break  # Sai do loop e encerra o programa
        elif opcao == "0":
            continue  # Recomeça o loop do início
        else:
            print("Opção inválida. Tente novamente.\n")
# =============================== Lista 4 - Energia Potencial Gravitacional ==============================
    while True:

        print(f'''\t\t\t\tLista de Exercícios - 4 (Energia Potencial Gravitacional)
        Formula {energia_potencial_gravitacional}
        m  =  Distancia em Metros (m)
        g  =  Aceleração da gravidade (10 ou 9,81 m/s{ao_quadrado})
        h  =  Altura em relação ao ponto de referência (em metros, m)
        ''')

        print(f'''

        Exercício 1

        Qual é o valor da massa de uma esfera que apresenta, em um dado instante, energia potencial
        gravitacional igual a 3500 J e se encontra a uma altura de 30 m em relação ao solo? Considere o valor da
        aceleração da gravidade igual a 9,8 m/{ao_quadrado}
        ''') # exercicio 1

        print(f'''
        Exercício 2

        Dois meninos estão brincando com uma bola de futebol de massa igual a 410 g. Um deles joga a bola e 
        acerta uma vidraça. Sabendo que a vidraça se encontra a uma altura de 3,0 m do solo, qual o valor da 
        energia potencial da bola ao atingir a vidraça? Considere o valor da gravidade local igual a 9,8 m/s{ao_quadrado}.
        ''') # exercicio 2

        print('''
        Exercício 3

        Em 1975, a cobertura do velódromo de Montreal, com um peso de 360kN foi suspensa em 10cm para que
        pudesse ser centrada. Quanto trabalho foi realizado sobre esta cobertura pelas forças que a suspenderam?
        ''') # exercicio 3

        print(f'''
        Exercício 4

        Segundo relatos, em 1960, a Sra Maxwell Rogers, da cidade de Tampa, Flórida, EUA, ergueu uma das
        extremidades de um carro que havia caído em cima de seu filho quando um macaco perdeu a sustentação.
        Se, sob pânico, ela efetivamente suspendeu 4000N (cerca de {um_quarto} do peso do veículo) por 5cm, 
        quanto trabalho a sua força realizou sobre o carro?
        ''') # exercicio 4

        print('''
        Exercício 5

        No rótulo de uma lata de leite em pó está escrito: valor energético 1509J por 100 g (361 kcal). 
        Se toda energia armazenada em uma lata que contém 400 g de leite for utilizada para levantar um 
        objeto de massa 10 kg, qual seria a altura aproximada atingida por este objeto?
        a) 25 cm
        b) 15 m
        c) 400 m
        d) 2km
        e) 60 m
        ''') # exercicio 5

        print('''
        Exercício 6

        Uma corda passa por duas roldanas de massa e atrito desprezíveis. Uma caixa de 20kg está 
        pendurada em uma das roldanas. Se for exercida uma força F sobre a extremidade livre da corda,

        a) Qual deve ser a intensidade de F a fim de que a caixa
        seja suspensa com velocidade constante?
        b) Para suspender a caixa 2cm, em quantos centímetros
        deve ser puxada a extremidade livre da corda?
        c) Durante este levantamento, qual é o trabalho
        realizado sobre a caixa,
            i. Pela força transmitida via corda?
            ii. Pela força gravitacional sobre a caixa?
        ''') # exercicio 6

        print('''
        Exercício 7

        Um bloco de gelo de 45kg desce deslizando por um plano inclinado liso de 1,5m de comprimento 
        e 91cm de altura. Um trabalhador aplica uma força para cima contra o bloco de gelo na direção 
        paralela ao plano inclinado, para que o bloco desça deslizando com velocidade constante.

        a) Encontre a intensidade da força do trabalhador
        b) Quanto trabalho é realizado sobre o bloco
            i. pela força do trabalhador?
            ii. Pela força gravitacional?
            iii. Pela força normal à superfície do plano?
            iv. Pela força resultante?
        ''') # exercicio 7

        print('''
        Exercício 8

        Você deixa cair um livro de 2 kg para uma amiga que está na calçada, a uma distância D = 10 m 
        abaixo de você. Se as mãos estendidas da sua amiga estão a uma distância d = 1,5 m acima do solo,

        a) qual é o trabalho realizado sobre o livro pela força gravitacional até o livro cair nas mãos da sua amiga?
        b) Se a energia potencial gravitacional U do sistema é considerada nula no nível do solo, qual é o valor de U
            i. quando você deixa cair o livro
            ii. quando o livro chega às mãos da sua amiga?
        c) Suponha agora que o referencial de energia é 100 J ao nível do solo. Recalcule
            i. o trabalho realizado sobre o livro pela força gravitacional até o livro cair nas mãos da sua amiga
            ii. A energia potencial gravitacional do livro nas mãos de sua amiga
        ''') # exercicio 8

        print('''
        Respostas

        1) 11,9 kg
        2) 12 J
        3) 36 kJ
        4) 200 J
        5) d
        6) 98 N; 4 cm; 3,92 J; -3,92 J
        7) 267,5 N; -401,3 J; 401,3 J; 0 J; 0 J
        8) 166,6 J; 196 J; 29,4 J; 166,6 J; 129,4 J
        ''')

        opcao = input("Pressione 'Enter' para proxima lista ou digite '0' para voltar ao início: ")
        
        if opcao == "":
            break  # Sai do loop e encerra o programa
        elif opcao == "0":
            continue  # Recomeça o loop do início
        else:
            print("Opção inválida. Tente novamente.\n")
# ================================ Lista 6 - Energia Potencial Elástica ===============================
    # while True:

        print(f'''\t\t\t\tLista de Exercícios - 5 (Energia Potencial Elástica)'
        Formula {energia_potencial_elastica}
        k  =  Constante elástica da mola (em Newtons por metro, N/m)
        x  =  Deformação da mola (deslocamento em relação à posição de equilíbrio, em metros, m)
        ''')

        print('''

        Exercício 1

        Um bloco de 250 g é deixado cair em uma mola vertical, inicialmente relaxada, cuja constante elástica 
        é k = 2,5 N/cm. O bloco fica acoplado à mola, comprimindo-a em 12 cm até parar momentaneamente. Nessa
        compressão, que trabalho é realizado sobre o bloco

        a) pela força gravitacional?
        b) pela força elástica?
        c) Com que força o bloco comprime a mola?
        ''') # exercicio 1

        print('''
        Exercício 2

        Calcule a energia potencial elástica armazenada em uma mola, cuja constante elástica é 100 N/m, que 
        está comprimida, apresentando uma deformação de 45 cm.
        ''') # exercicio 2

        print('''
        Exercício 3

        Uma mola elástica ideal, submetida a ação de uma força de intensidade F = 10N, está deformada de 2,0
        cm. A energia elástica armazenada na mola é de:
        a) 0,10J
        b) 0,20J
        c) 0,50J
        d) 1,0J
        e) 2,0J
        ''') # exercicio 3

        print('''
        Exercício 4

        Quando um gatilho é desarmado, a mola da figura, que está comprimida de 20cm, lança a esfera de massa 
        0,4kg para a direita.
        Supondo desprezível o atrito e a constante da mola igual a 250 N/m,

        a) Qual a força que o gatilho está exercendo no sistema?
        b) Qual a capacidade de trabalho do sistema? 
        ''') # exercicio 4

        print('''
        Exercício 5

        Durante o semestre de primavera no MIT, residentes dos edifícios paralelos nos dormitórios do
        Campus Leste combatem uns aos outros com grandes catapultas feitas de tubos cirúrgicos fixados em
        esquadrias de janelas. Um balão cheio de água com corante é colocado em um saco preso ao tubo,
        que é então esticado por toda a largura do quarto. Suponha que o tubo se estica obedecendo a Lei de
        Hooke, com constante elástica de 100 N/m. Se o tubo é esticado 5m e depois é solto, quanto trabalho
        a força do tubo realiza sobre o balão no saco até o tempo em que o tubo atinge o seu comprimento
        indeformado?
        ''') # exercicio 5

        print('''
        Respostas

        1) 1,8J; -1,8J; 30N
        2) 10,125J
        3) a
        4) 50N; 5J
        5) 750 J
        ''')
    
    opcao = input("Pressione 'Enter' para voltar ao início ou digite qualquer coisa para sair: ")
        
    if opcao == "":
        continue  # Sai do loop e encerra o programa
    else:
        print("Opção inválida. Tente novamente.\n")