import os

# Lista com os nomes dos arquivos
nomes_arquivos = [
    "Nova Solicitação de Peças", "Ocorrência", 
    "Recebimento por Correio", "Serviços Cancelados", "Teste controle do estoque", "Transporte Interno"
]

# Caminho da pasta onde os arquivos serão criados
diretorio = r"C:\Users\Pk\Documents\Fluxo_de_trabalho"

# Verifica se a pasta existe
if not os.path.exists(diretorio):
    os.makedirs(diretorio)  # Cria a pasta caso não exista

# Criação dos arquivos .txt
for nome in nomes_arquivos:
    caminho_arquivo = os.path.join(diretorio, f"{nome}.txt")
    with open(caminho_arquivo, 'w') as f:
        f.write("")  # Criando o arquivo em branco

print(f"{len(nomes_arquivos)} arquivos foram criados com sucesso!")
