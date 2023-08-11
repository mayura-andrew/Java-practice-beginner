class ElectronicDevice {
    private int deviceIDNo;
    private String brand;
    private double price;

    public void setDeviceDetails(int deviceIDNo, String brand, double price) {
        this.deviceIDNo = deviceIDNo;
        this.brand = brand;
        this.price = price;
    }

    public void printDeviceDetails() {
        System.out.println("Device ID: " + deviceIDNo);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}

class Headphone extends ElectronicDevice {
    boolean noiseCancellationAvailable;
    boolean wirelessCapabilityAvailable;

    public void setDeviceDetails(int deviceIDNo, String brand, double price,
                                 boolean noiseCancellationAvailable,
                                 boolean wirelessCapabilityAvailable) {
        super.setDeviceDetails(deviceIDNo, brand, price);
        this.noiseCancellationAvailable = noiseCancellationAvailable;
        this.wirelessCapabilityAvailable = wirelessCapabilityAvailable;
    }

    public void printDeviceDetails() {
        super.printDeviceDetails();
        System.out.println("Noise Cancellation: " + noiseCancellationAvailable);
        System.out.println("Wireless Capability: " + wirelessCapabilityAvailable);
    }
}

class Camera extends ElectronicDevice {
    int resolutionInPixels;
    boolean isLensesChangeable;

    public void setDeviceDetails(int deviceIDNo, String brand, double price,
                                 int resolutionInPixels,
                                 boolean isLensesChangeable) {
        super.setDeviceDetails(deviceIDNo, brand, price);
        this.resolutionInPixels = resolutionInPixels;
        this.isLensesChangeable = isLensesChangeable;
    }

    public void printDeviceDetails() {
        super.printDeviceDetails();
        System.out.println("Resolution: " + resolutionInPixels + " pixels");
        System.out.println("Lenses Changeable: " + isLensesChangeable);
    }
}

public class Main {
    public static void main(String[] args) {
        Headphone headphone = new Headphone();
        Camera camera = new Camera();

        headphone.setDeviceDetails(123, "Sony", 149.99, true, true);
        camera.setDeviceDetails(456, "Canon", 599.99, 24_000_000, true);

        System.out.println("Headphone Details:");
        headphone.printDeviceDetails();

        System.out.println("\nCamera Details:");
        camera.printDeviceDetails();
    }
}

