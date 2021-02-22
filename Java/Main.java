class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.printDataCar();

        Car carro = new Car();
        carro.license = "HGF-4567";
        carro.driver = "Hector Lara";
        carro.passenger = 5;
        carro.printDataCar();
    }
}