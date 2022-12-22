Feature:
  Scenario: Login
    Given user on homepage
    And user write "Admin" into "Username"
    And user write "admin123" into "Password"
    And user clicks "Login" button