# mvn clean verify -Dcucumber.filter.tags=@whatsapp -Dbrowser=chrome -DtestedEnv=STAGING 

Feature: Whatsapp Communication

 @whatsapp
    Scenario: Send a message via Whatsapp
        When I can open the website 
        When I login in Whatsapp
        And I Send a message in Whatsapp