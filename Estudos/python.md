# Comandos teclado
    Selecionar as linhas e;
        ctrl / 
            Coloca # em todas 
        ctrl c
            Copia as linhas por completo
        ctrl v
            ^^^ Cola as linhas copiadas por completo        

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
