package busreservation;

public class buss {
 private int busno;
 private boolean ac;
 private int capacity;//get and set methods
 buss(int no,boolean ac,int cap){
	this.busno=no;
	this.ac=ac;
	this.capacity=cap;
 }
 public int getbusno() {//accessormethod
	 return busno;
 }
 public boolean getac() {
	 return ac;
 }
 int getcapacity(){
	 return capacity;
 }
 public void setcapacity(int cap) {//mutator method 
	 capacity=cap;
 }
 public void setac(boolean val) {
	 ac=val;
 }
 public void displaybusinfo() {
	 System.out.println("Bus No "+busno+" Ac "+ac+" capacity is "+capacity);
 }
}
