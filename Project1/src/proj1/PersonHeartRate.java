package proj1;

import static java.lang.Math.round;

public class PersonHeartRate {
    private String firstName;
    private String lastName;
    private final DateOfBirth dateOfBirth;
    private int age;
    private int maxHeartRate;
    private double heartRateRangeMin;
    private double heartRateRangeMax;

    PersonHeartRate(String firstName, String lastName, DateOfBirth dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        calculateAge();
        calculateMaxHeartRate();
        calculateHeartRateRange();
    }

    private void calculateAge(){
        this.age = dateOfBirth.calculateAge();
    }

    private void calculateMaxHeartRate(){
        maxHeartRate = 220 - age;
    }

    private void calculateHeartRateRange(){
        // calculate heart rate range values and round to nearest int
        heartRateRangeMin = round(maxHeartRate * 0.5);
        heartRateRangeMax = round(maxHeartRate * 0.85);
    }

    public String printData(){
        return firstName + ", " + lastName + "\n" +
                "Max Heart Rate: " + maxHeartRate + "\n" +
                "Target Heart Rate: " + heartRateRangeMin + " - " + heartRateRangeMax;
    }
}
