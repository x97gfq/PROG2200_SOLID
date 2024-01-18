Based on

https://www.javabrahman.com/programming-principles/single-responsibility-principle-with-example-in-java/

Refactoring the Employee class so that it adheres to Single Responsibility Principle
Let us now refactor the Employee class to make it own a single responsibility.

Lets move the promotion determination logic from Employee class to the HRPromotions
class like this

Similarly, lets move the income tax calculation logic from Employee class to
FinITCalculations class -

Our Employee class now remains with a single responsibility of maintaining core
employee attributes -

