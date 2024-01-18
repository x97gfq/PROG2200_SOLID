
https://javatechonline.com/solid-principles-the-single-responsibility-principle/#Example1_Code_that_violates_Single_Responsibility_Principle

How many responsibilities?

The correct answer is three.

Here we have 1) calculation logic 2) database logic and 3) reporting logic.
All mixed up within one class. If you have multiple responsibilities combined
into one class, it might be difficult to change one part without breaking others.
Mixing responsibilities also makes the class harder to understand and harder to test.
It will also decrease the cohesion. The easiest way to fix this is to split the class
into three different classes, with each having only one responsibility: database access,
calculating payment and reporting, all separated.



