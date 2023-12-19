@US01_Registration

  Feature: US_01 prospective students should register to system

    Background: User should go to website and click on register button
      Given user goes to url "https://managementonschools.com/"
      When click on register button at the top right
      Then verify that register page opened

      @US01_TC01
      Scenario: TC01 Prospective students should be able to register in the system, all fields must be filled

        And enter name "Shadow"
        And enter surname "Heart"
        And enter birth place "Baldur"
        And enter phone number "777-333-1111"
        And choose gender
        And enter date of birth "07072007"
        And enter SSN "357-35-1357"
        And enter registrationUsername "ShadowHeart"
        And enter registrationPassword "ShadowHeart123"
        Then click on register button at the bottom
        Then verify that registration is successful

    @US01_TC02
    Scenario: TC02 Prospective students should not be able to register in the system, user must not choose a gender

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC03
    Scenario: TC03 Prospective students should not be able to register in the system, name field must be empty

      And enter name ""
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC04
    Scenario: TC04 Prospective students should not be able to register in the system, surname field must be empty

      And enter name "Shadow"
      And enter surname ""
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC05
    Scenario: TC05 Prospective students should not be able to register in the system, birth place field must be empty

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place ""
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC06
    Scenario: TC06 Prospective students should not be able to register in the system, phone number field must be empty

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number ""
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful
    @US01_TC07
    Scenario Outline: TC07 Prospective students should not be able to register in the system, user enters phone number in wrong format

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "<phoneNumber>"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

      Examples: phone numbers
        | phoneNumber   |
        | 7777-333-1111 |
        | 777-3333-1111 |
        | 777-333-11111 |
        | 77-333-1111   |
        | 777-33-1111   |
        | 777-333-111   |


    @US01_TC08
    Scenario: TC08 Prospective students should not be able to register in the system, date of birth field must be empty

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth ""
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC09
    Scenario: TC09 Prospective students should not be able to register in the system, SSN field must be empty

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN ""
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC10
    Scenario Outline: TC10 Prospective students should not be able to register in the system, user enters SSN in wrong format

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "<SSN>"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

      Examples: SSN
        | SSN          |
        | 3579-35-1357 |
        | 357-357-1357 |
        | 357-35-13579 |
        | 35-35-1357   |
        | 357-3-1357   |
        | 357-35-135   |

    @US01_TC11
    Scenario: TC11 Prospective students should not be able to register in the system, username field must be empty

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername ""
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC12
    Scenario: TC12 Prospective students should not be able to register in the system, password field must be empty

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword ""
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC13
    Scenario: TC13 Prospective students should not be able to register in the system, user enters same SSN with a different username

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart123"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC14
    Scenario: TC14 Prospective students should not be able to register in the system, user enters same username with a different SSN

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "359-35-1359"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC15
    Scenario Outline: TC15 Prospective students should not be able to register in the system, user enters password in wrong format

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername "ShadowHeart"
      And enter registrationPassword "<password>"
      Then click on register button at the bottom
      Then verify that registration is not successful

      Examples: password
        | password       |
        | ShadowHeart    |
        | shadowheart123 |
        | SHADOWHEART123 |
        | Shadow         |

    @US01_TC16
    Scenario: TC16 Prospective students should not be able to register in the system; user enters only space for name, surname, birth place and username fields

      And enter name " "
      And enter surname " "
      And enter birth place " "
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "357-35-1357"
      And enter registrationUsername " "
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful

    @US01_TC17
    Scenario: TC17 Prospective students should not be able to register in the system, user enters same phone number with a different SSN and username

      And enter name "Shadow"
      And enter surname "Heart"
      And enter birth place "Baldur"
      And enter phone number "777-333-1111"
      And choose gender
      And enter date of birth "07072007"
      And enter SSN "359-35-1359"
      And enter registrationUsername "ShadowHeart123"
      And enter registrationPassword "ShadowHeart123"
      Then click on register button at the bottom
      Then verify that registration is not successful



