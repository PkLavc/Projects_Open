from rembg import remove
from PIL import Image

# Instalar as bibliotecas:
# pip install rembg
# pip install Pillow

def remove_background(input_path, output_path):
    try:
        # Abrindo a imagem de entrada
        input_image = Image.open(input_path)
        
        # Removendo o fundo da imagem
        output_image = remove(input_image)
        
        # Salvando a imagem com o fundo removido
        output_image.save(output_path)
        print(f"Imagem salva com sucesso: {output_path}")
    
    except Exception as e:
        print(f"Ocorreu um erro: {e}")

# Caminho da imagem de entrada e saída
input_path = 'imgfundo.jpg'
output_path = 'img1.png'

remove_background(input_path, output_path)
