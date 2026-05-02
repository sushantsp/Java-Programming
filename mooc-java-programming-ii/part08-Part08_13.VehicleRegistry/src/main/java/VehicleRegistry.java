import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (this.vehicleRegistry.containsKey(licensePlate)) {
            return false;
        }

        this.vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
            this.vehicleRegistry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate licensePlate:this.vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<>();

        for(String owner:this.vehicleRegistry.values()) {
            if (uniqueOwners.contains(owner)) {
                continue;
            }
            uniqueOwners.add(owner);
            System.out.println(owner);
        }
    }

}
