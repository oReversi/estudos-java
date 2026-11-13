# ☕ Estudos de Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)
![Status](https://img.shields.io/badge/status-aprendendo-brightgreen?style=for-the-badge)

> Meu diário de bordo aprendendo Java do zero. Um exercício de cada vez.

## 📚 Exercícios

| Exercício | O que faz |
|-----------|-----------|
| [Calculadora](./calculadora) | Calculadora de terminal com as 4 operações, tratamento de divisão por zero e loop para várias contas sem reiniciar |
| [Média](./media) | Lê três notas, calcula a média e diz se o aluno está aprovado, em recuperação ou reprovado, com loop para repetir |
| [Acerte o número](./acerte) | Jogo de adivinhação com duas versões: `acerte` (sorteia entre 1 e um limite, valida o palpite e permite jogar de novo) e `acerte2` (limite mínimo de 2 e leituras que aceitam só inteiros, sem quebrar com letras ou decimais) |
| [IMC](./imc) | Calculadora de IMC que aceita altura em metros (`1.72`) ou centímetros (`172`), valida altura (0,5 a 2,8 m) e peso (2 a 600 kg) pedindo de novo até ser válido, classifica o resultado em 6 faixas (baixo peso até obesidade grau III) e permite calcular novamente |

## 🧠 O que já pratiquei

- Entrada de dados com `Scanner` e `Locale.US` (ponto como separador decimal)
- Variáveis e tipos (`int`, `double`, `boolean`, `String`)
- Decisões com `switch` e `if / else if / else`
- Faixas com `else if` testando só o limite superior (a ordem do menor para o maior descarta o limite inferior)
- Operadores lógicos (`||` e `&&`) para validar intervalos
- Operador de negação (`!`) e como ele só funciona em `boolean`
- Repetição com `do / while` e `while` de validação (repetir até a entrada ser válida)
- `do / while` com flag booleana de validação (`validaAlt`, `validaPes`)
- Laços aninhados (validação de altura e peso dentro do laço de "calcular de novo")
- Validação de entrada com `hasNextInt()` e `hasNextDouble()` para evitar `InputMismatchException`
- Validação de intervalo plausível (mínimo e máximo) com mensagens de erro específicas
- Conversão automática de unidade (cm para m) antes de validar
- Como o `Scanner` funciona por dentro: o `nextInt()` deixa o Enter no buffer, e o `nextLine()` solto o descarta
- Números aleatórios com `Random`
- Saída formatada com `printf` (`%d`, `%.2f`, `%s`, `%n`), com vários valores na mesma string
- `printf` com `Locale.US` como primeiro argumento para forçar ponto na saída
- Comparar `String` com `equalsIgnoreCase`


## 🗺️ Próximos passos

- [x] Calculadora simples
- [x] Calculadora em loop (várias contas sem reiniciar)
- [x] Média de notas
- [x] Jogo de adivinhar o número
- [x] Jogo: repetir o palpite até ser válido (`while`) e tratar limite 0 ou negativo
- [x] Jogo: proteger as leituras contra letras e decimais (`hasNextInt()`)
- [x] Calculadora de IMC com validação e faixas de classificação
- [x] IMC: usar `Locale.US` no `printf` do resultado (saída com ponto)
- [x] Conversor de Fahrenheit para Celsius com validação do zero absoluto (-459.67 °F)
- [x] contador crescente e decrescente, Valida entradas inteiras e S/N, e permite repetir a contagem




## ▶️ Como executar

A partir da raiz do repositório:

```bash
# Calculadora
cd calculadora
javac Calculadora.java
java Calculadora
```

```bash
# Média
javac media/media.java
java media.media
```

```bash
# Acerte o número
cd acerte
javac acerte.java
java acerte
```

```bash
# IMC
cd imc
javac imc.java
java imc
```

```bash
# Temperatura
cd Temp
javac Temp.java
java Temp
```

```bash
# Contador
cd Count
javac Count.java
java Count
```

## 👤 Sobre

Feito por [@oReversi](https://github.com/oReversi).
