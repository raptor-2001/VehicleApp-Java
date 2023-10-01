public class Car extends Vehicle{
    private String type;
    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(String name, String type, int wheels, int doors, int gears, boolean isManual) {
        super(name);
        this.type = type;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method is called: Changed to " + currentGear + " gear");
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called: Speed -> " + newSpeed + " Direction -> " + newDirection);
    }

}

