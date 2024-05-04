const pwEl = document.getElementById("senha");
const copyEl = document.getElementById("copiar");
const lenEl = document.getElementById("tamanho");
const upperEl = document.getElementById("maiuscula");
const lowerEl = document.getElementById("minuscula");
const numberEl = document.getElementById("numero");
const symbolEl = document.getElementById("simbolo");
const generateEl = document.getElementById("gerar");

const letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
const numeros = "0123456789";
const simbolos = "!@#$%^&*()_+=[]";

function obterMinuscula() {
  return letrasMinusculas[Math.floor(Math.random() * letrasMinusculas.length)];
}

function obterMaiuscula() {
  return letrasMaiusculas[Math.floor(Math.random() * letrasMaiusculas.length)];
}

function obterNumero() {
  return numeros[Math.floor(Math.random() * numeros.length)];
}

function obterSimbolo() {
  return simbolos[Math.floor(Math.random() * simbolos.length)];
}

function gerarSenha() {
  const tamanho = lenEl.value;
  let senha = "";

  for (let i = 0; i < tamanho; i++) {
    const caractere = gerarCaractere();
    senha += caractere;
  }

  pwEl.innerText = senha;
}

function gerarCaractere() {
  const caracteres = [];
  upperEl.checked && caracteres.push(obterMaiuscula());
  lowerEl.checked && caracteres.push(obterMinuscula());
  numberEl.checked && caracteres.push(obterNumero());
  symbolEl.checked && caracteres.push(obterSimbolo());

  if (caracteres.length === 0) 
    return "";

  return caracteres[Math.floor(Math.random() * caracteres.length)];
}

generateEl.addEventListener("click", gerarSenha);

copyEl.addEventListener("click", () => {
  const textarea = document.createElement("textarea");
  const senha = pwEl.innerText;

  if (!senha) {
      return;
  }

  textarea.value = senha;
  document.body.appendChild(textarea);
  textarea.select();
  document.execCommand("copy");
  textarea.remove();
  alert("Sua senha gerada foi copiada para a área de transferência");
});
