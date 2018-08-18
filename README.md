# Full Automatic Washing Machine
This project is the software programe for an full automatic washing mashine it have all the process 
for how the internal component work.The user do not know about it. He just load his closthes 
and select the programe.

fully-automatic washing machines, which gives you the choice when it comes to how you want to wash your clothes. If you need a certain temperature or you’re washing with a certain fabric, then programs help you find the optimal washing conditions for your laundry needs from selecting the right wash temperature to setting up your washing timing.

# Features implemented
<p>This project was built using two design pattern:</p>
  <p>1-Singelton Design Pattern.</p>
  This design pattern help to Ensure that we have one washer object class has only one instance, 
  and provide a global point of access to it.
  <p>2-Mediator Design Pattern.</p>
 The Mediator defines an object that controls how a set of objects interact. 
 Loose coupling between colleague objects is achieved by having colleagues 
 communicate with the Mediator, rather than with each other

# Implementation Details
1.	You put your clothes.
2.	You set the program you want and switch on the power.
3.	The programmer opens the water valves so hot and cold water enter the machine and fill up the outer and inner drums. 
4.	The programmer switches off the water valves.
5.	The thermostat measures the temperature of the incoming water. If it's too cold, it open hot water. And if it hot it open cold water.
6.	When the water is hot enough, the programmer makes the inner drum rotate back and forth, sloshing the clothes through the soapy water.
7.	The detergent pulls the dirt from your clothes and traps it in the water.
8.	The programmer opens a valve so the water drains from both drums. Then it switches on the pump to help empty the water away.
9.	The programmer opens the water valves again so clean water enters the drums.
10.	The programmer makes the inner drum rotate back and forth so the clean water rinses the clothes. It empties both drums and repeats this process several times to get rid of all the soap.
11.	When the clothes are rinsed, the programmer makes the inner drum rotate at really high speed. The clothes are flung against the outside edge of the inner drum, but the water they contain is small enough to pass through the drum's tiny holes into the outer drum. Spinning gets your clothes dry using the same idea as a centrifuge.
12.	The pump removes any remaining water from the outer drum and the wash cycle comes to an end.
13.	You take your clothes out and marvel at how clean they are!


# Future Implantation
<p> Adding another programe to the machine is easy we just add a new mediator withe the spicific value
for temepture and drum rotate and it will work</p>


# Getting Started

This project built in a Java Maven Template and it
use Apache Maven to compile and run. 

[![Build Status](https://travis-ci.org/kiat/JavaProjectTemplate.svg?branch=master)](https://travis-ci.org/kiat/JavaProjectTemplate)  

[![Coverage Status](https://coveralls.io/repos/github/kiat/JavaProjectTemplate/badge.svg?branch=master)](https://coveralls.io/github/kiat/JavaProjectTemplate?branch=master)

[![sonarcloud](https://sonarcloud.io/api/project_badges/measure?project=edu.bu.cs665%3AExample-1&metric=alert_status)](file:https://sonarcloud.io/api/project_badges/measure?project=edu.bu.cs665%3AExample-1&metric=alert_status)

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


