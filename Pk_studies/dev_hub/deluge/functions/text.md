// 1. contains
string = "Hello, world!"; // A string original
substring = "world"; // Substring a ser verificada
info string.contains(substring); // Retorna true se "world" estiver presente em "Hello, world!"

// 2. startsWith
string = "Hello, world!"; // A string original
substring = "Hello"; // Substring a ser verificada no início
info string.startsWith(substring); // Retorna true se "Hello" estiver no início de "Hello, world!"

// 3. endsWith
string = "Hello, world!"; // A string original
substring = "world!"; // Substring a ser verificada no final
info string.endsWith(substring); // Retorna true se "world!" estiver no final de "Hello, world!"

// 4. equalsIgnoreCase
string1 = "hello"; // Primeira string
string2 = "HELLO"; // Segunda string (caso diferente)
info string1.equalsIgnoreCase(string2); // Retorna true se ambas as strings forem iguais, ignorando maiúsculas/minúsculas

// 5. matches
string = "abc123"; // A string a ser verificada
pattern = "\\w+"; // Regex para letras e números
info string.matches(pattern); // Retorna true se "abc123" corresponder ao padrão especificado

// 6. getAlpha
string = "abc123!"; // A string original
info string.getAlpha(); // Retorna apenas os caracteres alfabéticos: "abc"

// 7. getAlphaNumeric
string = "abc123!"; // A string original
info string.getAlphaNumeric(); // Retorna apenas os caracteres alfanuméricos: "abc123"

// 8. getOccurenceCount
string = "Hello, hello, Hello!"; // A string a ser verificada
substring = "Hello"; // Substring a contar ocorrências
info string.getOccurenceCount(substring); // Retorna 2, pois "Hello" aparece 2 vezes

// 9. getPrefix
string = "Hello, world!"; // A string original
substring = ","; // Substring para encontrar o prefixo
info string.getPrefix(substring); // Retorna "Hello", que é a parte antes da vírgula

// 10. getSuffix
string = "Hello, world!"; // A string original
substring = ","; // Substring para encontrar o sufixo
info string.getSuffix(substring); // Retorna " world!", que é a parte após a vírgula

// 11. indexOf
string = "Hello, world!"; // A string original
substring = "world"; // Substring a ser localizada
info string.indexOf(substring); // Retorna 7, que é a posição de "world" em "Hello, world!"

// 12. lastIndexOf
string = "Hello, world! Hello again!"; // A string com múltiplas ocorrências
substring = "Hello"; // Substring a ser localizada
info string.lastIndexOf(substring); // Retorna 14, que é a posição da última ocorrência de "Hello"

// 13. remove
string = "Hello, world!"; // A string original
substring = "world"; // Substring a ser removida
info string.remove(substring); // Retorna "Hello, !", removendo "world" da string

// 14. removeAllAlpha
string = "abc123!"; // A string original
info string.removeAllAlpha(); // Retorna "123!", removendo todos os caracteres alfabéticos

// 15. removeAllAlphaNumeric
string = "abc123!"; // A string original
info string.removeAllAlphaNumeric(); // Retorna "!", removendo todos os caracteres alfanuméricos

// 16. removeFirstOccurence
string = "Hello, Hello!"; // A string com múltiplas ocorrências
substring = "Hello"; // Substring a ser removida
info string.removeFirstOccurence(substring); // Retorna ", Hello!", removendo a primeira ocorrência de "Hello"

// 17. removeLastOccurence
string = "Hello, Hello!"; // A string com múltiplas ocorrências
substring = "Hello"; // Substring a ser removida
info string.removeLastOccurence(substring); // Retorna "Hello, !", removendo a última ocorrência de "Hello"

// 18. replaceAll
string = "Hello, Hello!"; // A string original
searchString = "Hello"; // Substring a ser substituída
replacementString = "Hi"; // Substring substituta
info string.replaceAll(searchString, replacementString); // Retorna "Hi, Hi!", substituindo todas as ocorrências de "Hello" por "Hi"

// 19. replaceFirst
string = "Hello, Hello!"; // A string original
searchString = "Hello"; // Substring a ser substituída
replacementString = "Hi"; // Substring substituta
info string.replaceFirst(searchString, replacementString); // Retorna "Hi, Hello!", substituindo apenas a primeira ocorrência de "Hello"

// 20. toLowerCase
string = "HELLO"; // A string original
info string.toLowerCase(); // Retorna "hello", convertendo a string para minúsculas

// 21. toUpperCase
string = "hello"; // A string original
info string.toUpperCase(); // Retorna "HELLO", convertendo a string para maiúsculas

// 22. trim
string = "   Hello, world!   "; // A string com espaços em branco
info string.trim(); // Retorna "Hello, world!", removendo espaços em branco do início e do fim

// 23. subString
string = "Hello, world!"; // A string original
info string.subString(0, 5); // Retorna "Hello", extraindo a parte da string entre os índices 0 e 5

// 24. hexToText
hex = "48656c6c6f"; // Valor hexadecimal correspondente a "Hello"
info hex.hexToText(); // Retorna "Hello", convertendo hexadecimal para texto

// 25. textToHex
string = "Hello"; // A string original
info string.textToHex(); // Retorna "48656c6c6f", convertendo texto para hexadecimal

// 26. left
string = "Hello, world!"; // A string original
info string.left(5); // Retorna "Hello", pegando os primeiros 5 caracteres da string

// 27. right
string = "Hello, world!"; // A string original
info string.right(6); // Retorna "world!", pegando os últimos 6 caracteres da string

// 28. proper
string = "hello world"; // A string original
info string.proper(); // Retorna "Hello World", capitalizando a primeira letra de cada palavra

// 29. containsIgnoreCase
string1 = "Hello, world!"; // A string original
string2 = "hello"; // Substring a ser verificada (caso diferente)
info string1.containsIgnoreCase(string2); // Retorna true se "hello" estiver presente, ignorando maiúsculas/minúsculas

// 30. notContains
string1 = "Hello, world!"; // A string original
string2 = "Goodbye"; // Substring a ser verificada
info string1.notContains(string2); // Retorna true se "Goodbye" não estiver presente na string

// 31. find
string = "Hello, world!"; // A string original
substring = "world"; // Substring a ser localizada
info string.find(substring); // Retorna 7, que é a posição da primeira ocorrência de "world"

// 32. leftPad
string = "Hello"; // A string original
info string.leftPad(10); // Retorna "     Hello", adicionando espaços à esquerda para atingir o comprimento de 10 caracteres

// 33. mid
info "Hello world, welcome to the Universe".mid(6,11); /// Retorna: "world"

// 34. rightPad
string = "Hello"; // A string original
info string.rightPad(10); // Retorna "Hello     ", adicionando espaços à direita para atingir o comprimento de 10 caracteres

// 35. startsWithIgnoreCase
string = "Hello, world!"; // A string original
substring = "hello"; // Substring a ser verificada (com letras minúsculas)
info string.startsWithIgnoreCase(substring); // Retorna true, pois "Hello" começa com "hello", ignorando maiúsculas/minúsculas

// 36. endsWithIgnoreCase
string = "Hello, World!"; // A string original
substring = "world!"; // Substring a ser verificada (com letras minúsculas)
info string.endsWithIgnoreCase(substring); // Retorna true, pois "World!" termina com "world!", ignorando maiúsculas/minúsculas

// 37. concat
string1 = "Olá"; // Primeira parte da string
string2 = " Mundo!"; // Segunda parte da string
resultado = string1.concat(string2); // Concatena as duas strings
info resultado; // Retorna "Olá Mundo!", que é a junção das duas strings

// 38. equals
string1 = "Teste"; // Primeira string
string2 = "teste"; // Segunda string (com letra minúscula)
resultado = string1.equals(string2); // Compara as duas strings
info resultado; // Retorna false, pois "Teste" e "teste" não são iguais considerando maiúsculas/minúsculas
