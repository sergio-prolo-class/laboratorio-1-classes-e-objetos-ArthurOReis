# Laboratório 1: Classes e Objetos
## Engenharia de Telecomunicações - Prof. Sergio Prolo

## Programação Orientada a Objetos sergio.prolo@ifsc.edu.br

#### 16/04/2025
#### Aluno: Arthur Oliveira dos Reis

- O repositório contém um projeto Gradle para implementar todos os exercícios desse
laboratório.
- A aplicação (App.java) será usada para instanciar objetos das classes e testar suas
funcionalidades.
- Cada classe requerida pelos exercícios deve ser implementada em um arquivo .java
individual, localizado no pacote da aplicação.
- Não esqueça de adicionar ambos .gitignore e readme.md!

### 1. Lâmpada
Modele uma lâmpada que pode ser ligada ou desligada.

#### **Atributos**:
- `(boolean)` ligada

#### **Métodos**:
- `(void)` ligar()
- `(void)` desligar()
- `(boolean)` verEstado()

#### **Testes na aplicação principal (App.java)**:
1. Crie dois objetos do tipo `Lampada`.
2. Ligue um e desligue o outro.
3. Imprima na tela o estado de cada uma.

---

### 2. Pessoa
Modele uma pessoa que possui nome, idade e pode fazer aniversário.

#### **Atributos**:
- `(String)` nome
- `(int)` idade

#### **Métodos**:
- `(void)` setNome(String nome)
- `(String)` getNome()
- `(void)` setIdade(int idade)
- `(int)` getIdade()
- `(void)` felizAniversario()

#### **Testes na aplicação principal (App.java)**:
1. Crie duas pessoas: Alice de 22 anos e Bruno de 25 anos.
2. Comemore o aniversário do Bruno três vezes.
3. Imprima na tela a idade das duas pessoas.
4. Teste se é possível ajustar a idade da Alice para -44. Isso é desejado?
5. Teste se é possível ajustar o nome do Bruno para uma string vazia. Isso faz sentido?

---

### 3. Retângulo
Modele um retângulo em um plano cartesiano bidimensional, que possua formas de calcular sua área e perímetro.

#### **Atributos**:
- `(float)` largura
- `(float)` altura

#### **Métodos**:
- `(void)` setLargura(float largura)
- `(void)` setAltura(float altura)
- `(float)` getArea()
- `(float)` getPerimetro()

#### **Testes na aplicação principal (App.java)**:
1. Crie um retângulo com 5 de largura e 4 de altura.
2. Verifique se sua área é 20 e seu perímetro é 18.
3. Crie um vetor de 10 retângulos gerados aleatoriamente.
4. Imprima a maior razão área sobre perímetro da lista.

---

### 4. Relógio
Modele um relógio que apresenta os valores de hora, minuto e segundo (formato HH:MM:SS).

#### **Atributos**:
- `(byte)` hora
- `(byte)` minuto
- `(byte)` segundo

#### **Métodos**:
- `(void)` ajustaHora(byte hora, byte minuto, byte segundo)
- `(String)` getHora()
- `(void)` avancaHora()
- `(void)` avancaMinuto()
- `(void)` avancaSegundo()

#### **Testes na aplicação principal (App.java)**:
1. Crie um relógio que marca 14:58:32.
2. Avance dois minutos. Qual valor ele marca agora?
3. Altere o relógio para marcar 23:59:59.
4. Avance um segundo. Qual valor ele marca agora?
5. Como você poderia mudar o formato da marcação de horas? Por exemplo, se quiser que o relógio mostre `11pm 30m 45s` ao invés de `23:30:45`, quais mudanças seriam necessárias na classe `Relogio`?

---

### 5. Produto
Modele um produto que possui nome, preço e uma taxa de desconto.

#### **Atributos**:
- `(String)` nome
- `(int)` preco
- `(int)` desconto

#### **Métodos**:
- `(void)` setNome(String nome)
- `(String)` getNome()
- `(void)` setPreco(int preco)
- `(float)` getPreco()
- `(void)` setDesconto(int desconto)
- `(int)` getDesconto()

#### **Testes na aplicação principal (App.java)**:
1. Crie dois produtos sem descontos: uma geladeira de 832 reais e um micro-ondas de 499 reais.
2. Ajuste a geladeira para ter 6% de desconto e o micro-ondas para ter 12%.
3. Imprima na tela o novo preço de cada produto. A geladeira custa 782,08 reais? O micro-ondas custa 439,12 reais?
4. Adicione um novo método `(String) anuncio()` na classe Produto. Ele deve retornar um texto no estilo:  
   `"Geladeira: de R$ 832,00 por APENAS R$ 782,08!"`
5. Comente no código se a modelagem do produto é boa. Se não, onde você mudaria algo e por quê?

---

### 6. Livro
Modele um livro que possui título, autor, até dois gêneros literários, o número total de páginas, os títulos de cada capítulo e as páginas onde cada capítulo começa. Assuma que o livro pode ter, no máximo, 30 capítulos.

#### **Atributos**:
- `(String)` título
- `(String)` autor
- `(String[])` gêneros literários (máximo de 2)
- `(int)` total de páginas
- `(String[])` títulos dos capítulos (máximo de 30)
- `(int[])` páginas onde cada capítulo começa (máximo de 30)

#### **Métodos**:
- Getters e setters para todos os atributos.
- Métodos para:
  - Ler páginas do livro.
  - Descobrir quantas páginas já foram lidas.
  - Descobrir qual é o capítulo atual de leitura.

#### **Testes na aplicação principal (App.java)**:
1. Crie um livro com as seguintes características:
   - **Título**: O Senhor dos Anéis - A Sociedade do Anel
   - **Autor**: J. R. R. Tolkien
   - **Gêneros**: Fantasia, Aventura
   - **Páginas**: 464
   - **Capítulos**:
     | Capítulo | Nome                          | Página |
     |----------|-------------------------------|--------|
     | 1        | Uma Festa Muito Esperada      | 1      |
     | 2        | A Sombra do Passado           | 23     |
     | 3        | Três é Demais                 | 44     |
     | 4        | "Um Atalho para Cogumelos"    | 66     |
     | 5        | "Uma Conspiração Desmascarada"| 89     |
     | 6        | "A Floresta Velha "           | 110    |
     | 7        | "Em Casa de Tom Bombadil"     | 131    |
     | 8        | "Névoa nas Colinas dos Túmulos"| 154    |
     | 9        | "No Pônei Empinado"           | 176    |
     | 10       | "Passolargo"                  | 197    |
     | 11       | "Um Faca na Noite"            | 219    |
     | 12       | "Voo para o Vau"              | 240    |
     | 13       | "Muitos Encontros"            | 261    |
     | 14       | "O Conselho de Elrond"        | 282    |
     | 15       | "O Anel Vai para o Sul "      | 301    |
     | 16       | "Uma Jornada no Escuro"       | 320    |
     | 17       | "A Ponte de Khazad-dûm"       | 341    |
     | 18       | "Lothlórien"                  | 361    |
     | 19       | "O Espelho de Galadriel"      | 383    |
     | 20       | "Adeus a Lórien"              | 403    |
     | 21       | "O Grande Rio"                | 423    |
     | 22       | A Partida da Sociedade        | 446    |
2. Leia 90 páginas do livro.
3. Imprima na tela o capítulo que está lendo. É `Uma Conspiração Desmascarada`?
4. Leia mais 300 páginas do livro.
5. Imprima na tela o capítulo que está lendo. É `O Espelho de Galadriel`?
6. Leia mais 100 páginas do livro. Isso é possível?

---

# Parte 2 - Laboratório 1: Classes e Objetos

- O repositório desse laboratório é o mesmo do anterior (Classes e Objetos).
- Todas as classes devem obedecer os princípios de encapsulamento (bom uso dos modificadores `private` e `public`).
- Todos os métodos setters (ex.: `setHora`, `setNome`) devem ter seu tipo alterado para `boolean`. Se a alteração for bem-sucedida, o método retorna `true`, caso contrário, retorna `false`. Use esse padrão nos construtores criados para ajustar os atributos.
- Após alterações em uma classe, teste sua implementação na aplicação principal.
- Não esqueça de editar o `readme.md` (e adicionar o `.gitignore`, se esqueceu no último laboratório).

---

## Exercícios

### 1. Lâmpada
Altere a classe de forma tal que:
- Lâmpadas possam ser criadas com seu estado definido ou com um estado padrão desligado.
- Conte o número total de lâmpadas criadas.

#### **Atributos**:
- `(boolean)` ligada

#### **Métodos**:
- `(void)` ligar()
- `(void)` desligar()
- `(boolean)` verEstado()

#### **Testes na aplicação principal (App.java)**:
1. Crie dois objetos do tipo `Lampada`.
2. Ligue um e desligue o outro.
3. Imprima na tela o estado de cada uma.

---

### 2. Pessoa
Altere a classe de forma tal que:
- Pessoas tenham um CPF no formato `xxx.xxx.xxx-xx` constante a ser informado na criação.
  - Se o CPF informado for vazio, atribua um valor padrão (`123.456.789-00`).
  - Se o informado não for vazio, assuma que ele está correto (não implemente validação de CPF na classe `Pessoa`).
- Pessoas possam ser criadas de três maneiras diferentes: apenas CPF, CPF e nome, ou com os três argumentos.

#### **Atributos**:
- `(String)` nome
- `(int)` idade
- `(String)` CPF

#### **Métodos**:
- `(void)` setNome(String nome)
- `(String)` getNome()
- `(void)` setIdade(int idade)
- `(int)` getIdade()
- `(void)` felizAniversario()

#### **Testes na aplicação principal (App.java)**:
1. Crie duas pessoas: Alice de 22 anos e Bruno de 25 anos.
2. Comemore o aniversário do Bruno três vezes.
3. Imprima na tela a idade das duas pessoas.
4. Teste se é possível ajustar a idade da Alice para -44. Isso é desejado?
5. Teste se é possível ajustar o nome do Bruno para uma string vazia. Isso faz sentido?

---

### 3. Retângulo
Altere a classe de forma tal que:
- Nenhum retângulo possa ser criado sem largura e altura definidas. Se valores não positivos forem informados, devem ser iniciados com 1.
- Exista um registro do retângulo de maior área já criado.
- Exista um registro do retângulo de menor perímetro já criado.

#### **Atributos**:
- `(float)` largura
- `(float)` altura

#### **Métodos**:
- `(void)` setLargura(float largura)
- `(void)` setAltura(float altura)
- `(float)` getArea()
- `(float)` getPerimetro()

#### **Testes na aplicação principal (App.java)**:
1. Crie um retângulo com 5 de largura e 4 de altura.
2. Verifique se sua área é 20 e seu perímetro é 18.
3. Crie um vetor de 10 retângulos gerados aleatoriamente.
4. Imprima a maior razão área sobre perímetro da lista.

---

### 4. Relógio
Altere a classe de forma tal que:
- Relógios possam ser criados com valores de hora, hora e minuto, ou hora, minuto e segundo. Caso qualquer valor seja inválido, o objeto deve ser inicializado com valores zerados.
- Exista um método que sincronize um relógio com outro.
- Exista um método que retorne a diferença, em segundos, das horas de um relógio para outro.

#### **Atributos**:
- `(byte)` hora
- `(byte)` minuto
- `(byte)` segundo

#### **Métodos**:
- `(void)` ajustaHora(byte hora, byte minuto, byte segundo)
- `(String)` getHora()
- `(void)` avancaHora()
- `(void)` avancaMinuto()
- `(void)` avancaSegundo()

#### **Testes na aplicação principal (App.java)**:
1. Crie um relógio que marca 14:58:32.
2. Avance dois minutos. Qual valor ele marca agora?
3. Altere o relógio para marcar 23:59:59.
4. Avance um segundo. Qual valor ele marca agora?

---

### 5. Produto
Altere a classe de forma tal que:
- Produtos só possam ser criados com nome e preço válidos e sempre tenham desconto inicial de 0%.
- Tenha um registro do número total de produtos criados.
- Produtos tenham um código identificador do tipo `String` no formato `CD:xxx-xxx`. Após definido, o código de um produto não deve ser alterado.
  - O código é gerado automaticamente a partir do registro de total.
  - Exemplo: o terceiro produto tem código `CD:000-003`; o milésimo produto tem código `CD:001-000`.
- Tenha um registro dos últimos produtos criados (máximo de 50 registros).
  - Quando novos produtos são criados, o produto mais antigo é esquecido para dar espaço ao mais novo.
- Tenha um método estático para expor o registro de produtos em formato `.csv`.

#### **Testes na aplicação principal (App.java)**:
1. Crie dois produtos sem descontos: uma geladeira de 832 reais e um micro-ondas de 499 reais.
2. Ajuste a geladeira para ter 6% de desconto e o micro-ondas para ter 12%.
3. Imprima na tela o novo preço de cada produto.
4. Gere o registro de produtos em formato `.csv`.

---

### 6. Navio
Modele uma classe para representar um navio do jogo batalha naval.

#### **Atributos**:
- Tamanho do navio.
- Posição (linha e coluna) no tabuleiro.
- Orientação (vertical ou horizontal).
- Letra que representa o navio no tabuleiro.
- Quais posições ele já foi atingido.
- Se ele foi afundado ou não.

#### **Métodos**:
- Verificar se o navio foi atingido.
- Verificar se o navio foi afundado.

#### **Testes na aplicação principal (App.java)**:
1. Crie navios com diferentes tamanhos e posições.
2. Simule ataques e verifique se os navios foram atingidos ou afundados.