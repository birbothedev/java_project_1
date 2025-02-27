package proj1;

import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateDemo {
    // make variables static to share across all instances
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<PersonHeartRate> heartRateList = new ArrayList<>();

    public static void main(String[] args) {
        gatherInformation();

    }

    public static void gatherInformation(){
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        // custom delimiter to get all date of birth values from one line
        scanner.useDelimiter( "/");
        System.out.println("Enter your Date of Birth (i.e. March/12/1972");
        DateOfBirth.Month month = DateOfBirth.Month.valueOf(scanner.next().toUpperCase());
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        // move onto next line to wait for new input and reset delimiter back to using whitespace
        scanner.nextLine();
        scanner.useDelimiter("\\s+");

        DateOfBirth dob = new DateOfBirth(year, month, day);
        // add person to the list
        heartRateList.add(new PersonHeartRate(firstName, lastName, dob));

        System.out.println("Would you like to add another person? Y/N");
        String answer = scanner.nextLine();
    }

}