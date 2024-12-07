# 📍 Buscador de CEP

Projeto desenvolvido durante uma aula do curso na Alura, com o objetivo de criar uma aplicação que busca informações de endereço a partir de um CEP informado pelo usuário, utilizando a API da ViaCEP.

## 🚀 Funcionalidades

- **Busca de Endereço**: O usuário informa o CEP, e o sistema retorna os dados correspondentes, como rua, bairro, cidade e estado.
- **Geração de Arquivo JSON**: Após a consulta, as informações do endereço são convertidas e salvas em um arquivo JSON.
- **Uso da Dependência GSON**: O JSON gerado é manipulado utilizando a biblioteca GSON para serialização e desserialização.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java  
- **API**: [ViaCEP](https://viacep.com.br)  
- **Dependência**: GSON para manipulação de JSON  

## 📋 Como Funciona

1. **Entrada de Dados**: O usuário insere um CEP através de um menu simples.
2. **Consulta à API**: O sistema faz a requisição à API da ViaCEP e obtém as informações correspondentes.
3. **Conversão dos Dados**: As informações são tratadas, organizadas e transformadas em um objeto de endereço.
4. **Geração do Arquivo JSON**: O objeto de endereço é convertido em JSON e salvo no sistema utilizando a biblioteca GSON.
