# Full Automatic Washing Machine
This project is the software programe for an full automatic washing mashine it have all the process 
for how the internal component work.The user do not know about it. He just load his closthes 
and select the programe.

# Features implemented
<p>This project was built using two design pattern:</p>
  <p>1-Singelton Design Pattern.</p>
  This design pattern help to Ensure that we have one washer object class has only one instance, 
  and provide a global point of access to it.
  <p>2-Mediator Design Pattern.</p>
  
  this design helped to .........

# Implementation Details
The user come and chose a programe. then he press start.
the washer look for the brogram he used and statr it. when the program start

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


