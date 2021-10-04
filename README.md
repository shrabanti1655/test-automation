selenium-cucumber-java-maven
      selenium-cucumber : Automation
      
       Download a Framework  - https://github.com/shrabanti1655/test-automation.git
       
       Framework Architecture -
          src/test/java/features - all the cucumber features files (files .feature ext) goes here.
          src/test/java/stepDefinition - all the step defintion under this package for feature steps are defined here.
          src/test/java/drivers - chrome driver is saved here
          
       Running test - 
        
          mvn clean install
          Run the tests as Junit 
            Open Junit runner --> Window > Show View > Other - In the pop up window - Java -> Junit
            To run your tests we need to set run configurations in the project. 
            Go to Package explorer and right click on your project.
            From the menu that comes up select Run As -> Run Configurations
