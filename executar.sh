#!/usr/bin/env sh
set -eu
cd "$(dirname "$0")"
if ! command -v javac >/dev/null 2>&1; then
    echo "Instale o JDK 17 ou superior e adicione java e javac ao PATH."
    exit 1
fi
mkdir -p build
javac -encoding UTF-8 -d build src/br/com/localiza/estacionamento/*.java
java -cp build br.com.localiza.estacionamento.SistemaEstacionamento
