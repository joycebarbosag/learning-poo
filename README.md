[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/VeEZoujL)
# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Iago Rodrigues

**Disciplina**: Programação Orientada a Objetos

**Atividade**: Lista de Exercícios 01

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java/br/unicap/poo/atividade 
> 2. A submissão **não deve ser feita após o prazo**
> 3. Para cada exercício, criar um pacote dentro da pasta "atividade", que deve conter a classe base e a classe Main

## Exercícios

> Lembrando: Para cada questão a seguir, se faz necessário a criação da classe base e também da classe Main, a qual irá criar objetos a partir da classe base.
> Ações obrigatórias: Para cada exercício a seguir implementar todos os atributos indicados no enunciado (de forma encapsulada), o construtor padrão (vazio), o construtor que inicializa todos os atributos, todos os métodos indicados no enunciado, todos os métodos getters e setters (para cada atributo do enunciado).

### Questão 01

Gestão de Biblioteca: Imagine que você precisa organizar as informações dos livros em uma biblioteca. Crie uma classe Livro com atributos para armazenar o título, autor e ano de publicação. Em seguida, simule a adição de três livros ao sistema, mostrando suas informações.

### Questão 02

Sistema de Controle de Alunos: Uma escola precisa de um sistema para gerenciar informações sobre seus alunos. Desenvolva uma classe Aluno com atributos para o nome, idade e série. Crie objetos para representar três alunos diferentes e mostre seus dados.

### Questão 03

Catálogo de Produtos: Uma loja virtual quer manter um catálogo de seus produtos. Implemente uma classe Produto com atributos para nome, preço e categoria. Adicione três produtos ao catálogo e exiba as informações de cada um.

### Questão 04

Gerenciamento de Funcionários: Uma empresa deseja manter um registro de seus funcionários. Crie uma classe Funcionario com atributos para nome, departamento e salário. Registre três funcionários e mostre os detalhes de cada um.

### Questão 05

Sistema de Reservas de Hotel: Um hotel quer um sistema simples para gerenciar reservas. Elabore uma classe Reserva que contenha o nome do hóspede, o tipo de quarto (simples, duplo, suíte) e o número de noites. Crie três reservas diferentes e exiba as informações.

### Questão 06

Registro de Veículos: Um departamento de trânsito precisa de um sistema para registrar veículos. Desenvolva uma classe Veiculo com atributos para a placa, marca e ano. Registre três veículos diferentes e apresente seus dados.

### Questão 07

Sistema de Perfil de Usuário para Rede Social: Uma rede social quer permitir que seus usuários criem perfis. Implemente uma classe PerfilUsuario com atributos para nome de usuário, bio e número de seguidores. Crie perfis para três usuários e mostre os detalhes.

### Questão 08

Controle de Eventos: Uma organização que promove eventos quer um sistema para gerenciar informações sobre eles. Crie uma classe Evento com atributos para nome do evento, data e local. Organize três eventos diferentes e exiba as informações.


### Questão 09

Gerenciamento de Pacientes em uma Clínica: Uma clínica médica precisa de um sistema para manter registros de pacientes. Desenvolva uma classe Paciente com atributos para nome, idade e diagnóstico. Registre três pacientes e mostre suas informações.

### Questão 10

Sistema de Pedidos de Restaurante: Um restaurante deseja um sistema para gerenciar pedidos. Implemente uma classe Pedido que contenha o número do pedido, a descrição dos itens pedidos e o valor total. Crie três pedidos diferentes e apresente os detalhes.

### Questão 11

Classe ContaCorrente Um banco digital deseja oferecer aos seus clientes uma experiência simplificada através de uma conta corrente que permita depósitos, saques, transferências e consulta de saldo. Para atender a essa necessidade, você deve criar a classe ContaCorrente com os atributos numeroDaConta (String), saldo (double) e nomeDoTitular (String).

* Métodos:
    * depositar(double valor): aumenta o saldo.
    * sacar(double valor): diminui o saldo, se houver saldo suficiente.
    * transferir(ContaCorrente destino, double valor): transfere valor de uma conta para outra.
    * exibirSaldo(): mostra o saldo atual da conta.

### Questão 12

Classe SessaoCinema Um cinema busca melhorar a gestão de suas sessões e ingressos vendidos. A ideia é ter um sistema que permita controlar a venda e cancelamento de ingressos, além de alterar o horário das sessões e exibir informações relevantes sobre elas. Para isso, implemente a classe SessaoCinema com atributos filme (String), horario (String), capacidadeTotal (int) e ingressosVendidos (int).

* Métodos:
    * venderIngresso(): diminui a capacidade total e aumenta os ingressos vendidos, se houver lugares disponíveis.
    * cancelarIngresso(): aumenta a capacidade total e diminui os ingressos vendidos, se possível.
    * exibirInfoSessao(): mostra informações da sessão e quantos lugares ainda estão disponíveis.
    * alterarHorario(String novoHorario): modifica o horário da sessão.

### Questão 13

Classe AgendaTelefonica Com o aumento no número de contatos que as pessoas precisam gerenciar, surge a necessidade de uma agenda telefônica digital simples e eficaz. A classe Contato deve armazenar informações como nome (String), telefone (String) e email (String), permitindo atualizações e exibição desses dados.
* Métodos:
    * alterarTelefone(String novoTelefone): atualiza o número de telefone do contato.
    * alterarEmail(String novoEmail): atualiza o email do contato.
    * exibirContato(): mostra todas as informações do contato.
    * validarEmail(): verifica se o email contém um @.

### Questão 14

Classe GerenciadorDeTarefas Para ajudar na organização diária de tarefas, é proposto um sistema que permita o gerenciamento de tarefas, incluindo marcação como concluída, alteração de prioridade, e reset de tarefas. A classe Tarefa deve conter descricao (String), concluida (boolean) e prioridade (int).
* Métodos:
    * concluirTarefa(): marca a tarefa como concluída.
    * mudarPrioridade(int novaPrioridade): altera a prioridade da tarefa.
    * exibirTarefa(): mostra a descrição, se está concluída e a prioridade.
    * resetarTarefa(): marca a tarefa como não concluída.

### Questão 15

Classe ControleDeEstoque Pequenos armazéns necessitam de um sistema eficiente para gerenciar o estoque de seus produtos. A classe ProdutoEstoque deve permitir o controle de nome (String), quantidade (int) e precoUnitario (double) de cada produto, facilitando a adição e remoção de itens, além de permitir a atualização de preços e exibição de informações dos produtos.
* Métodos:
    * adicionarEstoque(int quantidade): aumenta a quantidade em estoque.
    * removerEstoque(int quantidade): diminui a quantidade em estoque, se houver quantidade suficiente.
    * atualizarPreco(double novoPreco): atualiza o preço unitário do produto.
    * exibirProduto(): mostra o nome, quantidade e preço do produto.

### Questão 16

Classe GerenciadorDeCursos Plataformas de e-learning estão em busca de maneiras eficazes para gerenciar cursos e inscrições de alunos. A classe Curso deve fornecer meios para controlar o nome (String), categoria (String), cargaHoraria (int) e numeroDeAlunosInscritos (int), incluindo funcionalidades para inscrição e cancelamento de alunos, além de atualização da carga horária e exibição de informações do curso.
* Métodos:
    * inscreverAluno(): aumenta o número de alunos inscritos.
    * cancelarInscricao(): diminui o número de alunos inscritos, se houver alunos inscritos.
    * atualizarCargaHoraria(int novaCargaHoraria): atualiza a carga horária do curso.
    * exibirInformacoes(): mostra informações do curso.

### Questão 17

Classe SistemaDeVotação Comunidades pequenas frequentemente realizam votações para diversas decisões. Para facilitar esse processo, a classe Votacao deverá gerenciar candidato (String) e votosRecebidos (int), permitindo a adição de votos, zeramento da contagem e comparação dos resultados entre diferentes candidatos.
* Métodos:
    * adicionarVoto(): aumenta o número de votos recebidos pelo candidato.
    * zerarVotos(): reinicia a contagem de votos para o candidato.
    * exibirResultado(): mostra o nome do candidato e o número de votos recebidos.
    * compararVotos(Votacao outraVotacao): compara os votos recebidos com outro candidato e indica quem tem mais votos.

### Questão 18

Classe MonitorDeAtividadesFisicas Para quem busca melhorar a saúde e monitorar atividades físicas, um aplicativo que registre e compare atividades pode ser muito útil. A classe AtividadeFisica deve incluir tipoDeAtividade (String), duracao (int) e caloriasQueimadas (int), com métodos para registrar novas atividades, alterar o tipo, exibir informações e comparar o gasto calórico.
* Métodos:
    * registrarAtividade(int duracao): registra uma nova atividade e calcula calorias queimadas com base na duração.
    * alterarTipoDeAtividade(String novoTipo): muda o tipo de atividade.
    * exibirAtividade(): mostra o tipo de atividade, duração e calorias queimadas.
    * compararCalorias(AtividadeFisica outraAtividade): compara as calorias queimadas com outra atividade.

### Questão 19

Classe GerenciadorFinanceiro A gestão de finanças pessoais pode ser simplificada com um sistema que controle as transações de receitas e despesas. A classe Transacao deve armazenar descricao (String), valor (double) e tipo (String), proporcionando um meio para registrar, alterar e exibir transações, além de calcular o saldo final com base em uma lista de transações.
* Métodos:
    * registrarTransacao(): adiciona uma nova transação ao histórico.
    * alterarDescricao(String novaDescricao): atualiza a descrição da transação.
    * exibirTransacao(): mostra a descrição, valor e tipo da transação.
    * calcularSaldo(ArrayList<Transacao> transacoes): calcula o saldo final baseando-se na lista de transações.

### Questão 20

Classe SistemaDeReservasDeVoos Companhias aéreas precisam de sistemas eficientes para gerenciar as reservas de voos, permitindo alterações e cancelamentos de forma simples. A classe ReservaDeVoo deve incluir numeroDoVoo (String), nomeDoPassageiro (String) e classe (String), com funcionalidades para alterar a classe da reserva, confirmar e cancelar reservas, além de exibir os detalhes pertinentes.
* Métodos:
    * alterarClasse(String novaClasse): muda a classe da reserva.
    * cancelarReserva(): cancela a reserva do voo.
    * confirmarReserva(): confirma a reserva do passageiro.
    * exibirDetalhes(): mostra detalhes da reserva, incluindo número do voo, nome do passageiro e classe.
