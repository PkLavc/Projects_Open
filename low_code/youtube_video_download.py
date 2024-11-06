from pytube import YouTube
from pytube.exceptions import PytubeError

# Instalar as bibliotecas:
# pip install pytube

def download_video(url):
    try:
        # Cria o objeto YouTube com a URL fornecida
        yt = YouTube(url)

        # Exibe o título do vídeo e a URL da miniatura
        print(f"Título: {yt.title}")
        print(f"URL da Miniatura: {yt.thumbnail_url}")

        # Obtém o stream com a maior resolução disponível
        stream = yt.streams.get_highest_resolution()

        # Faz o download do vídeo
        print("Iniciando o download...")
        stream.download()  # Caso queira especificar o diretório: stream.download(output_path='/caminho/do/diretorio')
        print("Download concluído com sucesso!")
    
    except PytubeError as e:
        print(f"Ocorreu um erro ao tentar baixar o vídeo: {e}")
    except Exception as e:
        print(f"Ocorreu um erro inesperado: {e}")

# Solicita a URL do vídeo ao usuário
url = input('Cole aqui sua URL: ')
download_video(url)
