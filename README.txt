# Calculator test with focus on unit testing

How it works: the calculator takes a file with instructions and calculates the result of the instructions. The instructions contains keywords and numbers (see files in the resources folder for structure and examples). Instructions are loaded from file and results are output to the screen. Any number of instructions can be specified and can be any binary operations (e.g. add, divide, subtract ect) and ignores mathematical precedence. 



## Building the application

.jar file has been built using the Maven tool in IntelliJ community edition from JetBrains.
edition

to build .jar file in command line:
    navigate to project
    mvn clean install

To run program in command line:
    java -jar Calculator-1.0-SNAPSHOT.jar <path to file>

In building the .jar file with Maven in the commandline I experienced
initial problems. The default maven installation (3.6.3) on my linux system (ubuntu 20.04) did not
support java version above java 11. This made it necessary to set the language level of the
project to java 11 instead of java 17 even though the build in Maven tool for IntelliJ could
build the .jar with the language level being 17.
