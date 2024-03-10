Feature: facebook functionality

  Scenario: check facebook login user stories
    Given go to facebook login page
    When enter userid and password
    Then hit login button
    And navigate to home page

    Examples: 
    |userid       | password       |
    |kathrikie@rr| 1234243423|
    |iekiskwie   |2431234224|
    |isdielakdflksfl|1423424|
    |diiiwelwk|1234214|
    
    Scenario: check facebook login user stories
    Given go to facebook login page
    When enter userid and password
    Then hit login button
    And navigate to home page

    Examples: 
    |userid       | password       |
    |kathrikie@rr| 123424343423|
    |iekiskwie   |243123443224|
    |isdielakdflksfl|142343424|
    |diiiwelwk|123423414|