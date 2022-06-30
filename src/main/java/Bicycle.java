interface Vehicle
{
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

public class Bicycle implements Vehicle
{
   private int cadence;

   private int speed;

   private int gear;

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void changeCadence(int newValue) {
          cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear  = newValue;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void printStates()
    {
        System.out.println("Cadence : " + cadence +" Speed: " + speed + " Gear : " + gear);
    }
}

class Main
{
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setCadence(1000);
        bicycle.setSpeed(200);
        bicycle.setGear(5);

        bicycle.printStates();

        bicycle.applyBrakes(50);

        bicycle.printStates();
    }
}