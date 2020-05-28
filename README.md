# kata-tennis
This is the base project/settings inspired by the kata created by Emily Bache (https://github.com/emilybache/)

## How to kata?
- First of all: Split all participants in pairs (more people is allowed in a group so nobody is left alone), any pair/group should be formed by people who do not usually code together.
- The exercise is splitted in iterations which resemble real-life sprints or periods of time, every iteration adds up requirements to the base exercise.
- Every iteration is composed by 5-minute periods where only one developer is allowed to code (ideally each group will work on one computer).
- It is advised to not read the following iterations as you may ruin the element of surprise (in real-life scenarios we never know when or how requirements change)
- After every iteration we must code review all groups 
## What do you need?
- IntelliJ IDEA
- Kotlin support for IntelliJ

For online katas, you might consider adding:
- Teamhub Plugin for IntelliJ (https://plugins.jetbrains.com/plugin/11955-teamhub)
# Exercise
Your colleague went on vacation and he left you with a feature done with all tests working as expected so you are requested 
by the company to show that magnificent code to other programmers in the next KotlinConf and explain a bit how easy the solution was.
## Iteration 1
### Refactoring tests
Yes, tests can be refactored to add readability or to support more flexible rules. A bad test can be even worse than not
having a test because that green check might be hiding terrible bugs or glitches in our system.
Make sure these cases are covered in our tennis scoring system:

| Case name   |      Player1 score      |  Player2 score | Expected result| 
|:----------:|:-------------:|:------:|:------:|
| Different scores below 3 |  0 | 1 | Love-Fifteen
| Same score below 3 |    2   |   2 | Thirty-All
| Same score 3 or more | 3 |    3 | Deuce
| Same score 3 or more | 7 |    7 | Deuce
| 2 points above opponent + high score 4 or more | 4 |    0 | Win for player1
| 2 points above opponent + high score 4 or more| 8 |    10 | Win for player2
| 1 points above opponent + high score 4 or more | 4 |    3 | Advantage player1
- Base values are these: (0=Love, 1=Fifteen, 2=Thirty, 3=Forty)

## Iteration 2
### Refactoring code itself

Here we can choose any of the following options:

- Refactoring a monolith (TennisGame1)
- Refactoring code made by a beginner (TennisGame2)
- Refactoring code made by someone who knows too much (TennisGame3)
- Rage quit and do a new class (TennisGame4?)
# Objective of this kata
The main objective of this exercise is Refactoring. 

While working in real life situations we are expected to work in code done by programmers of different knowledge levels, 
this might be a problem if those previous programmers didn't follow certain rules or if the solution
was overengineered.
# Author

Edgar Davila - Initial work
