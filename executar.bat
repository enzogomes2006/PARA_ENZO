@echo off
cd /d "%~dp0"
where javac >nul 2>nul
if errorlevel 1 (
    echo Instale o JDK 17 ou superior e adicione java e javac ao PATH.
    pause
    exit /b 1
)
if not exist build mkdir build
javac -encoding UTF-8 -d build src\br\com\localiza\estacionamento\*.java
if errorlevel 1 (
    pause
    exit /b 1
)
java -cp build br.com.localiza.estacionamento.SistemaEstacionamento
pause
