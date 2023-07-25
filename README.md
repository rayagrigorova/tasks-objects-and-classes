<h1 align="center">Tasks</h1>



## Tasks 06

### 6.1 Color Range

Write an interactive Java program, **ColorRange.java**, which when given a wavelength in nanometers will return the corresponding color in the visible spectrum.

1. Prompt the user to enter the wavelength, the wavelength should be of type double.
2. For each range (e.g. 380-450) the number on the left is included in the range, but the number on the right is not included in the range.
3. If the input value is not found on the visible spectrum then state that the wavelength is not within the visible spectrum.
4. Expected Output:
  a. Enter a color code
     630
     The color is Red
  b. Enter a color code
     25.0
     The entered wavelength is not a part of the visible spectrum
  c. Enter a color code
     750.5
     The entered wavelength is not a part of the visible spectrum


### 6.2 Multi Planetary Weight

Write a Java program to do the following that determines your weight on another planet. The program should ask
for the user's weight on Earth, then present a menu of the other planets in our solar system. The user should
choose one of the planets from the menu. The program should display the phrase like the following: “Your weight on Mars is 55 kg.”


### 6.3 Final exam excuse

A professor in college will allow a student to be excused from the final exam if either of the following is true:
• They have a 90% average or higher in the class and have missed 3 or less class lectures.
• They have a 80% average or higher in the class and have not missed any class lectures.
• The program below will determine whether a student can get out of the exam or not.
• Rewrite the program so only one if statement is used.

```java
import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {
   	 double average;
   	 int daysAbsent;
   	 boolean exempt = false;
   	 Scanner reader = new Scanner(System.in);
   	 System.out.println("This program will determine if you can get out of the final exam.");
   	 System.out.println("Please answer the following questions.");
   	 System.out.println("What is your average in the class?");
   	 average = reader.nextDouble();
   	 System.out.println("How class lectures have you missed?");
   	 daysAbsent = reader.nextInt();
   	 if (average >= 90) {
   		 if (daysAbsent <= 3)
   			 exempt = true;
   	 } else if (average >= 80) {
   		 if (daysAbsent <= 0)
   			 exempt = true;
   	 }
   	 if (exempt)
   		 System.out.println("Congratulations! You are exempt from the final exam.");
   	 else
   		 System.out.println("You are not exempt from the final exam.");
    }// end of main
}// end of class

```

### 6.4 Paint

Write a program that calculates the number of buckets of paint to use for a room and the optimal number of cans to
purchase.
You need to ask the height of the room and the length and width of the room. The room is rectangular. You must
paint the walls and the ceiling but not the floor. There are no windows or skylights. You can purchase the following
size buckets of paint.
• 5-liter bucket costs $15 each and covers 140 square meters.
• 1-liter bucket costs $4 and covers 30 square meters.

## Tasks 07

### Anagrams
An anagram is a word or a phrase made by transposing the letters of another word or phrase; for example, "parliament" is an anagram of "partial men" and "software" is an anagram of "swear oft." Write a program that figures out whether one string is an anagram of another string. The program should ignore white space and punctuation.

### Tuition calculator
Suppose that the tuition for a university is $10,000 this year and increases 6% every year. In one year, the tuition will be $10,600. Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.

### Number pyramid

Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:

```
Enter the number of lines: 7
7 6 5 4 3 2 1 2 3 4 5 6 7
6 5 4 3 2 1 2 3 4 5 6
5 4 3 2 1 2 3 4 5
4 3 2 1 2 3 4
3 2 1 2 3
2 1 2
1
```

### Star pattern 

Use nested loops that display the following pattern:  

 \* \* \* \* \* \* \*  
  \* \* \* \* \* \*  
     \* \* \* \* \*  
       \* \* \* \*  
         \* \* \*  
           \* \*  
             \*  




