# Appointments+, a simple appointment-tracking API, written in Java (would have preferred to write in rust but grade)

Appointments+ makes it easy to store and manipulate appointment data. By extending the `Appointment` class, you can easily create your own appointment types. Included is OneTime, Daily, and Monthly. Then, you can add your appointment to the `Calendar` class to store it with other appointments, where it can be procedurally accessed, modified, or removed. Every extension of the `Appointment` class must have a constructor that takes three ints; a year, a month, and a day. It will also need a String called Description.  It will also need to implement the `toString` method and the `occursOn` method.

# Examples

Below is an extension of the Appointment class. `Monthly` will be an appointment that occurs once a month. 

```java
/**
 * An extension of Appointment, intended to be put inside the Calendar class.
 * A "Monthly" Appointment occurs every month after the input date, on the same day of the month
 * as the input date.
 */
public class Monthly extends Appointment {

    // - Subclass constructor that calls superclass - //

    /**
     * Constructor that initializes important information about the appointment. 
     * @param year -> Year of the appointment. (Ex: 2022)
     * @param month -> Month of the appointment.
     * @param day -> Day of the appointment. 
     * @param description -> What the appointment is for. (Ex: "go see grandma")
     */
    public Monthly (int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    // - Methods inherited from abstract superclass Appointment - //

    // Locally, occursOn returns true only if the day of the month is the same, and if the date is not before the start date.
    @Override
    public boolean occursOn(int year, int month, int day) {
        if (this.day == day && (this.year >= year && this.month >= month)) { return true; } else { return false; }
    }

    @Override
    public String toString() {
        return "Monthly[" + description + " Date: " + year + "/" + month + "/" + day + "]";
    }
    
}
```

Now that we have created our extension, we can add it to calendar. 

```java
calendar.add(new Monthly(2003, 5, 20, "Visit grandma."));
```

Its as easy as that!