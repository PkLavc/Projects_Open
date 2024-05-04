# Como Enviar Arquivos para o GitHub

Para enviar arquivos para o GitHub, você geralmente segue esses passos:

## 1. Inicialize um Repositório Git

No diretório onde seus arquivos estão localizados, abra um terminal (Command Prompt, PowerShell ou Git Bash) e execute o seguinte comando para inicializar um repositório Git:

```bash
git init
```

## 2. Adicione seus Arquivos ao Stage

Use o seguinte comando para adicionar todos os arquivos ao stage:

```bash
git add .
```

## 3. Configure suas Informações do Git (Opcional)

Antes de fazer um commit, é uma boa prática configurar suas informações de usuário no Git. Isso ajuda a identificar quem fez quais alterações nos commits. Use os seguintes comandos, substituindo "seu_email@example.com" pelo seu endereço de e-mail usado no GitHub e "Seu Nome" pelo seu nome de usuário:

```bash
git config --global user.email "seu_email@example.com"
git config --global user.name "Seu Nome"
```

## 4. Faça um Commit dos Arquivos

Agora, você precisa fazer um commit dos arquivos adicionados ao stage. Isso salva uma versão dos arquivos no repositório Git local:

```bash
git commit -m "Primeiro commit"
```

## 5. Conecte-se ao Repositório Remoto

Você precisa adicionar o URL do seu repositório GitHub como um repositório remoto. Use o seguinte comando (substituindo `seu_usuario` e `Projects_Open` pelo seu nome de usuário e nome do repositório, respectivamente):

```bash
git remote add origin https://github.com/seu_usuario/nome_repositorio.git
```

## 6. Envie os Arquivos para o GitHub

Agora você pode enviar seus arquivos para o GitHub usando o seguinte comando:

```bash
git push -u origin main
```

Isso enviará todos os seus arquivos para o repositório GitHub especificado.

Lembre-se de que você precisa ter uma conta no GitHub e ter permissão para enviar arquivos para o repositório em questão. Certifique-se também de ter o Git instalado em seu computador.
