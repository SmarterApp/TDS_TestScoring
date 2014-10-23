# Welcome to the TestScoring Application
The TestScoring project contains classes related to Test scoring. At this time classes are mostly stubs. 

## License ##
This project is licensed under the [AIR Open Source License v1.0](http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf).

## Getting Involved ##
We would be happy to receive feedback on its capabilities, problems, or future enhancements:

* For general questions or discussions, please use the [Forum](http://forum.opentestsystem.org/viewforum.php?f=9).
* Use the **Issues** link to file bugs or enhancement requests.
* Feel free to **Fork** this project and develop your changes!

## Module Overview

### TestScoring Java

   TestScoring module contains stub classes related to  Scorer, ScoringEngine.

## Setup
In general, build the code and deploy the JAR file.

### Build order

If building all components from scratch the following build order is needed:

* sharedmultijardev
* itemselection
* item-scoring

## Dependencies
TestScoringDev has a number of direct dependencies that are necessary for it to function.  These dependencies are already built into the Maven POM files.

### Compile Time Dependencies

* shared-xml
* shared-web
* tds-itemselection-aironline
* item-scoring-api