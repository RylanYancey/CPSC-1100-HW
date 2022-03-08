
/**
 * An extension of Appointment, intended to be put inside the Calendar class.
 * A "OneTime" class object specifies an appointment that only occurs one time.
 */
public class Onetime extends Appointment {

    // - Subclass constructor that calls superclass - //

    /**
     * Constructor that initializes important information about the appointment. 
     * @param year -> Year of the appointment. (Ex: 2022)
     * @param month -> Month of the appointment.
     * @param day -> Day of the appointment. 
     * @param description -> What the appointment is for. (Ex: "go see grandma")
     */
    public Onetime (int year, int month, int day, String description) {
        super(year, month, day, description);
    }


    // - Methods inherited from abstract superclass Appointment - //

    // Locally, the occursOn method returns true if the  input date 
    //is exactly the same as the date of this object.
    @Override
    public boolean occursOn(int year, int month, int day) {
        if (this.year == year && this.month == month && this.day == day) { return true; } else { return false; }
    }

    @Override
    public String toString() {
        return "Onetime[" + description + " Date: " + year + "/" + month + "/" + day + "]";
    }
    
}
