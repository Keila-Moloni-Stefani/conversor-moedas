# Challenge - Conversor de Moedas

Este é um conversor de moedas desenvolvido em **Java** que permite realizar conversões entre diferentes moedas utilizando taxas de câmbio **atualizadas em tempo real** através da **ExchangeRate API**.

*O projeto foi desenvolvido como parte da Formação ONE (Oracle Next Education) em parceria com a Alura*, com o objetivo de aplicar conhecimentos de:
- Consumo de APIs REST
- Manipulação de dados JSON
- Programação Orientada a Objetos
- Tratamento de exceções


# Funcionalidades

- ✅ **6 opções de conversão** entre diferentes pares de moedas
- ✅ **Taxas de câmbio em tempo real** via ExchangeRate API
- ✅ **Interface interativa** via console com menu intuitivo
- ✅ **Validação de entrada** do usuário com tratamento de erros
- ✅ **Formatação clara** dos resultados de conversão
- ✅ **Loop contínuo** permitindo múltiplas conversões
- ✅ **Informações detalhadas** incluindo taxa de câmbio aplicada

# Moedas Suportadas

| Opção | De | Para | Descrição |
|-------|----|----|-----------|
| 1 | USD | BRL | Dólar Americano → Real Brasileiro |
| 2 | BRL | USD | Real Brasileiro → Dólar Americano |
| 3 | USD | ARS | Dólar Americano → Peso Argentino |
| 4 | ARS | USD | Peso Argentino → Dólar Americano |
| 5 | USD | COP | Dólar Americano → Peso Colombiano |
| 6 | COP | USD | Peso Colombiano → Dólar Americano |

# Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|------------|--------|-----------|
| **Java** | 21 | Linguagem de programação principal |
| **Maven** | 3.9+ | Gerenciador de dependências e build |
| **GSON** | 2.10.1 | Biblioteca para manipulação de JSON |
| **HttpClient** | Java 11+ | Cliente HTTP nativo para requisições à API |
| **ExchangeRate API** | v6 | API para obter taxas de câmbio em tempo real |

# Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- [Java JDK 21+](https://www.oracle.com/java/technologies/downloads/) ou superior
- [Maven 3.9+](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (recomendado) ou outra IDE Java
- Chave de API da [ExchangeRate-API](https://www.exchangerate-api.com/) (gratuita)

# Como Instalar e Executar

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
cd conversor-moedas
```

### 2️⃣ Obtenha sua API Key

1. Acesse [ExchangeRate-API](https://www.exchangerate-api.com/)
2. Clique em **"Get Free Key"**
3. Cadastre-se com seu e-mail
4. Verifique seu e-mail e copie a **API Key**

### 3️⃣ Configure a API Key no projeto

Abra o arquivo `Principal.java` e substitua pela sua chave


### 4️⃣ Compile o projeto

```bash
mvn clean compile
```

### 5️⃣ Execute o projeto

**Opção 1 - Via Maven:**
```bash
mvn exec:java -Dexec.mainClass="Principal"
```

**Opção 2 - Via IntelliJ IDEA:**
1. Abra o arquivo `Principal.java`
2. Clique no ícone ▶️ verde ao lado do método `main`
3. Ou pressione `Shift + F10`

# Como Usar

1. Execute o programa
2. Escolha uma opção de conversão digitando o número correspondente (1-6)
3. Digite o valor que deseja converter
4. Visualize o resultado da conversão com a taxa de câmbio aplicada
5. Continue fazendo conversões ou digite **7** para sair


# Exemplo de Uso Completo

```
==================================================
 BEM-VINDO AO CONVERSOR DE MOEDAS
==================================================

Escolha uma opção de conversão:

1) Dólar (USD) → Real Brasileiro (BRL)
2) Real Brasileiro (BRL) → Dólar (USD)
3) Dólar (USD) → Peso Argentino (ARS)
4) Peso Argentino (ARS) → Dólar (USD)
5) Dólar (USD) → Peso Colombiano (COP)
6) Peso Colombiano (COP) → Dólar (USD)
7) Sair

➤ Digite sua opção: 1

  Digite o valor que deseja converter: 100

  Conversão realizada com sucesso!
   USD 100.00 → BRL 505.75
   Taxa de câmbio: 1 USD = 5.0575 BRL

==================================================
```

# Estrutura do Projeto

```
conversor-moedas/
│
├── src/
│   └── main/
│       └── java/
│           ├── Principal.java          # Classe principal com menu e interação
│           └── ConversorMoedas.java    # Lógica de conversão e consumo da API
│
├── .gitignore                          # Arquivos ignorados pelo Git
├── pom.xml                             # Configuração Maven e dependências
└── README.md                           # Documentação do projeto
```


# Possíveis Melhorias Futuras

- [ ] Adicionar histórico de conversões
- [ ] Implementar log com data e hora
- [ ] Adicionar mais opções de moedas
- [ ] Criar interface gráfica
- [ ] Salvar conversões em arquivo (TXT/CSV/JSON)
- [ ] Implementar cache de taxas de câmbio
- [ ] Adicionar gráficos de variação cambial
- [ ] Criar testes unitários
- [ ] Implementar modo batch (conversão múltipla)
- [ ] Adicionar suporte a diferentes APIs de câmbio


# Aprendizados

Este projeto proporcionou aprendizado prático em:

- Configuração do Ambiente Java
- Criação do Projeto Maven
- Consumo de APIs REST em Java
- Análise e manipulação de dados JSON com GSON
- Uso do HttpClient, HttpRequest e HttpResponse
- Programação Orientada a Objetos
- Tratamento de exceções e erros
- Validação de entrada do usuário
- Filtro e Seleção de Moedas
- Exibição de Resultados
- Boas práticas de programação
- Documentação de código
- Controle de versão com Git


# Desenvolvedor
Desenvolvido por Keila Moloni Stefani
⭐ Se este projeto foi útil para você, considere dar uma estrela!
