import sys
import os

# Adiciona o caminho do diretório onde está o arquivo figures.py
sys.path.append(os.path.join(os.path.dirname(__file__),  '..', '..', '..', '..', 'resource'))

# Agora você pode importar tudo do figures.py
from figures import *

# Agora você pode usar as funções ou variáveis do figures.py diretamente
print(placa_coelho)  # Exemplo de uso de uma função ou variável importada