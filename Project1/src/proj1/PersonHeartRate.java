package proj1;

import java.time.LocalDate;
import java.time.Period;

public class PersonHeartRate {
    private String firstName;
    private String lastName;
    private final DateOfBirth dateOfBirth;
    private int age;
    private int maxHeartRate;
    private double heartRateRangeMin;
    private double heartRateRangeMax;

    public PersonHeartRate(String firstName, String lastName, DateOfBirth dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        calculateMaxHeartRate();
        calculateAge();
        calculateHeartRateRange();
    }

    private void calculateAge(){
        this.age = dateOfBirth.calculateAge();
    }

    private void calculateMaxHeartRate(){
        maxHeartRate = 220 - age;
    }

    private String calculateHeartRateRange(){
        heartRateRangeMin = maxHeartRate * 0.5;
        heartRateRangeMax = maxHeartRate * 0.85;
        return "Target heart rate: " + heartRateRangeMin + " - " + heartRateRangeMax;
    }



}
