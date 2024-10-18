# f(x) = x^(2/3) + (e/3) * (π - x^2)^(1/2) * sin(a * π * x)
    # Para usar este código, instale as bibliotecas necessárias:
    # pip install qrcode[pil]
    # pip install numpy matplotlib

import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation
import qrcode
from PIL import Image

# Função para calcular f(x) para x positivo
def f_positive(x, a):
    return x**(2/3) + (np.e/3) * np.sqrt(np.pi - x**2) * np.sin(a * np.pi * x)

# Função para calcular f(x) para x negativo
def f_negative(x, a):
    return (-x)**(2/3) + (np.e/3) * np.sqrt(np.pi - x**2) * np.sin(a * np.pi * x)

# Criação da figura e dos eixos
fig, ax = plt.subplots()

# Gera 400 pontos de -5 a 5
x = np.linspace(-5, 5, 400)

# Plota a função inicialmente com a = 0
line, = ax.plot(x, f_positive(x, 0), color='blue')

# Define os limites dos eixos
ax.set_xlim(-5.0, 5.0)
ax.set_ylim(-5.0, 5.0)
ax.set_xlabel("x")
ax.set_ylabel("f(x)")

# Link da música a ser convertido em QR Code
music_link = "https://www.youtube.com/watch?v=cWrxEjai4eE"
qr = qrcode.make(music_link)
qr_img = np.array(qr.convert("RGB"))  # Converte a imagem do QR Code para um formato que o Matplotlib pode usar

# Adiciona um novo eixo para o QR Code, posicionado à direita do gráfico
qr_ax = fig.add_axes([0.8, 0.1, 0.2, 0.8])
qr_ax.imshow(qr_img)  # Mostra a imagem do QR Code
qr_ax.axis('off')  # Desativa os eixos do QR Code

ax.set_aspect('equal', adjustable='box')  # Mantém a proporção igual dos eixos

# Configurações iniciais para a animação
max_a = 20  # Valor máximo de a
direction = 1  # Direção da animação (crescente)
current_a = 0  # Valor atual de a

# Função que atualiza a animação
def update(frame):
    global current_a, direction
    current_a += direction * 0.5  # Atualiza o valor de a
    if current_a >= max_a:  # Inverte a direção ao atingir o valor máximo
        direction = -1
    elif current_a <= 0:  # Inverte a direção ao atingir o valor mínimo
        direction = 1

    # Calcula os dados y para a linha a ser plotada
    ydata = np.where(x >= 0, f_positive(x, current_a), f_negative(x, current_a))
    line.set_ydata(ydata)  # Atualiza os dados da linha
    return line,

# Configura a animação
ani = animation.FuncAnimation(fig, update, frames=np.arange(0, 200), interval=50)

# Exibe o gráfico
plt.show()
