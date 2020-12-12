#language: pt

  Funcionalidade: Crud processos

    Cenario: adicionar processo
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
      Quando usuário clicar no botão de salvar
      Entao usuário deve ver a mensagem "Usuário salvo com sucesso."
