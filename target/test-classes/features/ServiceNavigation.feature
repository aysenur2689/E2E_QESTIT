Feature: Navigation des Services QESTIT
  En tant qu'utilisateur
  Je veux naviguer à travers les services QESTIT
  Afin d'accéder au service de Test Logiciel

  Scenario: Naviguer vers le Service de Test Logiciel
    Given je suis sur la page d'accueil de QESTIT
    When je clique sur le menu Services
    And je clique sur l'option Test Logiciel
    Then je dois voir le titre Test Logiciel
    When je clique sur Automatisation des tests
