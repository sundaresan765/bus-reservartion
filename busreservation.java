package busreservation;

import java.util.Scanner;
import java.util.ArrayList;
public class busdemo {
public  static void main(String args[]) {
	ArrayList<buss> buses=new ArrayList<buss>();
	ArrayList<booking>bookings=new ArrayList<booking>();
	
    
	buses.add(new buss(1,true,2));
	buses.add(new buss(2,false,50));
	buses.add(new buss(3,true,48));
	
	int useroption=1;
	Scanner sundar=new Scanner(System.in);
	for(buss b:buses) {
		b.displaybusinfo();
	}
	while(useroption==1) {
	System.out.println("Enter 1 to book and Enter 2 to exit ");
	useroption=sundar.nextInt();
	if(useroption==1) {
		booking Booking=new booking();
		if(Booking.isavailable(bookings,buses)) {
			bookings.add(Booking);
			System.out.println("your booking is confirmed ");
		}
		else {
			System.out.println("sorry! bus is full.try another bus or date. ");
		}
	}
	else {
		System.out.println("Exit.............. ");
	}
	} 
}
}
