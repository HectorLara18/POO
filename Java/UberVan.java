import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("El minmo de pasajeros es 6!");
        }
    }

    @Override
    public Integer getPassenger() {
        return passenger;
    }

    void printPassenger() {
        System.out.println("Passengers: " + passenger);
    }
}