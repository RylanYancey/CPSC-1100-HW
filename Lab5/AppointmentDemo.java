/**
 * Demonstration of the Calendar and Appointment classes
 */
public class AppointmentDemo {
	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		//create some appointments and add them to our calendar
		//note the method calls here imply that
		//your Appointment class will need to have a 4 argument constructor
		//that accepts year, month, day, and description
		//the first call is year:2000, month: 8, day: 13
		calendar.add(new Daily(2000, 8, 13, "Brush your teeth."));
		calendar.add(new Monthly(2003, 5, 20, "Visit grandma."));
		calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));
		calendar.add(new Onetime(2004, 10, 31, "Trick or Treat."));
		calendar.add(new Monthly(2004, 11, 2, "Dentist appointment."));
		calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));

		//note here we can simply use + calendar because we have
		//implemented the toString() method
		System.out.println("Before removal of appointment " + "\n" + calendar.toString());
		calendar.remove(2004, 11, 2);
		//note that the daily appointment is removed because it occurs on
		//11/2/2004 (as well as many other days).  
		System.out.println("After removal of 11/2/2004 " + "\n" + calendar.toString());
		
	}
}
