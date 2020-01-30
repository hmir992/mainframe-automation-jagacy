Feature: Phonebook

  As I university mainframe user
  I should be able to search faculty members in Phonebook
  So I can contact them for help
      
   Scenario: Search faculty phone number using name
    Given I start a new emulator session
    When I open phonbook application
    And search for faculty last name "MUNDLE"
    Then I should see the results matching with my search criteria
			|MUNDLE, PRATIK D           979-739-5469  ELECTRICAL ENGINEERING       3128|
			|MUNDLE, ROHAN M             UNAVAILABLE|
			|MUNEOKA, KEN               979-845-2344  VET MED - PHYSIOLOGY & PH    4466|
			|MUNGO, GABRIELLA           214-934-2253  OPEN ACCESS LABS             1161|
			|MUNIZ, ABRAHAM              UNAVAILABLE  REED ARENA                   1128|
			|MUNIZ, AMANDA               UNAVAILABLE  AGRICULTURE EDUCATION        2116|
      
  Scenario: Search faculty phone number using name
    Given I start a new emulator session
    When I open phonbook application
    And search for faculty name "PRATIK"
    Then I should see the results matching with my search criteria
      |PRATIK D MUNDLE            979-739-5469  ELECTRICAL ENGINEERING       3128|
      |PRATIK A PATEL              UNAVAILABLE  ENGINEERING IT GROUP ADLO|
      |PRATIK VIJAY TOSHNIWAL     979-739-9414  DEPT OF INFORMATION & OPE    4217|