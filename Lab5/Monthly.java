
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
