class Main{
    public static void main(String[] args) {
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("ZXY123", new Account("Andrea Herrera", "OR456"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}