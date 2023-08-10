public class Ejecutable
{
    public static void Main(String [] args){
        Electrodomestico[] list = new Electrodomestico[5];
        list[0]=new Electrodomestico(200, "Verde", 'C', 60);
        list[1]=new Lavadora(150, 30);
        list[2]=new Television(500, "negro", 'E', 80, 42, false);
        list[3]=new Electrodomestico();
        list[4]=new Electrodomestico(600, "gris", 'D', 20);
        double priceTvs = 0;
        double priceWash = 0;
        double priceAll = 0;
        for(Electrodomestico el: list){
            if(el instanceof Television){
                priceTvs += el.finalPrice();
            }
            if(el instanceof Lavadora){
                priceTvs += el.finalPrice();
            }
            if(el instanceof Electrodomestico){
                priceTvs += el.finalPrice();
            }
        }
        System.out.println("Precio de las televisiones: " + priceTvs);
        System.out.println("Precio de las lavadoras: " + priceWash);
        System.out.println("Precio de los electrodomesticos: " + priceAll);
    }
}
