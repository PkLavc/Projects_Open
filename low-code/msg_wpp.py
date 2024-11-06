import pywhatkit

phone_number = '+5511XXXXXXXXX'  # Substitua por um número válido
message = "Teste de mensagem pelo Py"
hours = 13
minutes = 42

# Envia a mensagem no horário especificado
pywhatkit.sendwhatmsg(phone_number, message, hours, minutes)
print('Mensagem enviada!')