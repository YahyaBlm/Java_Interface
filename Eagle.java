public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public void ascend(int i) {
        if (this.flying) {
            this.altitude = Math.round(i);
            System.out.println( "Hawkeye flies upward, altitude:"+this.altitude+". ");
        }   
    }

    @Override
    public void glide() {
        System.out.println("glide into the air. ");

    }

    @Override
    public void land() {
        if (this.altitude>2) {
            System.out.println("Hawkeye is too high, it can't land. ");
        }else{System.out.println("Hawkeye lands on the ground. ");}
    }
}
