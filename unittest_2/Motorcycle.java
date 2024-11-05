package seminars.second.hw;

public class Motorcycle extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private final int numWheels;
    private int speed;


    public Motorcycle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 2;
        this.speed = 0;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void testDrive() {this.speed = 75;}
    public void park() {this.speed = 0;}
    public String getCompany() {return company;}
    public String getModel() {return model;}
    public int getYearRelease() {return yearRelease;}
    public int getSpeed() {return speed;}

    public void setParking(int speed) {
        if(speed == 0) {
            throw new IllegalArgumentException("Motorcycle should be stopping");
        }
    }

    @Override
    public String toString() {
        return "This motorcycle is a " + yearRelease + " " + company + " " + model;
    }
}
