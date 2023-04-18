package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
 String passengername;
 int busno;
 Date date;
 booking(){
	 Scanner sundar=new Scanner(System.in);
	 System.out.println("Enter name of passenger: ");
	 passengername=sundar.next();
	 System.out.println("Enter Bus no: "); 
	 busno=sundar.nextInt();
	 System.out.println("Enter the date  dd-mm-yyyy: ");
	 String dateInput=sundar.next();
	 SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	 try {
		date=dateFormat.parse(dateInput);
	} catch (ParseException e) {
		e.printStackTrace();
	}
 }
 public boolean isavailable(ArrayList<booking>bookings,ArrayList<buss>buses) {
	 int capacity=0;
	 boolean y=false;
	 for(buss sun:buses) {
		 if(sun.getbusno()==busno) {
			 capacity=sun.getcapacity();
			 
		 }
		 int booked=0;
		 for(booking b:bookings) {
			 if(b.busno==busno&&b.date.equals(date)) {
				booked++; 
			 }
		 }
		 if(booked<capacity) {
			 y=true;
		 }
	 }
	return y;
 }
}
