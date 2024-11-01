// 1. isDate
data = "2024-11-01"; // Data no formato de texto
resultado = isDate(data); // Verifica se é uma data
info resultado; // Retorna true

// 2. isNull
valor = null; // Valor nulo
resultado = isNull(valor); // Verifica se o valor é nulo
info resultado; // Retorna true

// 3. isNumber
numero = 123.45; // Número decimal
resultado = isNumber(numero); // Verifica se é um número
info resultado; // Retorna true

// 4. isText
texto = "Olá, mundo!"; // String de texto
resultado = isText(texto); // Verifica se é uma string
info resultado; // Retorna true

// 5. isBlank
valor = ""; // String vazia
resultado = isBlank(valor); // Verifica se é vazio
info resultado; // Retorna true

// 6. toText
numero = 123; // Número
resultado = toText(numero); // Converte número em texto
info resultado; // Retorna "123"

// 7. toNumber
hexadecimal = "0x1F"; // String hexadecimal
resultado = toNumber(hexadecimal); // Converte hexadecimal em número
info resultado; // Retorna 31

// 8. text
valor = 123.456; // Número
resultado = text(valor, "0.00"); // Converte para formato de texto com duas casas decimais
info resultado; // Retorna "123.46"

// 9. toDecimal
numero = "123.45"; // Número em formato de texto
resultado = toDecimal(numero); // Converte para decimal
info resultado; // Retorna 123.45

// 10. toDate
dataTexto = "01/11/2024"; // Data em formato de texto
resultado = toDate(dataTexto); // Converte para formato de data reconhecido
info resultado; // Retorna "11-Jan-2024"

// 11. toDateTime
dataHoraTexto = "01/11/2024 10:30"; // Data e hora em formato de texto
resultado = toDateTime(dataHoraTexto); // Converte para formato de data e hora reconhecido
info resultado; // Retorna "11-Jan-2024 10:30:00"