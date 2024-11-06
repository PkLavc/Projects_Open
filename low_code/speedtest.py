import streamlit as st
import speedtest

# Instalar as bibliotecas:
# pip install streamlit speedtest-cli

def main():
    st.header("Teste de Velocidade da Internet")
    st.write("Clique no botão abaixo para iniciar o teste de velocidade da sua conexão.")

    if st.button("Iniciar Teste"):
        with st.spinner("Testando a velocidade da sua internet..."):
            s = speedtest.Speedtest()
            s.get_best_server()

            download_speed = s.download() / 1_000_000  # Converte para Mbps
            upload_speed = s.upload() / 1_000_000      # Converte para Mbps
            ping = s.results.ping
            server = s.results.server

            # Velocidade máxima dinamicamente baseada no resultado
            max_speed = max(download_speed, upload_speed, 100)  # Usa a maior velocidade ou 100 Mbps

            st.write(f"**Servidor**: {server['host']} ({server['country']})")
            st.write(f"**Velocidade de Download**: {download_speed:.2f} Mbps")
            st.progress(min(download_speed / max_speed, 1.0))  # Barra de progresso para download

            st.write(f"**Velocidade de Upload**: {upload_speed:.2f} Mbps")
            st.progress(min(upload_speed / max_speed, 1.0))  # Barra de progresso para upload

            st.write(f"**Ping**: {ping} ms")

if __name__ == "__main__":
    main()
