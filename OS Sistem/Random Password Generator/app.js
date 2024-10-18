const pwEl = document.getElementById("password");
const copyEl = document.getElementById("copy");
const lenEl = document.getElementById("length");
const upperEl = document.getElementById("uppercase");
const lowerEl = document.getElementById("lowercase");
const numberEl = document.getElementById("number");
const symbolEl = document.getElementById("symbol");
const generateEl = document.getElementById("generate");

const uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
const numbers = "0123456789";
const symbols = "!@#$%^&*()_+=[]";

function getLowercase() {
  return lowercaseLetters[Math.floor(Math.random() * lowercaseLetters.length)];
}

function getUppercase() {
  return uppercaseLetters[Math.floor(Math.random() * uppercaseLetters.length)];
}

function getNumber() {
  return numbers[Math.floor(Math.random() * numbers.length)];
}

function getSymbol() {
  return symbols[Math.floor(Math.random() * symbols.length)];
}

function generatePassword() {
  const length = lenEl.value;
  let password = "";

  for (let i = 0; i < length; i++) {
    const character = generateCharacter();
    password += character;
  }

  pwEl.innerText = password;
}

function generateCharacter() {
  const characters = [];
  upperEl.checked && characters.push(getUppercase());
  lowerEl.checked && characters.push(getLowercase());
  numberEl.checked && characters.push(getNumber());
  symbolEl.checked && characters.push(getSymbol());

  if (characters.length === 0) 
    return "";

  return characters[Math.floor(Math.random() * characters.length)];
}

generateEl.addEventListener("click", generatePassword);

copyEl.addEventListener("click", () => {
  const textarea = document.createElement("textarea");
  const password = pwEl.innerText;

  if (!password) {
      return;
  }

  textarea.value = password;
  document.body.appendChild(textarea);
  textarea.select();
  document.execCommand("copy");
  textarea.remove();
  alert("Your generated password has been copied to clipboard");
});
