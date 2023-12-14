/*
	START

	Initialize a final variable NUM_ELEMENTS to equal 7
	Initialize array list weekDays to store the days of the week (Monday – Sunday)
	Initialize a second array list dailyTemps to store 7 daily temperatures
	Initialize a variable sumTemps to be equal to the sum of the dailyTemps
	Initialize a variable avgTemp to calculate the average temperature
	Initialize variables i and j for the for loop
	
	Create a FOR LOOP to calculate the total sum of the temperatures
	Create a FOR LOOP to iterate 7 times over the weekDays
	Create another FOR LOOP to iterate 7 times over dailyTemps
	Display: “Enter a day of the week (Monday – Sunday)”
	Create a switch statement for each day of the week
	SWITCH(userInput)
	
	CASE “Monday”:
	CASE “Tuesday”:
	CASE “Wednesday”:
	CASE “Thursday”:
	CASE “Friday”:
	CASE “Saturday”:
	CASE “Sunday”:
	
	Depending on what weekDay the userInput, 
	the result displayed will be the day that the userInput and the temperature for that day.
	
	CASE “week”:
		CALCULATE average temperature by sumTemps / NUM_ELEMENTS
		Display “Monday: 74 degrees”
		Display “Tuesday: 60 degrees”
		Display “Wednesday: 80 degrees”
		Display “Thursday: 65 degrees”
		Display “Friday: 48 degrees”
		Display “Saturday: 67 degrees”
		Display “Sunday: 70 degrees”
		Display “Average Temperature: avgTemp”
	DEFAULT:
		Display “That's not a weekday!”

	END

 */

import java.util.Scanner;

public class weeklyTemps {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// There are 7 days a week so the number of elements per array is 7
		final int NUM_ELEMENTS = 7;
		
		// Arrays to store the weekday and daily temperatures
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", 
							"Friday", "Saturday", "Sunday"};
		int[] dailyTemps = {74, 60, 80, 65, 48, 67, 70};
		
		// Variables to calculate the average temperature
		double sumTemps = 0;
		double avgTemp;
		int i;
		int j;
		
		// Calculate the sum of the temperatures
		for (int temp : dailyTemps) {
			sumTemps += temp;	
		}
		
		// Prompt the user  for a day of the week
		for (i = 0; i < weekDays.length; i++) {
			for (j = 0; j < dailyTemps.length; j++) {				
				System.out.println("Enter a day of the week (Monday - Sunday): ");
				String userInput = scnr.next();
				
				switch (userInput) {
					case "Monday":
						System.out.println();
						System.out.println(weekDays[0] + ": " + dailyTemps[0] + " degrees");
						break;
					case "Tuesday":
						System.out.println();
						System.out.println(weekDays[1] + ": " + dailyTemps[1] + " degrees");
						break;
					case "Wednesday":
						System.out.println();
						System.out.println(weekDays[2] + ": " + dailyTemps[2] + " degrees");
						break;
					case "Thursday":
						System.out.println();
						System.out.println(weekDays[3] + ": " + dailyTemps[3] + " degrees");
						break;
					case "Friday":
						System.out.println();
						System.out.println(weekDays[4] + ": " + dailyTemps[4] + " degrees");
						break;
					case "Saturday":
						System.out.println();
						System.out.println(weekDays[5] + ": " + dailyTemps[5] + " degrees");
						break;
					case "Sunday":
						System.out.println();
						System.out.println(weekDays[6] + ": " + dailyTemps[6] + " degrees");
						break;
					case "week":
						avgTemp = sumTemps / NUM_ELEMENTS;
						System.out.println();
						System.out.println(weekDays[0] + ": " + dailyTemps[0] + " degrees");
						System.out.println(weekDays[1] + ": " + dailyTemps[1] + " degrees");
						System.out.println(weekDays[2] + ": " + dailyTemps[2] + " degrees");
						System.out.println(weekDays[3] + ": " + dailyTemps[3] + " degrees");
						System.out.println(weekDays[4] + ": " + dailyTemps[4] + " degrees");
						System.out.println(weekDays[5] + ": " + dailyTemps[5] + " degrees");
						System.out.println(weekDays[6] + ": " + dailyTemps[6] + " degrees");
						System.out.println();
						System.out.printf("Average Temperature: %.2f", avgTemp);
						System.out.print(" degrees");
						System.exit(0);
					default:
						System.out.println("That's not a weekday!");
						
				}					
				
			}
			
		}
	
	}

}
