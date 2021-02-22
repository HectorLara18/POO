class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car carro = new Car("HGF-4567", new Account("Hector Lara", "HL1234"));
        carro.passenger = 5;
        carro.printDataCar();

        UberPool Carro2 = new UberPool("HLS1234", new Account("Hector Lara", "HL1234"), "Honda", "City");
        Carro2.printDataCar();
        Carro2.printBrand();
    }
}