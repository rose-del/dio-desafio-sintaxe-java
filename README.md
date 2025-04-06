# 💰 Projeto: ContaBanco

Este é um projeto simples desenvolvido em Java, proposto no módulo de Sintaxe Básico com Java. 
O objetivo é exercitar conceitos como:
- Lógica de programação e POO;
- Conhecimentos básicos em Java;
- Computador com SO de sua preferência(Windows, Linux, Mac OS);
- IDE (Visual Studio Code, Eclipse, etc);

# Descrição
O programa simula a criação de uma conta bancária. Ele solicita ao usuário, via terminal, os seguintes dados:

- Número da conta (inteiro)

- Número da agência (texto)

- Nome do cliente (texto)

- Saldo inicial (decimal)

# Importantes
### 📌 `Scanner.nextLine()` para limpar o buffer

No Java, métodos como `nextInt()` e `nextDouble()` **não consomem o ENTER digitado** após o valor. Isso pode causar problemas quando você tenta ler uma `String` logo em seguida.

Para evitar isso, usamos um `input.nextLine();` logo após a leitura de números:

```java
conta.numero = input.nextInt();
input.nextLine(); // limpa o ENTER do buffer
```

### 📌 Atenção com o formato decimal na hora de inserir o saldo
Dependendo das configurações regionais do seu sistema, o Java pode esperar vírgula ao invés de ponto como separador decimal.


