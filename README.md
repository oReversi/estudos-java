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
| [Acerte o número](./acerte) | Sorteia um número entre 1 e um limite escolhido, valida o palpite, mostra se acertou (ou qual era o número) e permite jogar de novo |

## 🧠 O que já pratiquei

- Entrada de dados com `Scanner` e `Locale.US` (ponto como separador decimal)
- Variáveis e tipos (`int`, `double`, `String`)
- Decisões com `switch` e `if / else if / else`
- Operadores lógicos (`||`) para validar intervalos
- Repetição com `do / while`
- Números aleatórios com `Random`
- Saída formatada com `printf` (`%d`, `%n`)

## 🗺️ Próximos passos

- [x] Calculadora simples
- [x] Calculadora em loop (várias contas sem reiniciar)
- [x] Média de notas
- [x] Jogo de adivinhar o número
- [ ] Jogo: repetir o palpite até ser válido (`while`) e tratar limite 0 ou negativo

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