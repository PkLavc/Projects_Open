# with open('test.txt', 'r') as arquivo:
# # arquivo = open('test.txt','r')
# # conteudo = arquivo.read()
# print(conteudo)
# # arquivo.close()


a = 'A'
b = 'D'
c = 56.595
string = 'a={} b={} c{:.2f} {}'
formato = string.format(a, b, c, 123)
print(formato)
