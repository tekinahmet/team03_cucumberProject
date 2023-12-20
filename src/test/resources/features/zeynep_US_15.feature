@US_15
  Feature: US_15 Vice Deans should be able to create a student.
    Background: login and go student management
      Given go to webpagez
      When click on loginz
      And enter usernamez "FolinaSahlo"
      And enter passwordz "Project13+"
      And click login buttonz
      And click on Menu buttonz
      And click on Student Managementz

      @US_15_TC_01
      Scenario: Vice Dean should be able to add student with all information entered
        And choose teacher on dropdown menu
        And enter namez "folina"
        And enter surnamez "sahlo"
        And enter birth placez "london"
        And enter emailz "zsude0002gmail.com"
        And enter phone numberz "111-111-4282 "
        And select genderz
        And select date of birthz "06.12.2023"
        And enter ssnz "123-46-7897"
        And usernamez "FolinaSahlooo"
        And father namez "father"
        And mother name "mother"
        And enter passworddd "Project13+"
        Then click on submit buttonz
        Then verify the student number automatically appear

      @US_15_TC_02
      Scenario: "Name" must be entered and cannot be left blank.(Negative)
          And choose teacher on dropdown menu
          And enter surnamez "sahlo"
          And enter birth placez "london"
          And enter emailz "zsude002@gmail.com"
          And enter phone numberz "111-111-4282"
          And select genderz
          And select date of birthz "06.12.2023"
          And enter ssnz "123-46-7897"
          And usernamez "FolinaSahlooo"
          And father namez "father"
          And mother name "mother"
          And enter passworddd "Project13+"
          Then click on submit buttonz
          Then verify invalid message shows up

      @US_15_TC_03
      Scenario: Surname" must be entered and cannot be left blank(Negative)
            And choose teacher on dropdown menu
            And enter namez "folina"
            And enter birth placez "london"
            And enter emailz "zsude002@gmail.com"
            And enter phone numberz "111-111-4282"
            And select genderz
            And select date of birthz "06.12.2023"
            And enter ssnz "123-46-7897"
            And usernamez "FolinaSahlooo"
            And father namez "father"
            And mother name "mother"
            And enter passworddd "Project13+"
            Then click on submit buttonz
            Then verify invalid message shows up

      @US_15_TC_04
      Scenario: "Birth Place" must be entered and cannot be left blank.(Negative)
              And choose teacher on dropdown menu
              And enter namez "folina"
              And enter surnamez "sahlo"
              And enter emailz "zsude002@gmail.com"
              And enter phone numberz "111-111-4282"
              And select genderz
              And select date of birthz "06.12.2023"
              And enter ssnz "123-46-7897"
              And usernamez "FolinaSahlooo"
              And father namez "father"
              And mother name "mother"
              And enter passworddd "Project13+"
              Then click on submit buttonz
           Then verify invalid message shows up

      @US_15_TC_05
      Scenario: E-mail must be entered and cannot be left blank.(Negative)
        And choose teacher on dropdown menu
        And enter namez "folina"
        And enter surnamez "sahlo"
        And enter birth placez "london"
        And enter phone numberz "111-111-4282"
        And select genderz
        And select date of birthz "06.12.2023"
        And enter ssnz "123-46-7897"
        And usernamez "FolinaSahlooo"
        And father namez "father"
        And mother name "mother"
        And enter passworddd "Project13+"
        Then click on submit buttonz
        Then verify invalid message shows up

      @US_15_TC_06
      Scenario: Phone number must be entered and cannot be left blank.(Negative)
        And choose teacher on dropdown menu
        And enter namez "folina"
        And enter surnamez "sahlo"
        And enter birth placez "london"
        And enter emailz "zsude002@gmail.com"
        And select genderz
        And select date of birthz "06.12.2023"
        And enter ssnz "123-46-7897"
        And usernamez "FolinaSahlooo"
        And father namez "father"
        And mother name "mother"
        And enter passworddd "Project13+"
        Then click on submit buttonz
        Then verify invalid message shows up

      @US_15_TC_07
      Scenario: Gender must be selected and cannot be left blank.(Negative)
        And choose teacher on dropdown menu
        And enter namez "folina"
        And enter surnamez "sahlo"
        And enter birth placez "london"
        And enter emailz "zsude002@gmail.com"
        And enter phone numberz "111-111-4282"
        And select date of birthz "06.12.2023"
        And enter ssnz "123-46-7897"
        And usernamez "FolinaSahlooo"
        And father namez "father"
        And mother name "mother"
        And enter passworddd "Project13+"
        Then click on submit buttonz
        Then verify invalid message shows up

      @US_15_TC_08
      Scenario: Date of birth must be entered and cannot be left blank.(Negative)
        And choose teacher on dropdown menu
        And enter namez "folina"
        And enter surnamez "sahlo"
        And enter birth placez "london"
        And enter emailz "zsude002@gmail.com"
        And select genderz
        And enter phone numberz "111-111-4282"
        And enter ssnz "123-46-7897"
        And usernamez "FolinaSahlooo"
        And father namez "father"
        And mother name "mother"
        And enter passworddd "Project13+"
        Then click on submit buttonz
        Then verify invalid message shows up

      @US_15_TC_09
      Scenario: SSN must be entered and must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and cannot be left blank.(Negative)
       And choose teacher on dropdown menu
       And enter namez "folina"
       And enter surnamez "sahlo"
       And enter birth placez "london"
       And enter emailz "zsude002@gmail.com"
       And select genderz
       And enter phone numberz "111-111-4282"
       And select date of birthz "06.12.2023"
       And enter ssnsecond "1234564dsaq"
       And usernamez "FolinaSahlooo"
       And father namez "father"
       And mother name "mother"
       And enter passworddd "Project13+"
        Then click on submit buttonz
       Then verify alert message shows up

     @US_15_TC_10
     Scenario: User Name must be entered and cannot be left blank.(Negative)
      And choose teacher on dropdown menu
      And enter namez "folina"
      And enter surnamez "sahlo"
      And enter birth placez "london"
      And enter emailz "zsude002@gmail.com"
      And select genderz
      And enter phone numberz "111-111-4282"
      And select date of birthz "06.12.2023"
      And enter ssnz "123-46-7897"
      And father namez "father"
      And mother name "mother"
      And enter passworddd "Project13+"
       Then click on submit buttonz
      Then verify invalid message shows up

    @US_15_TC_11
    Scenario: Father Name must be entered and cannot be left blank.(Negative)
      And choose teacher on dropdown menu
      And enter namez "folina"
      And enter surnamez "sahlo"
      And enter birth placez "london"
      And enter emailz "zsude002@gmail.com"
      And select genderz
      And enter phone numberz "111-111-4282"
      And select date of birthz "06.12.2023"
      And enter ssnz "123-46-7897"
      And usernamez "FolinaSahlooo"
      And mother name "mother"
      And enter passworddd "Project13+"
      Then click on submit buttonz
      Then verify invalid message shows up

    @US_15_TC_12
    Scenario: Mother Name must be entered and cannot be left blank.(Negative)
      And choose teacher on dropdown menu
      And enter namez "folina"
      And enter surnamez "sahlo"
      And enter birth placez "london"
      And enter emailz "zsude002@gmail.com"
      And select genderz
      And enter phone numberz "111-111-4282"
      And select date of birthz "06.12.2023"
      And enter ssnz "123-46-7897"
      And usernamez "FolinaSahlooo"
      And father namez "father"
      And enter passworddd "Project13+"
      Then click on submit buttonz
      Then verify invalid message shows up

    @US_15_TC_13
    Scenario: Password can be entered and must consist of at least 8 characters.(Negative)
      And choose teacher on dropdown menu
      And enter namez "folina"
      And enter surnamez "sahlo"
      And enter birth placez "london"
      And enter emailz "zsude002@gmail.com"
      And select genderz
      And enter phone numberz "111-111-4282"
      And select date of birthz "06.12.2023"
      And enter ssnz "123-46-7897"
      And usernamez "FolinaSahlooo"
      And father namez "father"
      And mother name "mother"
      And enter passwordfirst "Proje1"
      Then click on submit buttonz
      Then verify invalid message shows up

    @US_15_TC_14
    Scenario: Password must contain uppercase letters, lowercase letters, and a number.(Negative)
      And choose teacher on dropdown menu
      And enter namez "folina"
      And enter surnamez "sahlo"
      And enter birth placez "london"
      And enter emailz "zsude002@gmail.com"
      And select genderz
      And enter phone numberz "111-111-4282"
      And select date of birthz "06.12.2023"
      And enter ssnz "123-46-7897"
      And usernamez "FolinaSahlooo"
      And father namez "father"
      And mother name "mother"
      And enter passwordsecond "projecttt+"
      Then click on submit buttonz
      Then verify invalid message shows up








