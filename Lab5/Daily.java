
/**
 * An extension of Appointment, intended to be put inside the Calendar class.
 * A "Daily" Appointment occurs every day after the input date.
 */
public class Daily extends Appointment {

    // - Subclass constructor that calls superclass - //

    /**
     * Constructor that initializes important information about the appointment. 
     * @param year -> Year of the appointment. (Ex: 2022)
     * @param month -> Month of the appointment.
     * @param day -> Day of the appointment. 
     * @param description -> What the appointment is for. (Ex: "go see grandma")
     */
    public Daily (int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    // - Methods inherited from abstract superclass Appointment - //

    // Locally, occursOn returns true if the date is after the start date of the appointment. 
    @Override
    public boolean occursOn(int year, int month, int day) {
        if (this.day < day && this.month <= month && this.year <= year) { return false; } else { return true; }
    }

    @Override
    public String toString() {
        return "Daily[" + description + " Date: " + year + "/" + month + "/" + day + "]";
    }
    
}
