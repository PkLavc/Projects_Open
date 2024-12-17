# Comandos teclado
    Selecionar as linhas e;
        Ctrl / 
            Coloca # em todas 
        ctrl c
            Copia as linhas por completo
        ctrl v
            ^^^ Cola as linhas copiadas por completo 
        shift tab
            Tira um tab da linha seleciona
        Ctrl F2
            Mudar o nome em serie das variaveis
# Conversion flags
    !r
        Substitui: __repr__ #Para ver a representação do objeto (útil para depuração).
            texto = "Olá, Mundo!"
            print(f'A representação oficial é: {texto!r}')  
                A representação oficial é: 'Olá, Mundo!'
    !s
        Substitui: __str__ #Para ver a string "normal".
            texto = "Olá, Mundo!"
            print(f'A representação amigável é: {texto!s}') 
                A representação amigável é: Olá, Mundo!
    !a     
        Substitui: ascii() #Para ver a representação ASCII, útil quando se trabalha com caracteres especiais.
            nome = "Pythön"
            print(f'A representação ASCII é: {nome!a}')  
                A representação ASCII é: 'Pythön'     

# Interpolação
    s - string
    d e i - int
    f - float
    x e X - Hexadecimal (ABCDEF0123456789)
        nome = 'Luiz'
        preco = 1235,659898985
        variavel = '%s, o preço é R$%.2f' % (nome, preco)
        print(variavel)
            Luiz, o preço é R$1235,66

        print('O hexadecimal de %d é %04x' % (15, 15))
            O hexadecimal de 15 é 000f  

        numero = 15
        print(f'O hexadecimal de {numero} é {numero:04x}')
            O hexadecimal de 15 é 000f 

# f - strings
    s - string
    d - int
    f - float
    .<número de dígitos>f
        print(f'{1523,23656545:,.1f}')
            1,523,2
    x ou X - Hexadecimal
    (Caractere)(><>)^(quantidade)
    > - Esquerda
        variavel = 'ABC'
        print(f'{variavel: >10}')
                   ABC  #7 espaços
    < - Direita
        variavel = 'ABC'
        print(f'{variavel: <10}.')
            ABC       .  #7 espaços
    ^ - Centro
        variavel = 'ABC'
        print(f'{variavel:$^10}.')
            $$$ABC$$$$.  #7 $
    Sinal - + ou -
        Ex.: 0>-100,.1f
    Conversion flags - !r !s !a

# Comandos 
    \ 
        Faz com que possa usar, por exemplo as aspas como str
    , sep=' '
        Entre as ' ' colocar o separador. Ex: 
            print(12, 23, sep='-')   
                12-23
    , end='\n'         
        Entre as ' ' colocar no final (De padrao tem o quebra de linha '\n'). Ex: 
            print(12, 23, end='bla')
                12 13bla
    \n
        Quebra de linha   
            print('Ola mundo \nits me')        
                  Ola mundo 
                  its me
    int()
        Converter para int
            print(int('1'), type(int('1')))     
            print(int('1') + 1)     
                1 <class 'int'> 
                2     
    bool()
        Converter para booleano
            print(bool('')) 
            print(bool(' ')) 
                False
                True
    //
        Divisao inteiros
            print(10 // 3) 
                3.0       
    **
        Potencia
            print(2 ** 2 )      
                4         
    %
        Resto divisao (Verificar se e par ou impar por ex) 
            print( 52 % 2)
                0        
    ...
        Ellipsis
            ... # Ele sozinho nao gera nada   
    pass
        Praticamente a mesma coisa q "...", porem restrito a blocos de codigos    
    in
        Verificar se esta na string por exemplo o valor. Ex:
        nome = 'Jenifer' 
        print('fer' in nome)
            True

        exemplo1 = 'John'
        exemplo2 = 'Jo'
        if exemplo1 in exemplo2:
        print(True) 
            True   
    not in
        Inverso de in ^^
        nome = 'Jenifer' 
        print('Mane' not in nome)
            True            

# Formatacao                
    :.2f
        Formatar float para casas decimais
            altura = 1.80
            linha_1 = f'{altura:.2f} de altura,'    
                1.80 de altura,
    f   
        f-strings = formatacao
            linha_1 = f'{nome} tem'    
                PK Araujo tem 
    {}
        Usar variavel dentro de variavel. EX:
            nome = 'PK Araujo'
            altura = 1.80
            linha_1 = f'{nome} tem'    
                PK Araujo tem     
    .format
        formatar
            a = 'A'
            b = 'D'
            C = 56.595
            string = 'a={} b={1} c{:.2f} {}'
            formato = string.format(a, b, c, 123)
            print(formato)
                a=A b=D c56.59 123  

            nome = "Luiz"
            idade = 23
            formato = '{1} tem {0} anos'
            print(formato.format(nome, idade))
                23 tem Luiz anos
 
# Parametro
        Nome variante. Ex: 
            a = 'A'
            b = 'D'
            C = 56.595
            string = 'a={} b={1} c{nome3:.2f}'  # nome3 
            formato = string.format(
                a, b, nome3=c,                  # nome3, precisa nomear todos para frente*
                )                            

# Class
    type() 
        Entre as () usar oque verificar em relacao ao tipo. Ex: 
            print(       type('Ola')       )
            print(       type(213)       )
            print(type(21.3), type(58.9), type("Ola"))
            print(       type(10==10)       )
                <class 'str'> 
                <class 'int'> 
                <class 'float'> <class 'float'> <class 'str> 
                <class 'bool'> 
