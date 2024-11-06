import yt_dlp as ytdl

# Instalar as bibliotecas:
# pip install yt-dlp
# winget install ffmpeg

def download_video(url):
    try:
        # Opções para o yt-dlp
        ydl_opts = {
            'format': 'bestvideo',  # Baixar apenas o melhor vídeo, sem áudio
            # Ou 'format': 'bestaudio', para baixar apenas o áudio
            'outtmpl': 'downloads/%(title)s.%(ext)s',  # Caminho de saída para o arquivo
        }

        # Baixar o vídeo
        with ytdl.YoutubeDL(ydl_opts) as ydl:
            info_dict = ydl.extract_info(url, download=True)
            print(f"Título: {info_dict['title']}")
            print(f"URL da Miniatura: {info_dict['thumbnail']}")
            print("Download concluído com sucesso!")

    except Exception as e:
        print(f"Ocorreu um erro ao tentar baixar o vídeo: {e}")

# Solicita a URL do vídeo ao usuário
url = input('Cole aqui sua URL: ')
download_video(url)