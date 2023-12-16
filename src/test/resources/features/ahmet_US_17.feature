@US_17
Feature: US_17 The teacher should be able to give grades to the students.

Background: successful_login
Given navigate to homepage "https://managementonschools.com/"
When click on login button
And enter user name "teacherdonald"
And enter Password "Donald123"
And click on login


@US_17_TC_01
Scenario: TC_01 User should login successfully.
Then verify User signed in
When User logged out


@US_17_TC_02_03
Scenario Outline: TC_02 The lesson, student and semester should be selectable.
When click on Choose Lesson option
And select "<lesson>" assigned to user
And click on Choose Student option
And select a "<student>"
And click on Choose Education Term option
And select an education semester
And User logged out

Examples: test_data
|lesson    |student   |
|Jmeter|Whitney Glover|

@US_17_TC_03
Scenario Outline: TC_03 Absences, Midterm and Final Exam grades and Info note about the student should be able to be entered.
When enter "<absentee>"
And enter Midterm Exam "<firstExam>"
And enter Final Exam "<secondExam>"
And enter Info Note About The Student "<info>"
And User logged out

Examples: test_data
|absentee |firstExam   |secondExam  |info          |
|   5    |   100      |     100     |  you passed.  |

@US_17_TC_04
Scenario Outline: TC_04 User shouldn't save the student info without selecting lesson
When leave Choose Lesson option blank
And click on Choose Student option
And select a "<student>"
And click on Choose Education Term option
And select an education semester
And enter "<absentee>"
And enter Midterm Exam "<firstExam>"
And enter Final Exam "<secondExam>"
And enter Info Note About The Student "<info>"
And click on Submit Button
Then verify User sees lesson name in Student Info list
And User logged out

Examples: test_data
|student   |absentee |firstExam   |secondExam  |info          |
|Whitney Glover|  5    |   100      |     100     |  you passed.  |
@US_17_TC_05
Scenario Outline: TC_05 User shouldn't save the student info without selecting student
When click on Choose Lesson option
And select "<lesson>" assigned to user
And leave on Choose Student option blank
And click on Choose Education Term option
And select an education semester
And enter "<absentee>"
And enter Midterm Exam "<firstExam>"
And enter Final Exam "<secondExam>"
And enter Info Note About The Student "<info>"
And click on Submit Button
Then verify User sees student name in Student Info list
And User logged out

Examples: test_data
|lesson   |absentee |firstExam   |secondExam  |info          |
|Jmeter|  5    |   100      |     100     |  you passed.  |

  @US_17_TC_06
  Scenario Outline: TC_06 User shouldn't save the student info without selecting Education Term
    When click on Choose Lesson option
    And select "<lesson>" assigned to user
    And click on Choose Student option
    And select a "<student>"
    And leave on Choose Education Term option blank
    And enter "<absentee>"
    And enter Midterm Exam "<firstExam>"
    And enter Final Exam "<secondExam>"
    And enter Info Note About The Student "<info>"
    And click on Submit Button
    Then verify User sees education term in Student Info list
    And User logged out

    Examples: test_data
      |lesson   |student|absentee |firstExam   |secondExam  |info          |
      |Jmeter|    Whitney Glover      |  5    |   100      |     100     |  you passed.  |

  @US_17_TC_07
  Scenario Outline: TC_07 User shouldn't save the student info by leaving absentee box blank
    When click on Choose Lesson option
    And select "<lesson>" assigned to user
    And click on Choose Student option
    And select a "<student>"
    And click on Choose Education Term option
    And select an education semester
    And leave absentee blank
    And enter Midterm Exam "<firstExam>"
    And enter Final Exam "<secondExam>"
    And enter Info Note About The Student "<info>"
    And click on Submit Button
    Then verify User sees absentee required message in Student Info list
    And User logged out

    Examples: test_data
      |lesson   |student|firstExam   |secondExam  |info          |
      |Jmeter   |    Whitney Glover      |    100      |     100     |  you passed.  |

  @US_17_TC_08
  Scenario Outline: TC_08 User shouldn't save the student info by leaving midterm exam box blank
    When click on Choose Lesson option
    And select "<lesson>" assigned to user
    And click on Choose Student option
    And select a "<student>"
    And click on Choose Education Term option
    And select an education semester
    And enter "<absentee>"
    And leave Midterm Exam blank
    And enter Final Exam "<secondExam>"
    And enter Info Note About The Student "<info>"
    And click on Submit Button
    Then verify User sees midterm exam required message in Student Info list
    And User logged out

    Examples: test_data
      |lesson   |student|absentee |secondExam  |info          |
      |Jmeter|    Whitney Glover      |  5    |     100     |  you passed.  |

  @US_17_TC_09
    Scenario Outline: TC_09 User shouldn't save the student info  by leaving final exam box blank
    When click on Choose Lesson option
    And select "<lesson>" assigned to user
    And click on Choose Student option
    And select a "<student>"
    And click on Choose Education Term option
    And select an education semester
    And enter "<absentee>"
    And enter Midterm Exam "<firstExam>"
    And leave Final Exam blank
    And enter Info Note About The Student "<info>"
    And click on Submit Button
    Then verify User sees final exam required message in Student Info list
    And User logged out

    Examples: test_data
      |lesson   |student|absentee |firstExam   |info          |
      |Jmeter|    Whitney Glover      |  5    |   100      |  you passed.  |
  @US_17_TC_10
    Scenario Outline: TC_10 User shouldn't save the student info by leaving student info box blank
    When click on Choose Lesson option
    And select "<lesson>" assigned to user
    And click on Choose Student option
    And select a "<student>"
    And click on Choose Education Term option
    And select an education semester
    And enter "<absentee>"
    And enter Midterm Exam "<firstExam>"
    And enter Final Exam "<secondExam>"
    And leave Info Note About The Student blank
    And click on Submit Button
    Then verify User sees info required message in Student Info list
    And User logged out

    Examples: test_data
      |lesson   |student|absentee |firstExam   |secondExam  |
      |Jmeter|    Whitney Glover      |  5    |   100      |     100     |