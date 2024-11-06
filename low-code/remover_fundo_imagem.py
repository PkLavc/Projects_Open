from rembg import remove
from PIL import Image

# Abrindo a imagem de entrada
input_image = Image.open('imgfundo.jpg')

# Removendo o fundo da imagem
output_image = remove(input_image)

# Salvando a imagem com o fundo removido
output_image.save('img1.png')