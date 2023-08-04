@tag
Feature: CalculatorAdapter

  Scenario: different operations on two numbers
    Given Two input numbers, 1 and 2, and the operation +
    Then I expect the result of calculation 3

  Scenario Outline: different operations on two numbers
    Given Two input numbers, <first> and <second>, and the operation <op>
    Then I expect the result of calculation <result>

    Examples:
      | first | second | op     | result |
      | 1     | 12     | +      | 13     |
      | 2     | 6      | *  	| 12     |
      | 2     | 2      | /	    | 1      |
      | 7     | 4      | ^	    | 2401   |

  Scenario: unsupported operation
    Given Two input numbers, 10 and 4, and the operation %
    Then I expect error