public class Lavadora extends Electrodomestico
{
    private static final double BURDEN_DEF = 5;
    private static double burden;
    
    public Lavadora(){
        this(priceDef, colorDef, energyDef, weightDef, BURDEN_DEF);
    }
    public Lavadora(double price, double weigth){
        this(price, colorDef, energyDef, weigth, BURDEN_DEF);
    }
    public Lavadora(double price, String color, char energyConsumption, double weight, double burden){
        super(price, color, energyConsumption, weight);
        this.burden = burden;
    }
    
    public double getBurden(){
        return burden;
    }
    public double finalPrice(){
        if(burden > 30){
            price += 50;
        }
        return price;
    }
    
}
