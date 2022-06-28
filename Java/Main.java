class Main{
    public static void main(String[] args) {
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123", "andy@uber.com", "pass123"));
        car.setPassengers(4);
        car.printDataCar();

        Car car2 = new Car("ZXY123", new Account("Andrea Herrera", "OR456","Andrea@uber.com", "pass123"));
        car2.setPassengers(4);
        car2.printDataCar();

        UberX uberX = new UberX("FFAA123", new Account("Fernando", "GGHHS2354", "fer@uber.com", "pass123"), "Chevrolet", "Spark");
        uberX.printDataCar();

        Driver driver = new Driver("Jose", "rolas1212", "glgl@gmail.com", "ffkkoo123");
        driver.printDataDriver();

        User user = new User("Luis", "rjlogk21", "luis@gmail.com", "fftwe!");
        user.printDataUser();
    }
}