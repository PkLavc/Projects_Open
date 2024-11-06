import streamlit as st
import speedtest

def main():
    st.header("SpeedTest")
    st.write("Clique no botão abaixo para iniciar o teste.")
    
    if st.button("Iniciar"):
        with st.spinner("Testando a velocidade da sua internet..."):
            s = speedtest.Speedtest()
            s.get_best_server()
            download_speed = s.download() / 1_000_000  # Converte para Mbps
            upload_speed = s.upload() / 1_000_000      # Converte para Mbps
            results = s.results.dict()
            
            max_speed = 100  # Define a velocidade máxima para a barra de progresso

            st.write(f"Velocidade de Download: {download_speed:.2f} Mbps")
            st.progress(min(download_speed / max_speed, 1.0))
            
            st.write(f"Velocidade de Upload: {upload_speed:.2f} Mbps")
            st.progress(min(upload_speed / max_speed, 1.0))
            
            st.write(f"Ping: {results['ping']} ms")

if __name__ == "__main__":
    main()