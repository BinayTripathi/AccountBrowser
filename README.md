# Children In Queue Elimination problem 


[![Spring_Boot Framework](https://img.shields.io/badge/Springboot-2.2.6.RELEASE_Framework-blue.svg?style=plastic)](https://start.spring.io/) |[![Java](https://img.shields.io/badge/Java-java-blue.svg?style=plastic)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) | ![GitHub language count](https://img.shields.io/github/languages/count/BinayTripathi/ServiceVictoria-ChildrenInQueue.svg) | ![GitHub top language](https://img.shields.io/github/languages/top/BinayTripathi/ServiceVictoria-ChildrenInQueue.svg) |![GitHub repo size in bytes](https://img.shields.io/github/repo-size/BinayTripathi/ServiceVictoria-ChildrenInQueue.svg) 
| --- | ---          | ---        | ---      | ---        | 

---------------------------------------

## Repository codebase
 
The repository consists of projects as below:


| # |Project Name | Project detail | location| Environment |
| ---| ---  | ---           | ---          | --- |
| 1 | ChildrenInCircleAlgo| Jar with algorithm logic |ChildrenInCircleAlgo | [![.SpringBoot framework](https://img.shields.io/badge/Springboot-2.2.6.RELEASE_Framework-blue.svg?style=plastic)](https://start.spring.io/)|
| 2 |ChildrenInCircleEntry | Client to invoke the jar with algo logic |  ChildrenInCircleEntry | [![.Net Framework](https://img.shields.io/badge/Springboot-2.2.6.RELEASE_Framework-blue.svg?style=plastic)](https://start.spring.io/)| 
| 3 | pom.xml | Parent maven POM  | Parent folder- ChildrenInCircle | [![Node](https://img.shields.io/badge/Maven-mvn-blue.svg?style=plastic)](https://maven.apache.org/download.cgi) |

### Summary

The overall objective of the applications :
```
>   The application provides the solution to *Children in Queue elimination problem*. 

>   As per the problem, for a given count of children (say n) and a skip sequence(k) every kth child is removed from the circular queue and we need the sequence of   elimination and the winner.

>   The application consists of a non-executable depedency jar project(ChildrenInCircleAlgo) which contains the algorithm . 

>   The algorithm has a time complexity  of order O(nk) and space complexity of O(1) - ignoring a list that is used to collect the final outout.

>   The application also has a client project - ChildrenInCircleEntry which uses the jar ChildrenInCircleAlgo-0.0.1-SNAPSHOT.jar  generated from the project ChildrenInCircleAlgo as a dependency. This client is for demonstration and the dependency jar can be used by any applcation.

>   A brief design of the dependency jar is as follows:  
    *   Static method 'getEliminationSequenceAndWinner' of class 'ChildrenInCircle_GameManager' is invoked by the client. 
    *   Abstract class 'IChildrenInCircleAlgo' is injected to the 'ChildrenInCircle_GameManager'. 
    *   Class 'ChildrenInCircleIterativeAlgoImpl' that extends of 'IChildrenInCircleAlgo', has the actual implementation of the algorithm (see method 'getEliminationSequenceAndWinner' of class 'ChildrenInCircleIterativeAlgoImpl').
```


### Application design detail

>   The application consists of 
*  A client executable jar
*  A non-executable depedency jar which can be used by any type of spring boot application (So that this is independent of **envirornemnt**)
    
>   For a problem as this the over all **design seems to be overkill** however the purpose of the solution is 2-fold
*  Formulate an optimal and feasible solution to problem at hand.
*  Demonstrate design acumen and SpringBoot familiarity

### Algorithm complexity
>   Time complexity **O(nk)**  
>   Space complexity **O(1)**  ignoring the List to hold the output sequence


### Setup detail

##### Environment Setup detail

> Download/install   	
>	1.	[![Maven](https://img.shields.io/badge/Mavan-3.6.3-blue.svg?style=plastic)](https://maven.apache.org/download.cgi) to build project and run test suite
>   
>   2. [![Java](https://img.shields.io/badge/Java-1.8_-blue.svg?style=plastic)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) to run the project
>   
>	3. [![STS](https://img.shields.io/badge/Spring_Tool_Suite-STS-blue.svg?style=plastic)](https://spring.io/tools) to run/debug the applications
>	

##### Project Setup detail

>   1. Please clone or download the repository from [![github](https://img.shields.io/badge/git-hub-blue.svg?style=plastic)](https://github.com/BinayTripathi/ServiceVictoria-ChildrenInQueue) 
>   
#####  To build / run the application

>   1. Browse to the root folder ( **ChildrenInCircle** ) of the application 
>   
>   2. Within the new terminal, left mouse double click on **Build.bat** to download dependencies, compile the Java classes and run the Tests 
>   
>   3. To run the application, edit **Run.bat** and provide appropriate values of n( number of children) and k(skip sequence) . Then left mouse double click on the **Run.bat** to see results in **output.txt** (sample output provided)


```
Test results can be seen under 
ChildrenInCircle\ChildrenInCircleAlgo\target\surefire-reports
```

##### To open the project in Spring Tool Suite (or Eclipse)
>   1. Open **Spring Tool Suite** .
>   2. Select **File** ->  **Import** and then select **Existing Maven Projects**
>   3. Browse to  **ChildrenInCircle** select pom.xml and click **Finish** to import the project.
>   4. Run/Debug the project

### Support or Contact

Having any trouble? Please read out this [documentation](https://github.com/BinayTripathi/ServiceVictoria-ChildrenInQueue/edit/master/README.md) or [contact](mailto:binay.mckv@gmail.com) and to sort it out.

  [![HitCount](http://hits.dwyl.com/BinayTripathi/ServiceVictoria-ChildrenInQueue.svg)](http://hits.dwyl.com/BinayTripathi/ServiceVictoria-ChildrenInQueue) | ![GitHub contributors](https://img.shields.io/github/contributors/BinayTripathi/ServiceVictoria-ChildrenInQueue)|
 | --- | --- |


