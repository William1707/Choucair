@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario: Search for a automation course
      Given than brandon  wants to learn automation at the academy Choucair
      |strUSer  | strPassword |
      |TuUsuario  | TuClave     |

      When She search for the course on the Choucair Academy platform
      |strCourse    |
      |Metodoloia Bancolombia|

      Then She finds the course called
      | strCoruse |
      | Metodolgia Bancolombia |
