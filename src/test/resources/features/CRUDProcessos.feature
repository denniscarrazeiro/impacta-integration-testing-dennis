#language: pt
  @wip
  Funcionalidade: Crud processos

    Contexto: detalhamento
      Dado que o usuário gostaria de salvar um processo
      E usuário informa vara com o valor igual a "1"
      E usuário informa numero_processo com o valor igual a "1"
      E usuário informa natureza  com o valor igual a "Guarda"
      E usuário informa partes com o valor igual a "Pedro x Livia"
      E usuário informa urgente com o valor igual a "N"
      E usuário informa arbitramento com o valor igual a "S"
      E usuário informa assistente_social com o valor igual a "Lorival"
      E usuário informa data_entrada  com o valor igual a "12/12/2020"
      E usuário informa data_saida com o valor igual a ""
      E usuário informa data_agendamento com o valor igual a ""
      E usuário informa status com o valor igual a "Aguardando"
      E usuário informa observacao com o valor igual a ""

    @ignore
    Cenario: adicionar processo | POST (apenas para verificar o uso das tags)
      Quando usuário clicar no botão de salvar
      Entao usuário deve ver a mensagem "Usuário salvo com sucesso."

    Cenario: adicionar processo | POST
      Quando usuário clicar no botão de salvar
      Entao usuário deve ver a mensagem "Usuário salvo com sucesso."

    Cenario: mostrar processo | GET
      E usuário clicar no botão de salvar
      Quando o usuário clicar em mostrar
      Entao usuário deve ver a mensagem "sucesso"

    Cenario: atualizar processo | PUT
      E usuário clicar no botão de salvar
      Quando alterar o campo "assistente_social" para o valor "Merval"
      E o usuário clicar em editar
      Entao usuário deve ver a mensagem "sucesso"
      Quando o usuário clicar em mostrar
      Entao  o usuário visualiza o campo "assistente_social" com o valor "Merval"

    Cenario: remover processo | DELETE
      E usuário clicar no botão de salvar
      Quando  o usuario clicar em remover
      Entao  o usuario deve ver a mensagem "sem conteúdo"
      Quando  o usuário clicar em mostrar
      Entao  o usuario deve ver a mensagem "não encontrado"

    Esquema do Cenario: Validação do post com esquema de cenário
      Dado que o usuário gostaria de salvar um processo
      E usuário informa vara com o valor igual a "<vara>"
      E usuário informa numero_processo com o valor igual a "<numero_processo>"
      E usuário informa natureza  com o valor igual a "<natureza>"
      E usuário informa partes com o valor igual a "<partes>"
      E usuário informa urgente com o valor igual a "<urgente>"
      E usuário informa arbitramento com o valor igual a "<arbitramento>"
      E usuário informa assistente_social com o valor igual a "<assistente_social>"
      E usuário informa data_entrada  com o valor igual a "<data_entrada>"
      E usuário informa data_saida com o valor igual a "<data_saida>"
      E usuário informa data_agendamento com o valor igual a "<data_agendamento>"
      E usuário informa status com o valor igual a "<status>"
      E usuário informa observacao com o valor igual a "<observacao>"
      Quando usuário clicar no botão de salvar
      Entao o usuario deve ver a mensagem "Usuário salvo com sucesso."

      Exemplos:
      | vara |  numero_processo | natureza | partes          | urgente | arbitramento | assistente_social | data_entrada | data_saida | data_agendamento | status           | observacao |
      | 1    | 1                | usucapião| Gilmar X Zaquel | S       | S            | Maria Isabel      | 12/12/2020   | 12/12/2030 |                  | Aguardando       |            |
      | 2    | 2                | Separação| Gedeão X Cleide | S       | S            | Moacir Lopes      | 13/12/2020   | 13/12/2030 |                  | Aguardando       |            |