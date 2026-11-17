# language: pt

Funcionalidade: Avaliação do aluno
  Como professor
  Quero calcular a média das notas
  Para identificar a situação do aluno

  Cenário: Aluno aprovado
    Dado que as notas são 8 e 6
    Quando calcular a média
    Então a média deve ser 7
    E a situação deve ser "APROVADO"

  Cenário: Aluno em recuperação
    Dado que as notas são 6 e 6
    Quando calcular a média
    Então a média deve ser 6
    E a situação deve ser "RECUPERACAO"

  Cenário: Nota inválida
    Dado que as notas são 11 e 8
    Quando calcular a média
    Então deve ocorrer um erro de nota inválida