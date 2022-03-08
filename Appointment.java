
/**
 * NOTE: I chose to use 'protected' instead of accessor methods because they accomplish the same goal. Data safety right?
 */

/**
 * Appointment Superclass for every appointment type. Anything inheriting from Appointment
 * can be put into the Calendar class. 
 */
public abstract class Appointment {
    
    // - Important information about the Appointment - //
    
    protected int year;
    protected int month;
    protected int day;
    protected String description;

    // - Superclass Constructor to initialize information - //
    
    public Appointment (int year, int month, int day, String description) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
    }

    // - Abstract methods to insure all inheriting objects have these methods - //

    /**
     * @param year -> The year of the appointment
     * @param month -> The month of the appointment
     * @param day -> The day of the appointment
     * @return True if the Appointment occurs or will occur on the specified date. 
     */
    public abstract boolean occursOn(int year, int month, int day);
}
