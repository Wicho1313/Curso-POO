import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car{
    Map<String, Map<String, Integer>> typeCarrAccepted;
    ArrayList <String> seatMaterial;

    public  UberBlack(String license, Account driver, Map<String, Map<String, Integer>> typeCarrAccepted, ArrayList <String> seatMaterial) {
        super(license, driver);

        this.typeCarrAccepted = typeCarrAccepted;
        this.seatMaterial = seatMaterial;
    }
}
