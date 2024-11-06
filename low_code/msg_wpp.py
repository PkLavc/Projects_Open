import pywhatkit
import time
from datetime import datetime

# Instalar as bibliotecas:
# pip install pywhatkit

# Função para verificar se o horário é no futuro
def is_future_time(hours, minutes):
    now = datetime.now()
    current_hour = now.hour
    current_minute = now.minute

    # Verifica se o horário configurado é no futuro
    if hours < current_hour or (hours == current_hour and minutes <= current_minute):
        return False
    return True

# Parâmetros de entrada
phone_number = '+5511XXXXXXXXX'  # Substitua por um número válido
message = "Teste de mensagem pelo Py"
hours = 13  # Hora em formato 24 horas
minutes = 42  # Minutos

# Verificar se o horário é válido
if not is_future_time(hours, minutes):
    print("Erro: O horário configurado já passou. Por favor, defina um horário no futuro.")
else:
    try:
        # Envia a mensagem no horário especificado
        pywhatkit.sendwhatmsg(phone_number, message, hours, minutes, wait_time=20)
        print(f'Mensagem enviada para {phone_number} com sucesso!')
    except Exception as e:
        print(f"Erro ao enviar a mensagem: {e}")