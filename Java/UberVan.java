import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarrAccepted;
    ArrayList <String> seatMaterial;

    public  UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarrAccepted, ArrayList <String> seatMaterial) {
        super(license, driver);

        this.typeCarrAccepted = typeCarrAccepted;
        this.seatMaterial = seatMaterial;
    }

    public UberVan(String license, Account driver, String email, String password) {
        super(license, driver);
    }

    @Override
    public void setPassengers(Integer passenger) {
        // TODO Auto-generated method stub
        super.setPassengers(passenger);
        if (passenger == 6 ) {
            System.out.println("6 passengers on UberVan");
        } else {
            System.out.println("You must carry 6 passengers only");
        }
    }
}
