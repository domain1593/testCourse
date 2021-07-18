@stories
  Feature: Academy Choucair
    As a user i want to lear how to automate
    @scenario1
    Scenario: search for automation course
      Given that brandon wants to learn at the academy choucair
      | strUser | strPassword |
      | 3731530 | Choucair2021*   |
      When he search for the course on the Choucair Academy Platform
      | strCourse |
      | Foundation |
      Then he finds the course called
      | strCourseInside |
      | Foundation Level |