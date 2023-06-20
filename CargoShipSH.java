//Sophia Hostetler
//U27264415
//Cargo Ship
public class CargoShipSH extends ShipSH {
  
//Declaring variables
private int capacity_tonnage;
  
//Parameterized constructor
public CargoShipSH(String name, int built_year,int capacity) {
super(name, built_year);
this.capacity_tonnage=capacity;
  
}
  
//Setters and Getters.
public int getCapacity_tonnage() {
return capacity_tonnage;
}
public void setCapacity_tonnage(int capacity_tonnage) {
this.capacity_tonnage = capacity_tonnage;
}
  
//toString() method which displays the contents of the object inside it
@Override
public String toString() {
super.toString();
System.out.println("Maximum tons: "+capacity_tonnage);
return "";
}
  
}