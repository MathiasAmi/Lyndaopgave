import java.awt.*;

public class Car {

    // Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1
    // String -> "ala" eller "Hello World"
    // Color -> fra awp library
    // boolean -> true or false

    int averageMilesPerGallon;
    String LicensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(int inputAverageMPG, String inputLicensePlate, Color inputPaintColor, boolean inputAreTailingWorking){
        this.averageMilesPerGallon = inputAverageMPG;
        this.LicensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }
}
