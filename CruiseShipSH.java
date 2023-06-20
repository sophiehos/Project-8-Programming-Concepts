//Sophia Hostetler
//U27264415
//Cruise Ship
public class CruiseShipSH extends ShipSH {
  
//Declaring variables
private int capacity;
  
//Parameterized constructor
public CruiseShipSH(String name, int built_year,int capacity) {
super(name, built_year);
this.capacity=capacity;
}
  
//Setters and Getters.
public int getCapacity() {
return capacity;
}
public void setCapacity(int capacity) {
this.capacity = capacity;
}
  
//toString() method which displays the contents of the object inside it
@Override
public String toString() {
   super.toString();
   System.out.println("Maximum passengers: "+capacity);
return "";
}
  
}