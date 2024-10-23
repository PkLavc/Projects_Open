from pathlib import Path
import sys

# Adiciona o caminho do diretório onde está o arquivo figures.py
sys.path.append(str(Path(__file__).resolve().parents[3] / 'resource'))

"""
Z:\
└── Users\
    └── PC\
        └── Desktop\
            └── SO.System\
                └── Projects\
                    └── Projects_Open\
                        └── OS_System\
                            ├── studies\
                            │   └── dev\
                            │       └── python\
                            │           └── import.py
                            └── resource\
                                └── figures.py
"""

# Agora você pode importar tudo do figures.py
from figures import *

# Agora você pode usar as funções ou variáveis do figures.py diretamente
print(placa_coelho)  # Exemplo de uso de uma função ou variável importada