// 1. abs
numero = -5; // Um número negativo
resultado = abs(numero); // Retorna o valor absoluto
info resultado; // Retorna 5, que é o valor absoluto de -5

// 2. cos
angulo = 1.0; // Ângulo em radianos
resultado = cos(angulo); // Calcula o cosseno do ângulo
info resultado; // Retorna o cosseno de 1 radiano

// 3. sin
angulo = 1.0; // Ângulo em radianos
resultado = sin(angulo); // Calcula o seno do ângulo
info resultado; // Retorna o seno de 1 radiano

// 4. tan
angulo = 1.0; // Ângulo em radianos
resultado = tan(angulo); // Calcula a tangente do ângulo
info resultado; // Retorna a tangente de 1 radiano

// 5. acos
cosseno = 0.5; // Valor do cosseno
resultado = acos(cosseno); // Calcula o ângulo correspondente
info resultado; // Retorna o ângulo em radianos cujo cosseno é 0.5

// 6. asin
seno = 0.5; // Valor do seno
resultado = asin(seno); // Calcula o ângulo correspondente
info resultado; // Retorna o ângulo em radianos cujo seno é 0.5

// 7. atan
tangente = 1.0; // Valor da tangente
resultado = atan(tangente); // Calcula o ângulo correspondente
info resultado; // Retorna o ângulo em radianos cujo tangente é 1.0

// 8. log
numero = 10; // Número para o qual calcular o logaritmo
resultado = log(numero); // Calcula o logaritmo natural do número
info resultado; // Retorna o logaritmo natural de 10

// 9. max
numero1 = 5; // Primeiro número
numero2 = 10; // Segundo número
resultado = max(numero1, numero2); // Retorna o maior dos dois números
info resultado; // Retorna 10, que é o maior valor entre 5 e 10

// 10. min
numero1 = 5; // Primeiro número
numero2 = 10; // Segundo número
resultado = min(numero1, numero2); // Retorna o menor dos dois números
info resultado; // Retorna 5, que é o menor valor entre 5 e 10

// 11. exp
numero = 2; // Número para o qual calcular e^x
resultado = exp(numero); // Calcula e elevado à potência de 2
info resultado; // Retorna e^2

// 12. power
base = 3; // Base
exponente = 4; // Expoente
resultado = power(base, exponente); // Calcula 3 elevado a 4
info resultado; // Retorna 81, que é 3^4

// 13. round
numero = 4.567; // Número a ser arredondado
resultado = round(numero, 2); // Arredonda para 2 casas decimais
info resultado; // Retorna 4.57

// 14. sqrt
numero = 16; // Número para o qual calcular a raiz quadrada
resultado = sqrt(numero); // Calcula a raiz quadrada
info resultado; // Retorna 4, que é a raiz quadrada de 16

// 15. toHex
numero = 255; // Número inteiro
resultado = toHex(numero); // Converte o número para hexadecimal
info resultado; // Retorna "FF", que é a representação hexadecimal de 255

// 16. toWords
numero = 123; // Número a ser convertido em palavras
resultado = toWords(numero); // Converte o número para palavras
info resultado; // Retorna "cento e vinte e três"
number = -24; / Número a ser convertido em palavras
info number.toWords("en-us"); // Retorna "minus twenty-four"

// 17. floor
numero = 4.9; // Número a ser arredondado para baixo
resultado = floor(numero); // Arredonda para o inteiro mais próximo inferior
info resultado; // Retorna 4

// 18. ceil
numero = 4.1; // Número a ser arredondado para cima
resultado = ceil(numero); // Arredonda para o inteiro mais próximo superior
info resultado; // Retorna 5

// 19. isEven
numero = 6; // Número a ser verificado
resultado = isEven(numero); // Verifica se o número é par
info resultado; // Retorna true, pois 6 é um número par

// 20. isOdd
numero = 5; // Número a ser verificado
resultado = isOdd(numero); // Verifica se o número é ímpar
info resultado; // Retorna true, pois 5 é um número ímpar

// 21. log10
numero = 100; // Número para o qual calcular o logaritmo base 10
resultado = log10(numero); // Calcula o logaritmo de 100 na base 10
info resultado; // Retorna 2, pois 10^2 = 100