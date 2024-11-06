from captcha.image import ImageCaptcha

# Cria a imagem CAPTCHA usando uma fonte específica
image = ImageCaptcha(fonts=['Montserrat-Medium.ttf'])

# Gera o CAPTCHA com o texto 'Python'
data = image.generate('Python')

# Salva a imagem gerada como 'cap.png'
image.write('Python', 'cap.png')