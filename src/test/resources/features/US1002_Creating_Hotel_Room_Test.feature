
Feature: US1002_Creating_Hotel_Room_Test

  Background: User is on the main page
    Given user is on the main page
    And user clicks login button
    When user enters the username
    When user enters the password
    When user clicks login
    When user clicks hotel management
    When user clicks hotel rooms

  Scenario: TC01_Verify_the_created_hotel_room
    When user clicks add hotelroom button
    When user selects idhotel
    When user enters the code
    When user enters the name
    When user enters the location
    When user enters description
    When user enter the price
    When user selects the room type
    When user enters the max adult count
    When user enters the max children count
    When user clicks approved button
    And user clicks save button
    And user verifys the alert has successfully
    And user clicks ok button

  Scenario: TC02 verify hotel room is created
    When user input the code to the code box
    When user clicks on the search button
    Then verify name field with your hotel name