import sys
import os

# Adiciona o caminho do diretório onde está o arquivo figures.py
sys.path.append(os.path.join(os.path.dirname(__file__), '..', 'resource'))

# Agora você pode importar o que precisar do figures.py
from figures import placa_coelho

print(placa_coelho)