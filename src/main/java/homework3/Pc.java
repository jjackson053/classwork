package homework3;

public class Pc {
    private MotherBoard motherBoard;
    private Case theCase;
    private Monitor monitor;

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Pc(MotherBoard motherBoard, Case theCase, Monitor monitor) {
        super();
        this.motherBoard = motherBoard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    private void drawLogo(){
            monitor.drawPixel(12500, 50,"yellow");
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Java");
        System.out.println("loading specs...");
    }

    @Override
    public String toString() {
        return motherBoard + "}"+"\n"+
                  theCase+ "}" +"\n"+
                 monitor +"}"+ "\n";
    }
}
