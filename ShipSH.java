//Sophia Hostetler
//U27264415
//Ship

import java.time.Year;

public class ShipSH {
   // Declaring variables
   private String name;
   private int built_year;

   // Parameterized constructor
   public ShipSH(String name, int built_year) {
       this.name = name;
       this.built_year = built_year;

   }

   // Setters and Getters.
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getBuilt_year() {
       return built_year;
   }

   public void setBuilt_year(int built_year) {
       this.built_year = built_year;
   }

   // toString() method which displays the contents of the object inside it
   @Override
   public String toString() {
      
       System.out.println("Name: "+name);
       System.out.println("Year built: "+built_year);
       return "";
   }
}