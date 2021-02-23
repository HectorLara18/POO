import java.security.UnrecoverableEntryException;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.printDataCar();

        Car carro = new Car("HGF-4567", new Account("Hector Lara", "HL1234"));
        carro.printDataCar();

        UberPool Carro2 = new UberPool("HLS1234", new Account("Hector Lara", "HL1234"), "Honda", "City");
        Carro2.printDataCar();
        Carro2.printBrand();

        UberX myUber = new UberX("KFC-1812", new Account("Johnny", "JKG 2345" ), "Honda", "City");
        myUber.setPassenger(4);
        myUber.printDataCar();

        User Hector = new User("Hector Lara", "LASH181292");
        Hector.printName();

        UberVan myVan = new UberVan("HJG-1357", new Account("Johnny", "JKG 2345" ));
        myVan.setPassenger(6);
        myVan.printPassenger();;
    }
}