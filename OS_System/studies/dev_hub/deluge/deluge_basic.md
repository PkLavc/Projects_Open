Link: https://deluge.zoho.com/learndeluge
      https://deluge.zoho.com/tryout
# ============================== list ==============================
languages = {"English", "French", "German"};
info languages;
# ============================ list add ============================
languages = {"English", "French", "German"};
languages.add("Spanish");
info languages;
# ========================= list remove index ======================
languages = {"English", "French", "German"};
languages.add("Spanish");
languages.remove(1);
info languages;
# ======================== list remove element =====================
languages = {"English", "French", "German"};
languages.removeElement("English");
info languages;
# =========================  for each element ======================
languages = {"English", "French", "German"};
for each language in languages {
    info "language : " + language;
}
# ============================== new map ===========================
person = { "name" : "John", "age": 22 };
info person;

It creates a new Map. Map is a collection variable which stores 
collection of data as a key-value pair.
Insertion order will be maintained & on adding value to the existing 
key will replace the value.
# ================================ put =============================
person = { "name" : "John", "age": 22 };
person.put("marks", 70);
info person;
# ============================ remove key ==========================
person = { "name" : "John", "age": 22};
person.remove("age");
info person;
# ============================== xxxx ==============================



