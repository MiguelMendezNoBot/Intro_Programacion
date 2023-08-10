public class Electrodomestico
{
    protected static final double priceDef = 100;
    protected static final String colorDef = "Blanco";
    protected static final char energyDef = 'F';
    protected static final double weightDef = 5;
    protected double price;
    protected String color;
    protected char energyConsumption;
    protected double weight;
    
    public Electrodomestico(){
        this(priceDef, colorDef, energyDef, weightDef);
    }
    public Electrodomestico(double price, double weight){
        this(price, colorDef, energyDef, weight);
    }
    public Electrodomestico(double price, String color, char energyConsumption, double weight){
        this.price = price;
        checkColor(color);
        checkEnergy(energyConsumption);
        this.weight = weight;
    }
    
    private void checkEnergy(char letter){
        char[] arrayOfChars = {'A','B','C','D','E','F'};
        energyConsumption = energyDef;
        for(int i = 0; i < arrayOfChars.length; i++){
            if(arrayOfChars[i] == letter){
                energyConsumption = letter;
                break;
            }
        }
    }
    private void checkColor(String color){
        String[] arrayOfColors = {"blanco","negro","rojo","azul","gris"};
        this.color = colorDef;
        for(int i = 0; i < arrayOfColors.length; i++){
            if(arrayOfColors[i] == color.toLowerCase()){
                this.color = color; 
                break;
            }
        }
    }
    public double finalPrice(){
        double plus = 0;
        switch(energyConsumption){
            case 'A':{plus += 100;
                    break;}
            case 'B':{plus += 80;
                    break;}
            case 'C':{plus += 60;
                    break;}
            case 'D':{plus += 50;
                    break;}
            case 'E':{plus += 30;
                    break;}
            case 'F':{plus += 10;
                    break;}
            default:{System.out.println("An error was happen with the letter or the energy");
                    break;}
        }
        if(weight >= 80){
            plus += 100;
        }else if(weight >= 50){
            plus += 80;
        }else if(weight  >= 20){
            plus += 50;
        }else if(weight > 0){
            plus += 10;
        }
        price += plus;
        return price;
    }
}
