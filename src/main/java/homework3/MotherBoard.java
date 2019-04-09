package homework3;

public class MotherBoard {
    private String manufacturer;
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String manufacturer, String model, int ramSlots, int cardSlots, String bios) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
    public void loadProgram(String programName){
        System.out.println(programName + "is now loading");
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }
}
