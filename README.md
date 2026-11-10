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

## 🧠 O que já pratiquei

- Entrada de dados com `Scanner` e `Locale.US` (ponto como separador decimal)
- Variáveis e tipos (`int`, `double`, `String`)
- Decisões com `switch` e `if / else if / else`
- Operadores lógicos (`||`) para validar intervalos
- Operador de negação (`!`) e como ele inverte um `boolean`
- Repetição com `do / while` e `while` de validação (repetir até a entrada ser válida)
- Laços aninhados
- Validação de entrada com `hasNextInt()` para evitar `InputMismatchException`
- Como o `Scanner` funciona por dentro: o `nextInt()` deixa o Enter no buffer, e o `nextLine()` solto o descarta
- Números aleatórios com `Random`
- Saída formatada com `printf` (`%d`, `%n`)


## 🗺️ Próximos passos

- [x] Calculadora simples
- [x] Calculadora em loop (várias contas sem reiniciar)
- [x] Média de notas
- [x] Jogo de adivinhar o número
- [x] Jogo: repetir o palpite até ser válido (`while`) e tratar limite 0 ou negativo
- [x] Jogo: proteger as leituras contra letras e decimais (`hasNextInt()`)
- [ ] Jogo: dica de maior/menor com `else if`


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

## 👤 Sobre

Feito por [@oReversi](https://github.com/oReversi).