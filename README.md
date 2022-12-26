# Java-BlueJ-Infection-Software

The Task
Imagine that you have been asked to write part of some software that will be used to 
manage laboratory tests for infection. The project consists of two classes:
• An InfectionResults class that is intended to store a collection of 
InfectionTest objects. This class has been partially written and your 
assessment task is to complete it.
• An InfectionTest class that stores details of a single test and its potential 
result: positive or negative. This class has already been written and you 
must not modify it. A single test object stores a unique ID (each is 
guaranteed to have a different ID and you don’t have to enforce this), whether 
the result status is known and whether the test was positive or not. An 
important point is that the positive or negative result is initially unknown 
because it takes time to process the test. So, a call to the isPositive
method must only be made if the result status is known (the statusKnown
field is true). Attempted to call isPositive if statusKnown is false will 
result in the program terminating with a ‘runtime exception’. This must be 
avoided.
In other words, when an InfectionTest object is created, its status is set to 
false and isPositive must not be called. However, once the setStatus
method has been called, its status is set to true and it is ok to call 
isPositive to find out whether the result was positive or negative.
