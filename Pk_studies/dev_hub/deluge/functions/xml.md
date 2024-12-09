// executeXPath
xmlData = "<pessoa><nome>João</nome><idade>30</idade></pessoa>"; // Dados XML
xpathExpression = "/pessoa/nome"; // Expressão XPath para extrair o nome
resultado = executeXPath(xmlData, xpathExpression); // Executa a expressão XPath
info resultado; // Retorna "<nome>João</nome>" (João)