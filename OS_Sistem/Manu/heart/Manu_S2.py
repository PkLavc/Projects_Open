# f(x) = x^(2/3) + (e/3) * (π - x^2)^(1/2) * sin(a * π * x)

import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation
import qrcode
from PIL import Image

def f_positive(x, a):
    return x**(2/3) + (np.e/3) * np.sqrt(np.pi - x**2) * np.sin(a * np.pi * x)

def f_negative(x, a):
    return (-x)**(2/3) + (np.e/3) * np.sqrt(np.pi - x**2) * np.sin(a * np.pi * x)

fig, ax = plt.subplots()
x = np.linspace(-5, 5, 400)
line, = ax.plot(x, f_positive(x, 0), color='blue')

ax.set_xlim(-5.0, 5.0)
ax.set_ylim(-5.0, 5.0)
ax.set_xlabel("x")
ax.set_ylabel("f(x)")

music_link = "https://www.youtube.com/watch?v=cWrxEjai4eE"
qr = qrcode.make(music_link)
qr_img = np.array(qr.convert("RGB"))

qr_ax = fig.add_axes([0.8, 0.1, 0.2, 0.8])
qr_ax.imshow(qr_img)
qr_ax.axis('off')

ax.set_aspect('equal', adjustable='box')

max_a = 20
direction = 1
current_a = 0

def update(frame):
    global current_a, direction
    current_a += direction * 0.5
    if current_a >= max_a:
        direction = -1
    elif current_a <= 0:
        direction = 1

    ydata = np.where(x >= 0, f_positive(x, current_a), f_negative(x, current_a))
    line.set_ydata(ydata)
    return line,

ani = animation.FuncAnimation(fig, update, frames=np.arange(0, 200), interval=50)

plt.show()
