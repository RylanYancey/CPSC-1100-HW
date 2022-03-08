import java.util.ArrayList;

/**
 *  Author: CGW512 - Rylan Yancey
 *  Date: 3/8/2022
 */

/**
 *  Manages appointments. 
 *  Contains all appointments, stored in an ArrayList.
 *  Used for creating new appointments, removing appointments, and displaying all appointments. 
 */
public class Calendar {
    
    // - Array List for storing all of the appointments we create. 
    private ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    /**
     * Adds an Appointment to the internal appointments list. 
     * @param appt -> The 'Appointment' you are wanting to add to the list.
     */
    public void add(Appointment appt) {
        appointments.add(appt);
    }

    /**
     * Removes an appointment from the list that cooresponds to a specific date.
     * @param year -> The year of the appointment
     * @param month -> The Month of the appointment
     * @param day -> The day of the appointment
     */
    public void remove(int year, int month, int day) {
        int i = 0;
        while (i < appointments.size()) {
            if (appointments.get(i).occursOn(year, month, day)) appointments.remove(i); 
            else i++;
        }
    }

    /**
     * Converts every Appointment in the list into a single string. 
     * @return String -> A string containing information about ALL of the appointments in the list.
     */
    public String toString() {
        String result = "";
        for (Appointment appt : appointments) {
            result += appt.toString() + "\n";
        }
        return result;
    }

}
