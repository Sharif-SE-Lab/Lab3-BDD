@tag
Feature: Calculator

    Scenario: add two numbers
        Given Two input values, 1 and 2
        When I add the two values
        Then I expect the result 3

    Scenario Outline: add two numbers
        Given Two input values, <first> and <second>
        When I add the two values
        Then I expect the result <result>

        Examples:
            | first | second | result |
            | 1     | 12     | 13     |
            | 2     | 2      | 4	  |

    Scenario: operation on two numbers
        Given Two input values, 1 and 2
        When the mul is requested
        Then I expect the result 2

    Scenario Outline: operation on two numbers
        Given Two input values, <first> and <second>
        When the <operation> is requested
        Then I expect the result <result>

        Examples:
            | first | second | operation | result |
            | 1     | 12     | add       | 13	  |
            | 3     | 2      | mul	     | 6	  |
            | 8     | 2      | div	     | 4	  |
            | 3     | 2      | pow	     | 9	  |
