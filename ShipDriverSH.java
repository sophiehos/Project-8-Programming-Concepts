//Sophia Hostetler
//U27264415
//Ship Driver

public class ShipDriverSH {

   public static void main(String[] args) {

       ShipSH ship=new ShipSH("Lollipop",1934);
      
       CruiseShipSH cs=new CruiseShipSH("Harmony of the Seas",2015,6780);
       CargoShipSH cargoShip=new CargoShipSH("Osaka Express",2007,103800);
      
       System.out.println("Here is the Ship Object's Info :");
       System.out.println(ship);
       System.out.println("Here is the CuiseShip Object's Info :");
       System.out.println(cs);
       System.out.println("Here is the CargoShip Object's Info :");
       System.out.println(cargoShip);
      
      

   }

}