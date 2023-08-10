public class Television extends Electrodomestico
{
    private double resolution;
    private boolean tdt;
    private static final double RESOLUTION_DEF = 20;
    private static final boolean TDT_DEF = false;
    
    public Television(){
        super();
        this.resolution = RESOLUTION_DEF;
        this.tdt = TDT_DEF;
    }
    public Television(double price, double weigth){
        super(price, weigth);
        this.resolution = RESOLUTION_DEF;
        this.tdt = TDT_DEF;
    }
    public Television(double price, String color, char energyConsumption, double weight, double resoltion, boolean tdt){
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }
    
    public double getResolution(){
        return resolution;
    }
    public boolean getTdt(){
        return tdt;
    }
    
    public double finalPrice(){
        int plus = 0;
        if(resolution > 40){
            plus += price * 30/100;
        }
        if(tdt){
            plus += 50;
        }
        return price += plus;
    }
}
