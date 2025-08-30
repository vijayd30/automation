Feature: Annotation

  Scenario Outline:
    When I enter username as "<name>"
    And I enter password as "<password>"
    Then Login should fail

    Examples:
      | name  | password |
      | Vijay | test     |
