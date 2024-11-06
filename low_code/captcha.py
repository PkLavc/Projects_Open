from captcha.image import ImageCaptcha

# Instalar as bibliotecas:
# pip install captcha

# Cria a imagem CAPTCHA usando uma fonte específica
image = ImageCaptcha(fonts=['Montserrat-Medium.ttf'])

# Personalizações de cores
image.background_color = (255, 255, 255)  # Cor de fundo (branco)
image.text_color = (0, 0, 0)  # Cor do texto (preto)
image.distort_color = (255, 0, 0)  # Cor do distorcedor (vermelho)

# Ajustando o tamanho da imagem
image.width = 300  # Largura da imagem
image.height = 100  # Altura da imagem

# Gerando o CAPTCHA com o texto 'Python'
data = image.generate('Python')

# Salvando a imagem gerada como 'cap_custom.png'
image.write('Python', 'cap_custom.png')