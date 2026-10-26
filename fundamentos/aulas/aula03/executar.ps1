
$ErrorActionPreference = "Stop"

$arquivos = @(
    ".\src\main\kotlin\app\Main.kt",
    ".\src\main\kotlin\carrinho\Produto.kt",
    ".\src\main\kotlin\vitrine\Produto.kt"
)

kotlinc $arquivos -include-runtime -d aula03.jar

if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

java -jar aula03.jar
