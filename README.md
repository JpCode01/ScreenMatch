<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Documentação do Projeto Screenmatch</h1>
    <h2>Descrição do Projeto</h2>
    <p>O projeto <strong>Screenmatch</strong> é uma aplicação Java que permite gerenciar uma lista de filmes e séries, incluindo funcionalidades para calcular a duração total dos títulos, avaliar filmes e séries, e realizar buscas em uma API externa para obter informações sobre filmes.</p>
    <h2>Estrutura do Projeto</h2>
    <pre>
/screenmatch
│
├── .env                          # Variáveis de ambiente
├── .git                          # Controle de versão
├── .gitignore                    # Arquivos a serem ignorados pelo Git
├── filmes.json                   # Armazenamento de dados de filmes em formato JSON
├── filmes.txt                    # Informações de filmes em formato texto
├── out/                          # Diretório de saída para arquivos compilados
├── README.md                     # Documentação do projeto
├── screenmatch.iml               # Configuração do projeto no IntelliJ IDEA
└── src/                          # Código fonte da aplicação
    ├── br/com/alura/screenmatch
    │   ├── calculos              # Pacote com classes de cálculo
    │   ├── excessao              # Pacote com exceções personalizadas
    │   ├── modelos               # Pacote com classes de modelo (Filme, Série, etc.)
    │   └── principal             # Pacote com classes principais (Main)
    </pre>
    <h2>Principais Classes</h2>
    <ul>
        <li><strong>CalculadoraDeTempo</strong>: Classe responsável por calcular a duração total de filmes e séries.</li>
        <li><strong>Classificavel</strong>: Interface que define o método <code>getClassificacao()</code> para classes que podem ser classificadas.</li>
        <li><strong>FiltroRecomendacao</strong>: Classe que fornece recomendações com base na classificação dos títulos.</li>
        <li><strong>Episodio</strong>: Classe que representa um episódio de uma série.</li>
        <li><strong>Filme</strong>: Classe que representa um filme, estendendo a classe <strong>Titulo</strong>.</li>
        <li><strong>Serie</strong>: Classe que representa uma série, estendendo a classe <strong>Titulo</strong>.</li>
        <li><strong>Titulo</strong>: Classe base que representa um título (filme ou série).</li>
        <li><strong>Deserializer</strong>: Classe responsável por deserializar dados JSON em objetos Java.</li>
        <li><strong>SerializerWriter</strong>: Classe responsável por serializar objetos Java em formato JSON.</li>
    </ul>
    <h2>Funcionalidades</h2>
    <ul>
        <li><strong>Avaliação de Títulos</strong>: Os usuários podem avaliar filmes e séries, e a média das avaliações é calculada.</li>
        <li><strong>Cálculo de Duração</strong>: A aplicação calcula a duração total de todos os títulos adicionados.</li>
        <li><strong>Recomendações</strong>: A aplicação fornece recomendações com base na classificação dos títulos.</li>
        <li><strong>Busca de Filmes</strong>: Os usuários podem buscar filmes através de uma API externa (OMDb API) e armazenar os resultados em um arquivo JSON.</li>
    </ul>
    <h2>Como Executar o Projeto</h2>
    <ol>
        <li><strong>Clone o repositório</strong>:
            <pre>
git clone https://github.com/seu_usuario/screenmatch.git
cd screenmatch
            </pre>
        </li>
        <li><strong>Configure as variáveis de ambiente</strong>:
            <p>Crie um arquivo <code>.env</code> na raiz do projeto e adicione sua chave da API:</p>
            <pre>
API_KEY=sua_chave_da_api
            </pre>
        </li>
        <li><strong>Compile e execute o projeto</strong>:
            <p>Utilize um IDE como IntelliJ IDEA ou Eclipse para compilar e executar o projeto.</p>
        </li>
    </ol>
    <h2>Contribuições</h2>
    <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.</p>
    <h2>Observação</h2>
    <p>Certifique-se de que todas as dependências necessárias estão instaladas e configuradas corretamente antes de executar o projeto.</p>
</body>
</html>
