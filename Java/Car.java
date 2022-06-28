public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Car:\n" + "License: " + license + "\nDriver: " + driver.name + "\n");
    }

    public Integer getPassengers() {
        return this.passenger; 
    }

    public void setPassengers(Integer passenger) {
        this.passenger = passenger;
        if (this.passenger == 4) {
            System.out.println("4 passengers on car");
        } else{
            System.out.println("4 passangers allowed only");
        }
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
}
