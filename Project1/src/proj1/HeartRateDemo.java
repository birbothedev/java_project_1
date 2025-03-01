package proj1;

import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateDemo {
    // make variables static to share across all instances
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<PersonHeartRate> heartRateList = new ArrayList<>();

    public static void main(String[] args) {
        gatherInformation();

        // loop through list and print data for each person
        for (PersonHeartRate person : heartRateList){
            System.out.println(person.printData() + "\n");
        }
    }

    public static void gatherInformation(){
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        // split line based on slash to get all parts of date of birth
        System.out.println("Enter your Date of Birth (i.e. March/12/1972");
        String line = scanner.nextLine();
        String[] dobParts = line.split("/");
        DateOfBirth.Month month = DateOfBirth.Month.valueOf(dobParts[0].toUpperCase());
        int day = Integer.parseInt(dobParts[1]);
        int year = Integer.parseInt(dobParts[2]);

        // add person to the list
        DateOfBirth dob = new DateOfBirth(year, month, day);
        heartRateList.add(new PersonHeartRate(firstName, lastName, dob));

        System.out.println("Would you like to add another person? Y/N");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("y")){
            gatherInformation();
        } else {
            System.out.println("All information has been added to the record.");
        }
    }

}