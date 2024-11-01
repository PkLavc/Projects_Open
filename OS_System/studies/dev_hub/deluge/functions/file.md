// 1. getfilecontent
pdf_file = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
info pdf_file.getFileContent();
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services."

// 2. getfilename
file1 = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
info file1.getFileName(); // returns sample.pdf
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "sample.pdf"

// 3. getfilesize
pdf_file = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
info pdf_file.getFileSize(); // returns 132 (bytes)
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "132

// 4. getfiletype
sample_file = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
info sample_file.getFileType(); // returns pdf
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "pdf"

// 5. isfile
fileVariable = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
info fileVariable.isFile(); // returns true
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "true"

// 6. setcharset
fileVariable="Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
fileVariable.setCharSet("UTF-16");
info fileVariable;
// Nota 1: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo.
// Nota 2: A função interna setCharSet não retorna nenhum valor e, portanto, sua saída não pode ser exibida usando a declaração info. O arquivo armazenado em fileVariable será codificado com o conjunto de caracteres "UTF-16" ao ser enviado em uma solicitação HTTP usando a tarefa invoke URL. "sample.pdf"

// 7. setfilename
fileVariable = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
fileVariable.setFileName("sampleFile.pdf");
info fileVariable.getFileName() ;
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "sampleFile.pdf"

// 8. setfiletype
fileVariable = "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample");
fileVariable.setFileType("pdf");
info fileVariable.getFileType() ;
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "pdf"

// 9. extract
zip_file= "Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf").compress("compressed_file");
file_collection = zip_file.extract();
info file_collection ;
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "{"sample.pdf":"sample.pdf"}"

// 10. compress
fileVariable ="Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
zip_file = fileVariable.compress("compressed_file");
info zip_file;
// Nota: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo. "compressed_file.zip"

// 11. tofile
pdf_file="Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
info pdf_file; // retorna "sample.pdf"

// 12. setparamname
fileVariable ="Deluge, or Data Enriched Language for the Universal Grid Environment, is an online scripting language integrated with Zoho services.".tofile("sample.pdf");
fileVariable.setParamName("samplefile");
info fileVariable;
// Nota 1: Aplicar esta função em arquivos obtidos usando a tarefa invokeURL é o caso de uso ideal. No entanto, por motivos de segurança, não podemos usar invokeURL para demonstrações públicas, portanto, usamos a função toFile para demonstrar funções de arquivo.
// Nota 2: A função interna setParamName não retorna nenhum valor e, portanto, sua saída não pode ser exibida usando a declaração info. O nome do parâmetro "samplefile" será definido para o arquivo armazenado em fileVariable ao ser enviado em uma solicitação HTTP usando a tarefa invoke URL. "sample.pdf"


