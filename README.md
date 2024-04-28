
# CI/CD: A Magia da Integração Contínua e da Entrega Contínua

Este repositório será usado para estudar e compartilhar conhecimentos sobre CI/CD, bem como para treinar questões relacionadas à configuração do ambiente. Por isso, não haverá nenhum projeto significativo, sendo usado um projeto anterior [MQTT](https://github.com/WesleyS08/MQTT). No entanto, se você está interessado no tema, fique à vontade para explorar, e espero que tenha uma boa leitura e um ótimo aprendizado



## O que é CI/ CD ?

CI/CD é uma abordagem usada principalmente no desenvolvimento de software para integração contínua (CI) e entrega contínua (CD). Ela permite que as equipes de desenvolvimento integrem e entreguem código de forma contínua, garantindo uma entrega mais rápida e segura de aplicativos.

O principal benefício do CI/CD é a automatização dos testes e do processo de entrega, o que permite que as equipes de desenvolvimento detectem e corrijam problemas mais cedo, além de lançar novas funcionalidades de forma mais rápida e eficiente.

Uma característica interessante é que o próprio GitHub permite que você "crie e use CI/CD" em seus repositórios. No entanto, um ponto controverso é a questão dos testes a serem executados, que pode variar de empresa para empresa dependendo das regras e práticas de cada uma.


## CI/CD Explicados 

Sabemos que a técnica de CI/CD abrange várias etapas do desenvolvimento de software, mas o que ela faz exatamente pode variar dependendo do lugar onde é aplicada. Neste caso, "lugar" refere-se a empresas e aos programas usados para configurar a prática de CI/CD. Com isso em mente, vamos esclarecer a diferença entre CI e CD:

-  **Integração Contínua (CI)**: Este processo automatiza a integração de código. A cada commit, testes automatizados são executados para garantir que a nova alteração não cause problemas no projeto como um todo. Isso permite que as equipes detectem e corrijam erros mais cedo no ciclo de desenvolvimento. Apesar de ser normalmente feito uma automatização para os testes serem executados a cada commit, também é possível deixar para os testes serem executados de forma manual 

- **Entrega Contínua / Implantação Contínua (CD):** Este termo pode ter dois significados. A entrega contínua refere-se ao processo automatizado de integrar e compilar código, tornando-o pronto para ser implantado. A implantação contínua, por sua vez, vai um passo além, liberando automaticamente as compilações finais para os usuários finais.

![CI/CD](/imagem/Untitled.png)


## Integração Contínua (CI)
A integração contínua (CI) é uma prática fundamental no DevOps e um estágio crítico no ciclo de vida do desenvolvimento de software. Nela, os desenvolvedores fazem check-in de código em um repositório compartilhado várias vezes ao dia. Uma ferramenta de build automatizada verifica cada check-in para garantir que não haja erros e que o código esteja pronto para seguir para produção. O principal benefício da CI é a detecção precoce de problemas, evitando que eles se transformem em questões mais graves.

A prática de CI envolve integrar pequenos subconjuntos de alterações em um período de tempo mais curto, em vez de grandes atualizações menos frequentes. Automatizar fluxos de trabalho para testes, mesclagens e check-ins em um repositório compartilhado permite que as equipes entreguem código mais rápido e com mais confiança. Um código mais limpo significa validação mais rápida, versões mais estáveis e um pipeline de desenvolvimento mais eficiente e escalável.

Embora a CI seja altamente recomendada, não é estritamente necessária para que seu código funcione. Mesmo sem a prática de CI, o código ainda pode ser funcional sem grandes problemas. No entanto, ao incorporar CI ao seu processo de desenvolvimento, as chances de detectar erros e corrigir problemas antecipadamente aumentam significativamente, reduzindo a probabilidade de falhas mais críticas no futuro.
## Entrega Contínua (CD)

A entrega contínua segue a CI, atuando como uma fase de ponto de verificação no pipeline de desenvolvimento antes que o produto final seja lançado ou entregue aos clientes. Uma vez que as alterações de código são validadas, elas são automaticamente enviadas para o repositório. O objetivo da entrega contínua é manter as mudanças pequenas o suficiente para garantir que a build principal permaneça "pronta para produção".

Na entrega contínua, o produto final pode conter pequenos erros, mas nada substancial que comprometa a experiência do usuário. Praticar a entrega contínua significa que os desenvolvedores podem passar menos tempo testando internamente, pois a prática garante que apenas código estável chega à fase de entrega. Isso simplifica a detecção de bugs, acelerando o tempo de resolução
## Ponto inicial de cada entrega
Até agora, falamos bastante sobre entrega contínua, automatização e tópicos relacionados. No entanto, é importante entender onde cada parte do processo de CI/CD começa e quais tipos de testes cada um deve cobrir, pois isso pode impactar significativamente nosso projeto

![Ponto inicial](/imagem/inicio.png)

Assim como  discutimos, a integração contínua (CI) começa quando um commit é feito em um projeto. Dentro desse processo, podemos implementar diversos tipos de testes, como:

1. **Testes Unitários:**
 - Testes automatizados que verificam funcionalidades isoladas, geralmente no nível de métodos ou funções. São rápidos e ajudam a identificar problemas em um nível básico.
 2. **Testes de Integração**:
- Testam a interação entre diferentes componentes ou módulos do software para garantir que eles funcionem juntos conforme o esperado.
3. **Testes de Regressão**:
- Verificam se as novas alterações no código não causaram problemas ou quebraram funcionalidades existentes.
4. **Testes de Compilação/Build**:
- Garantem que o código pode ser compilado sem erros. Isso é importante para manter a integridade do projeto ao longo do tempo.
5. **Testes de Qualidade do Código**:
- Incluem análises estáticas para garantir que o código segue padrões de estilo, melhores práticas e não contém problemas comuns, como código morto ou vulnerabilidades básicas.
6. **Testes de Segurança**:
- Testes automatizados para identificar vulnerabilidades, como injeção de SQL, XSS (Cross-Site Scripting) ou outras falhas de segurança.
7. **Testes de Performance**:
- Avaliam o desempenho do software, como tempo de resposta, uso de recursos, e capacidade para lidar com carga. Geralmente aplicados em fases posteriores da CI, mas ainda podem ser parte do processo.
8. **Testes de Aceitação**:
- Validam se o software atende aos requisitos do usuário ou do cliente. Muitas vezes, são mais amplos e verificam o sistema como um todo.
9. **Testes de Sistema**:
- Testam o sistema completo, simulando ambientes reais para garantir que ele funcione conforme o esperado em um contexto mais amplo.

Esses são alguns dos tipos de testes que podem ser integrados no processo de CI. Cada tipo de teste tem um propósito específico e contribui para garantir que o código seja confiável, seguro e estável ao longo do ciclo de desenvolvimento

Na fase de Entrega Contínua (CD), diferentes tipos de testes são usados para garantir que o código esteja pronto para produção e que a implantação seja feita de forma segura e eficiente. Aqui está uma lista de testes comuns que podem ser implementados no processo de CD:

1. **Testes Unitários**:
- Verificam a funcionalidade de pequenas unidades do código, como funções ou métodos individuais. Eles são rápidos e geralmente escritos pelo próprio desenvolvedor para garantir que cada parte isolada do código funcione conforme esperado.
2. **Testes de Integração**:
- Avaliam se diferentes componentes ou módulos do sistema funcionam bem juntos. Eles ajudam a detectar problemas de integração que podem surgir quando partes independentes do código são combinadas.
3. **Testes de Interface do Usuário (UI)**:
- Testam a interação do usuário com a interface do aplicativo. Eles simulam ações como cliques, preenchimento de formulários e navegação para garantir que a experiência do usuário seja suave e sem erros.
4. **Testes de Regressão**:
- Verificam se novas alterações no código não introduziram falhas ou quebraram funcionalidades existentes. Normalmente, são executados em cada ciclo de entrega para garantir estabilidade.
5. **Testes de Aceitação**:
- Certificam-se de que o software atende aos requisitos do cliente ou do negócio. Eles geralmente são conduzidos por equipes de teste ou partes interessadas para validar se o sistema funciona conforme esperado em um contexto real.
6. **Testes de Performance**:
- Avaliam a velocidade, capacidade de resposta e estabilidade do sistema sob carga. Eles incluem testes de carga, testes de estresse e testes de volume para garantir que o sistema possa lidar com diferentes níveis de demanda.
7. **Testes de Segurança**:
- Identificam vulnerabilidades e fraquezas no sistema que possam ser exploradas por ameaças externas ou internas. Podem incluir testes de penetração, análise estática de código e análise de configuração.
8. **Testes de Usabilidade**:
- Verificam se o sistema é fácil de usar e entender pelos usuários finais. Normalmente envolvem usuários reais para testar a interface e a experiência geral do usuário.
9. **Testes de Instalação/Configuração**:
- Testam a instalação e configuração do sistema para garantir que ele possa ser implantado com sucesso em diferentes ambientes. Isso é crucial para garantir que o processo de implantação seja repetível e confiável.

Apesar de poderem ter alguns testes similares, cada um vai receber um objetivo diferente dentro do projeto que a pessoa ou empresa está realizando

![Ponto inicial](/imagem/2.png)


## Entendo a configuração do ambiente

1. **Workflow**:
- Um "workflow" é um conjunto de instruções que define o processo automatizado. Pode incluir uma sequência de etapas (steps) e trabalhos (jobs) que realizam tarefas específicas, como teste, compilação, ou implantação do código.
2. **Events (Eventos)**:
- "Events" são gatilhos que iniciam um workflow. Eles podem ser ações no repositório (como um push ou pull request), eventos de cronograma (como um agendamento diário), ou eventos externos (como uma notificação via webhook).
3. **Jobs (Trabalhos)**:
- "Jobs" são seções independentes de um workflow que podem ser executadas em paralelo ou em sequência. Cada job contém uma ou mais etapas (steps) para executar tarefas específicas, como teste unitário ou compilação.
4. **Steps (Etapas)**:
- "Steps" são ações individuais dentro de um job. Cada step executa uma única tarefa, como rodar um comando ou chamar uma ação específica. As etapas são executadas na ordem definida dentro de um job.
5. **Actions (Ações)**:
 - "Actions" são unidades reutilizáveis de código que realizam tarefas específicas dentro de um step. Elas podem ser criadas pela comunidade ou por desenvolvedores para simplificar o workflow. Exemplos incluem ações para configurar uma linguagem de programação, executar testes, ou enviar notificações.
6. **Runners**:
- "Runners" são ambientes onde os jobs são executados. Eles fornecem a infraestrutura para rodar workflows. Um runner pode ser hospedado (como nos servidores do GitHub) ou self-hosted (em um servidor ou máquina própria).


## Inicio da implementação 
Existem diferentes maneiras de criar essa implementação no seu projeto. Você pode configurá-la diretamente na sua IDE ou, se preferir uma interface mais amigável, pode ajustar as configurações diretamente pela interface web do seu repositório, que sera o caso desse projeto.

![Ponto inicial](/imagem/1.png)

Quando acessamos um repositório no GitHub, vemos uma aba chamada 'Actions', que é uma ferramenta poderosa para configurar e executar workflows de automação. Uma das características interessantes do GitHub Actions é que ele permite configurar testes específicos para a linguagem de programação ou tipo de projeto que você está usando e já oferece algumas opções. No caso deste repositório, estamos trabalhando em um aplicativo Android, então as opções de testes oferecidas estão relacionadas a esse ambiente.

![Ponto inicial](/imagem/3.png)

Podemos implementar vários testes em um mesmo arquivo, mas, por enquanto, vou usar apenas o Android CI

![Ponto inicial](/imagem/4.png)

Um detalhe ao qual precisamos prestar atenção é que há um local específico para colocar o arquivo de configuração dos testes, que o GitHub geralmente cria automaticamente.

![Ponto inicial](/imagem/5.png)

Ok, já subimos uma versão inicial do projeto e adicionamos os arquivos para configuração de testes. Mas como realmente configuramos os testes? Se você selecionou um framework ou tipo de teste específico, ele geralmente fornece uma estrutura pré-montada para executar os testes, como: 

```
name: Android CI

# Evento que dispara o workflow
on:
  push:
    branches: ["main"]
  pull_request:
    branches: ["main"]
  workflow_dispatch:  # Para permitir execução manual

# Configuração do job
jobs:
  build:
    runs-on: ubuntu-latest  # Ambiente do runner
    
    steps:
    - uses: actions/checkout@v4  # Faz o checkout do código no repositório
    - name: Setup JDK 11  # Configura o JDK 11 para o Android
      uses: actions/setup-java@v3
      with:
        java-version: '11'
        distribution: 'temurin'
        cache: gradle
    
    - name: Grant execute permission for gradlew  # Dá permissão de execução ao Gradlew
      run: chmod +x gradlew

    - name: Build with Gradle  # Executa a build do projeto Android
      run: ./gradlew build

```
Por padrão, o workflow é configurado para rodar testes sempre que houver um push na branch 'main'. Claro que é possível configurar de outras maneiras, dependendo do tipo de trabalho que você está realizando, mas esse não é o foco neste momento. Algo que pode ser muito útil, especialmente no início do estudo, é definir 'workflow_dispatch:', o que permite disparar o workflow manualmente. Isso facilita a correção de erros e possibilita testar de forma mais flexível.

Após salvarmos o arquivo de configuração, nossa página de ação terá uma pequena alteração, exibindo o teste que criamos. Ela ficará parecida com o seguinte exemplo:

![Ponto inicial](/imagem/6.png)

Uma característica interessante é que a página indica quando algum teste falhou. Se clicarmos no erro, podemos ver mais detalhes sobre o que deu errado, como, por exemplo, um problema no builder do projeto.

![Ponto inicial](/imagem/7.png)

Esse erro ocorreu porque configuramos uma versão antiga do Java para os testes. Para resolver isso, basta atualizar a versão no arquivo YML.

Se tudo correr bem, os testes indicarão sucesso, exibindo uma cor azul caracteristicamente.

![Ponto inicial](/imagem/8.png)

Esse problema ocorreu com um único teste, mas dificilmente trabalharemos com apenas um teste. Para aprofundar mais nessa questão, vamos implementar outro teste para observar a diferença na prática. Usaremos testes unitários como exemplo, embora outros tipos de testes também possam ser aplicados. Ou por exemplo a questão de criação de image para o docker 

```
name: Android CI

on:
  push:
    branches: ["main"]
  pull_request:
    branches: ["main"]
  workflow_dispatch:  # Para permitir execução manual

jobs:
  build:  # Primeiro job, chamado "build"
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v4  # Faz o checkout do código
    - name: Setup JDK 17  # Configura JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: gradle
    
    - name: Grant execute permission for gradlew  # Permite execução do Gradlew
      run: chmod +x ./gradlew  # Garante permissão de execução
    
    - name: Build with Gradle  # Compila o projeto Android
      run: ./gradlew build

  test:  # Segundo job, chamado "test"
    needs: build  # "test" depende do "build"
    runs-on: ubuntu-latest  # Ambiente do runner
    
    steps:
    - uses: actions/checkout@v4  # Faz o checkout do código novamente (por segurança)
    - name: Setup JDK 17  # Configura JDK 17 para o Android
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: gradle
    
    - name: Grant execute permission for gradlew  # Dá permissão de execução ao Gradlew
      run: chmod +x ./gradlew
    
    - name: Run Unit Tests  # Executa testes unitários
      run: ./gradlew test
```
## O Que Esse Workflow Faz?

- O workflow possui dois jobs: **`build`**  e **`test`**.
- O job **`build`** compila o projeto Android, garantindo que ele pode ser construído com sucesso.
- O job **`test`** executa testes unitários, que verificam se componentes individuais do código funcionam conforme o esperado.
- O job **`test`** depende do **`build`** (por isso o **`needs: build`**), garantindo que ele só é executado se o build for bem-sucedido.
- Ambos os jobs são executados no mesmo ambiente (**`ubuntu-latest`**) e usam a mesma configuração do JDK 17.
## Considerações finais 
Embora tenhamos incluído apenas alguns testes simples, o projeto serviu como uma base de aprendizagem para questões relacionadas a CI/CD. Existem inúmeros outros testes que poderíamos implementar, mas a lógica para incluí-los é muito semelhante ao que fizemos até agora. Agradeço por ter acompanhado até aqui, e se você quiser discutir algum ponto ou levantar uma questão, fique à vontade.