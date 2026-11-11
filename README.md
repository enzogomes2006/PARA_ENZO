# Sistema de Estacionamento

Aplicação Java de terminal para cadastrar, alterar, excluir e consultar carros e motos, com capacidade para 10 veículos e exibição do total.

## Requisitos

- JDK 17 ou superior (por exemplo, Eclipse Temurin: https://adoptium.net/).
- Git para clonar o repositório. Também é possível usar **Code > Download ZIP** no GitHub.

Confira a instalação em um terminal novo:

```sh
java -version
javac -version
```

Os dois comandos precisam funcionar. Apenas o Java Runtime (JRE) não é suficiente.

## Abrir em outra máquina

Instale o JDK e o Git, depois execute:

```sh
git clone https://github.com/enzogomes2006/PARA_ENZO.git
cd PARA_ENZO
```

- **Windows:** dê dois cliques em `executar.bat` ou execute `.\executar.bat` no PowerShell.
- **Linux/macOS:** execute `sh executar.sh` no terminal.

Os atalhos compilam o código e abrem o menu no terminal. Não há bibliotecas externas nem banco de dados para instalar.

Para trazer alterações do GitHub depois, execute `git pull` dentro da pasta do projeto.

## Abrir em uma IDE

- **VS Code:** instale o Extension Pack for Java e abra esta pasta. Abra `src/br/com/localiza/estacionamento/SistemaEstacionamento.java` e clique em **Run**.
- **IntelliJ IDEA:** abra a pasta, selecione um JDK 17 ou superior, marque `src` como **Sources Root** se necessário e execute `SistemaEstacionamento.main`.
- **Eclipse:** crie um projeto Java, desmarque **Use default location**, escolha esta pasta, configure `src` como pasta de código e execute `SistemaEstacionamento` como **Java Application**.

## Estrutura

```text
src/br/com/localiza/estacionamento/
  SistemaEstacionamento.java
  Veiculo.java
  Carro.java
  Moto.java
  Teclado.java
executar.bat
executar.sh
README.md
.gitignore
```

Os arquivos originais `.txt` foram convertidos em `.java`, mantendo as classes e o pacote. A leitura usa um único Scanner e valida entradas numéricas.

**Os cadastros ficam apenas na memória e são apagados ao fechar o programa.** Clonar o repositório transfere o código, não os veículos cadastrados em outra execução.
