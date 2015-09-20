public class Car {

	/*private int x;
	private int y;

	public Point() {
		this.x=0;
		this.y=0;
	}

    public Point(int x, int y) {
    	this.x=x;
		this.y=y;
    }

    public int getX() {
    	return this.x;
    }

    public void setX(int x) {
    	this.x = x;
    }

    public int getY() {
    	return this.y;
    }

    public void setY(int y) {
    	this.y=y;
    }

    public void print() {
    	System.out.println("(" +  this.x + "," + y + ")");
    }*/










    //private:
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;


    public Car(String name, String manufacturer, Driver driver, int fuelCapacity) {
        this.name = name;
        this.driver = driver;
        this.manufacturer = manufacturer;
        this.fuelCapacity = fuelCapacity;
    }

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getName()  {
        return name;
    }

    public Driver getDriver()  {
        return driver;
    }

    public String getManufacturer()  {
        return manufacturer;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }


    public void refuel(int miles) {
        fuelCapacity = fuelCapacity+miles;
    }

    public void drive(int miles) {
        if (fuelCapacity >= miles) {
            fuelCapacity =fuelCapacity- miles;
        } else {
            System.out.println("Driving distance exceeds the car's fuel capacity!");
        }
    }

    public void print()  {
        System.out.println( name +" Manufacturer: " + manufacturer + " Driver: " + driver.getName()+ " FuelCapacity: " + fuelCapacity);
    }



}
