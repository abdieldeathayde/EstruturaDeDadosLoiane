# 📚 Estrutura de Dados - Loiane (Java)

Projeto desenvolvido com base nos estudos do curso de Estrutura de Dados da Loiane Groner, com foco na implementação prática dos principais conceitos utilizando Java.

---

## 🚀 Objetivo

Este repositório tem como objetivo reforçar o aprendizado em **Estrutura de Dados**, implementando algoritmos e estruturas fundamentais na prática, como:

* Vetores (Arrays)
* Listas
* Pilhas
* Filas
* Algoritmos básicos
* Exercícios práticos

---

## 🛠️ Tecnologias utilizadas

* Java 17
* Docker 🐳
* Git e GitHub

---

## 📂 Estrutura do projeto

```
src/
 └── com/
     └── loiane/
         └── estruturadados/
             ├── vetor/
             ├── lista/
             ├── pilha/
             ├── fila/
             └── desafios/
```

---

## ▶️ Como executar (modo tradicional)

1. Compile os arquivos:

```bash
javac -d bin $(find src -name "*.java")
```

2. Execute uma classe com `main`:

```bash
java -cp bin com.loiane.estruturadados.vetor.SuaClasseMain
```

---

## 🐳 Executando com Docker

### 📌 Pré-requisitos

* Docker instalado
* Permissão para executar Docker (sem sudo ou usando sudo)

---

### 🔧 Build da imagem

```bash
docker build -t estrutura-dados .
```

---

### ▶️ Executar o container (modo interativo)

⚠️ Importante: como o projeto usa `Scanner`, é necessário rodar em modo interativo:

```bash
docker run -it estrutura-dados
```

---

### 🧠 Executar passando argumentos (opcional)

Se adaptar o código para usar `args`:

```bash
docker run estrutura-dados 10 20 30
```

---

## 🐳 Dockerfile utilizado

```dockerfile
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN mkdir -p bin
RUN javac -d bin $(find src -name "*.java")

CMD ["java", "-cp", "bin", "com.loiane.estruturadados.vetor.SuaClasseMain"]
```

---

## 📖 Conteúdos abordados

* Estruturas de dados lineares
* Algoritmos básicos
* Manipulação de dados em memória
* Complexidade de algoritmos

---

## 🎯 Aprendizados

* Lógica de programação
* Organização de código
* Estruturação de projetos Java
* Introdução ao uso de Docker

---

## 🤝 Contribuição

Sinta-se à vontade para contribuir:

1. Fork este repositório
2. Crie uma branch (`git checkout -b feature/minha-feature`)
3. Commit (`git commit -m 'Minha melhoria'`)
4. Push (`git push origin feature/minha-feature`)
5. Abra um Pull Request

---

## 📌 Autor

**Abdiel de Athayde**
Desenvolvedor Backend Java

* GitHub: [https://github.com/abdieldeathayde](https://github.com/abdieldeathayde)

---

## 📄 Licença

Projeto para fins educacionais.