from pytube import YouTube
# Caso haja erro, usar a biblioteca pytubefix

# Solicita a URL do vídeo ao usuário
yt = YouTube(input('Cole aqui sua url: '))

# Exibe o título do vídeo
print(yt.title)

# Exibe a URL da thumbnail do vídeo
print(yt.thumbnail_url)

# Obtém o stream com a maior resolução disponível
stream = yt.streams.get_highest_resolution()

# Faz o download do vídeo
stream.download()