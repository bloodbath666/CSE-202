public class Driver {

    /*private double radius;
    private Point center;
    private String color;

    public Circle(Point center, double radius, String color) {
		this.center = center;
		this.radius = radius;
		this.color = color;
	}

    public Point getCenter() {
        return this.center;
    }

    public void print() {
    	System.out.println("Center: (" + getCenter().getX() + "," + getCenter().getY() +
    		") Radius: " + radius + " Color: "  + color);
    }

*/










    private String name;
    private int age;
    private String country;


    public Driver() {

    }
    public Driver(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()  {
        return name;
    }

    public String getCountry()  {
        return country;
    }

    public int getAge()  {
        return age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void print()  {
        //cout << name << " Age: " << age << " Country: " << country << endl;

        System.out.println(name+"Age:" + age+"country:" + country );
    }

}
