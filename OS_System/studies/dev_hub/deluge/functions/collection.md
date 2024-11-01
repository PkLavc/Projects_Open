// 1. insert
colecao = Collection(); // Cria uma nova coleção
colecao.insert("chave1", "valor1"); // Insere um valor na coleção
info colecao; // Retorna {"chave1": "valor1"}

// 2. insertAll
colecao = Collection(); // Cria uma nova coleção
valores = Collection("chave2", "valor2", "chave3", "valor3"); // Valores a serem inseridos
colecao.insertAll(valores); // Insere múltiplos valores na coleção
info colecao; // Retorna {"chave2": "valor2", "chave3": "valor3"}

// 3. update
colecao = Collection("chave1", "valor1"); // Cria uma coleção com um valor
colecao.update("chave1", "novoValor"); // Atualiza o valor associado à chave
info colecao; // Retorna {"chave1,valor1"}

// 4. delete
colecao = Collection("chave1", "valor1"); // Cria uma coleção com um valor
colecao.delete("chave1"); // Remove a chave e seu valor
info colecao; // Retorna {"valor1"}

// 5. deleteAll
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção com múltiplos valores
colecao.deleteAll("chave1", "chave2"); // Remove múltiplas chaves e seus valores
info colecao; // Retorna {"valor1,valor2"}

// 6. deleteKey
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção
colecao.deleteKey("chave1"); // Remove a chave e seu valor
info colecao; // Retorna {"chave1,valor1,chave2,valor2"}

// 7. deleteKeys
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção
colecao.deleteKeys("chave1", "chave2"); // Remove múltiplas chaves e seus valores
info colecao; // Retorna {"chave1,valor1,chave2,valor2"}

// 8. sort
colecao = Collection("banana", "maçã", "laranja"); // Cria uma Collectiona
colecao.sort(); // Ordena a Collectiona
info colecao; // Retorna ["banana", "laranja", "maçã"]

// 9. sortKey
colecao = Collection("b", 2, "a", 1, "c", 3); // Cria um Collectiona
colecao.sortKey(); // Ordena as chaves
info colecao; // Retorna {"b,2,a,1,c,3"}

// 10. clear
colecao = Collection("chave1", "valor1"); // Cria uma coleção
colecao.clear(); // Remove todos os valores da coleção
info colecao; // Retorna {}

// 11. containsKey
colecao = Collection("chave1", "valor1"); // Cria uma coleção
resultado = colecao.containsKey("chave1"); // Verifica se a chave existe
info resultado; // Retorna false

// 12. containsValue
colecao = Collection("chave1", "valor1"); // Cria uma coleção
resultado = colecao.containsValue("valor1"); // Verifica se o valor existe
info resultado; // Retorna true

// 13. getKey
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção
chave = colecao.getKey("valor1"); // Obtém a chave associada ao valor
info chave; // Retorna "1"

// 14. getLastKey
colecao = Collection("chave1", "valor1", "chave2", "valor1"); // Cria uma coleção
chave = colecao.getLastKey("valor1"); // Obtém a última chave associada ao valor
info chave; // Retorna "3"

// 15. isEmpty
colecao = Collection(); // Cria uma coleção vazia
resultado = colecao.isEmpty(); // Verifica se a coleção está vazia
info resultado; // Retorna true

// 16. size
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção
resultado = colecao.size(); // Obtém o número de valores na coleção
info resultado; // Retorna 4

// 17. keys
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção
CollectionaChaves = colecao.keys(); // Obtém a Collectiona de chaves
info CollectionaChaves; // Retorna "chave1,valor1,chave2,valor2"

// 18. values
colecao = Collection("chave1", "valor1", "chave2", "valor2"); // Cria uma coleção
CollectionaValores = colecao.values(); // Obtém a Collectiona de valores
info CollectionaValores; // Retorna "chave1,valor1,chave2,valor2"

// 19. distinct
colecao = Collection("valor1", "valor2", "valor1"); // Cria uma Collectiona com valores duplicados
valoresDistintos = colecao.distinct(); // Obtém valores distintos
info valoresDistintos; // Retorna "valor1,valor2"

// 20. intersect
colecao1 = Collection("a", "b", "c"); // Primeira coleção
colecao2 = Collection("b", "c", "d"); // Segunda coleção
valoresComuns = colecao1.intersect(colecao2); // Obtém elementos comuns
info valoresComuns; // Retorna "b,c"
// 21. duplicate
colecao = Collection("a", "b", "c", "d", "e"); // Cria uma Collectiona
subCollectiona = colecao.duplicate(1, 4); // Obtém uma subCollectiona do índice 1 ao 4
info subCollectiona; // Retorna "b,c,d"
