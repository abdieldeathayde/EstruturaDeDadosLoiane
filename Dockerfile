FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN mkdir -p bin
RUN javac -d bin $(find src -name "*.java")

CMD ["java", "-cp", "bin", "com.loiane.estruturadados.vetor.Main"]