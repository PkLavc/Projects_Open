"""
Faça um jogo para o usuário adivinhar qual
a palavra secreta.
- Você vai propor uma palavra secreta
qualquer e vai dar a possibilidade para
o usuário digitar apenas uma letra.
- Quando o usuário digitar uma letra, você 
vai conferir se a letra digitada está
na palavra secreta.
    - Se a letra digitada estiver na
    palavra secreta; exiba a letra;
    - Se a letra digitada não estiver
    na palavra secreta; exiba *.
Faça a contagem de tentativas do seu
usuário.
"""
palavra_secreta = 'Miami'

palavra_secreta_formatada = palavra_secreta.lower()
letras_acertadas = ''
palavra_formada = ''
errou = 0

while True:

    user = input('Advinhe a palavra correta! Insira uma letra: ').lower()

    if len(user) != 1:
        print('Insira apenas uma unica letra!')
        errou += 1
        continue

    if user in palavra_secreta_formatada:
        letras_acertadas += user
    else:
        errou += 1

    palavra_formada = ''
    for letra_secreta in palavra_secreta_formatada:
        if letra_secreta in letras_acertadas:
            palavra_formada += letra_secreta 

        else:
            palavra_formada += '*'
        
    print(palavra_formada)

    if palavra_secreta_formatada == palavra_formada:
        print(f'''Yeaaaah, voce encontrou a palavra correta
Voce teve {errou} erros''')
