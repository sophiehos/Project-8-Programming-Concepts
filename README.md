# Project-8-Programming-Concepts
Java Exercise 8
Inheritance Exercise
For this assignment you will create several small classes to demonstrate inheritance.
You will need to perform the following steps:
1. Create a class that contains data and methods for a ship. Call this class Ship
followed by your initials for your first and last name. (for example: if your name
is Schinnel Small, the name of your class should be ShipSS.)
• The Ship class should contain the following data:
o Name of the ship
o Year the ship was built
§ Use the protected modifier for both data members
• The Ship class should contain the following methods:
o A constructor that sets the name of the ship and the year that it was
built
o A toString method to display the name and year
2. Create a second class that contains data and methods for a cruise ship. This class
will inherit data and methods from the Ship class. Call this class CruiseShip
followed by your initials for your first and last name. (for example: if your name
is Schinnel Small, the name of your class should be CruiseShipSS.)
• The CruiseShip class should contain the following (private) data:
o The number of passengers
• The CruiseShip class should contain the following methods:
o A constructor that sets the name of the ship, the year that it was built
and the number of passengers
§ Use the super reference to access the constructor from the
Ship class (to set up the name and year of the cruise ship)
§ The passenger data should be set up in the same constructor
as well.
o A toString method to display the name, the year and the number of
passengers the cruise can hold.
§ Use the super reference to access the name and year data
from the ship class in the CruiseShip’s toString method.
3. Create a third class that contains data and methods for a cargo ship. This class
will also inherit data and methods from the Ship class. Call this class CargoShip
followed by your initials for your first and last name. (for example: if your name
is Schinnel Small, the name of your class should be CargoShipSS.)
• The CargoShip class should contain the following (private) data:
o The number of tons it can hold
• The CargoShip class should contain the following methods:
o A constructor that sets the name of the ship, the year that it was built
and the number of tons
§ Use the super reference to access the constructor from the
Ship class (to set up the name and year of the cargo ship)
§ The tons data should be set up in the same constructor as
well.
o A toString method to display the name, the year and the number of
tons the cargo ship can hold.
§ Use the super reference to access the name and year data
from the ship class in the CargoShip’s toString method.
4. Create a driver program called ShipDriver followed by your initials for your first
and last name. The driver program should create and display a Ship, CruiseShip
and CargoShip object. You are allowed to hardcode values when you create each
object (so no Scanner classes or local variables are required).
Sample output is shown below:
Here is the Ship object's info:
Name: Lollipop
Year built: 1934
Here is the CruiseShip object's info:
Name: Harmony of the Seas
Year Built: 2015
Maximum passengers: 6780
Here is the CargoShip object's info:
Name: Osaka Express
Year Built: 2007
Maximum tons: 103800
