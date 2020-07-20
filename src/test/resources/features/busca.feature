# new feature
# Tags: optional


@busca
Feature: : Buscas no site Get Net
  Como possível cliente Get Net desejo esclarecer minhas dúvidas

@busca
  Scenario Outline: Realizar consulta
    Given que eu pesquisar por <busca>
    When  eu clico sobre a  <opcao>
    Then  eu verei o <resultado>
  Examples:
  | busca  | opcao | resultado |
  |"superget"|"Posso contratar a condição de recebimento de 2% para qualquer maquininha?"|"Observação: essa condição de recebimento não é válida para E-commerce."|
