Feature: test Facebook Application

  Scenario Outline: Create Multiple Users
    Given user is on Register Page
    When user enter "<firstname>", "<Lastname>", "<mobOremailId>" and "<password>"
    Then user will be created in system

    Examples: 
      | firstname | Lastname | mobOremailId        | password     |
      | Aditya    | Patil    | aditya122@gmail.com | aditya@123   |
      | Akash     | Bhalke   | akash123@gmail.com  | aaksh@123    |
      | Amruta    | Patil    | amruta@gmail.com    | amrtuata@123 |

    Examples: 
      | firstname | Lastname | mobOremailId    | password  |
      | Anjali    | more     | anjali@gmil.com | anjali123 |
      | Atul      | kambale  | atul@gmail.com  | atul123   |
