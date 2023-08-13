import java.util.Random;
public class ObjectRadom
{
    Random ra = new Random();

    public int randInt(int max, int min){
        int num = 0;
        if(max > min){
            num = ra.nextInt(max - min + 1) + min;
        }
        return num;
    }

    public String randName(){
        String[] list1 = {"Juan", "María", "Pedro", "Ana", "Luis",
                "Laura", "Carlos", "Sofía", "Levi", "Isabel"};
        String[] list2 = {"Eduardo", "Lucía", "Fernando", "Diana", "Andrés",
                "Lisa", "Gabriel", "Valentina", "Ricardo", "Patricia"};
        String[] list3 = {"Manuel", "Lorena", "Héctor", "Mikasa", "Roberto",
                "Jean", "Jorge", "Camila", "Alejandro", "Carolina"};
        String name;
        int opList = ra.nextInt(3) + 1;
        int nameList = ra.nextInt(10);
        switch (opList){
            case 1:{return list1[nameList];}
            case 2:{return list2[nameList];}
            case 3:{return list3[nameList];}
            default: {return null;}
        }
    }

    public String randMovie(){
        String[] list1 = { "Oppenheimer", "Transformers: El despertar de las bestias", "Matrix", "Forrest Gump", "El Señor de los Anillos",
                "Star Wars", "Spider-Man: a través del Spider-Verso", "Avatar", "Titanic", "Amor de gata"};
        String[] list2 = {"Guardianes de la Galaxia Vol. 3", "Toy Story", "El Rey León", "Your Name", "Shazam!",
                "Super Mario Bros La Pelicula", "Megan", "Gato con botas: el último deseo", "Barbie", "Lightyear"};
        String[] list3 = {"Volver al Futuro", "El Exorcista", "Interestelar", "Venom", "Avengers: Endgame",
                "El Tiempo Contigo", "Spider-Man: sin camino a casa", "El Gran Gatsby", "Soy Leyenda", "Los Juegos del Hambre"};
        String movie;
        int opList = ra.nextInt(3) + 1;
        int movieList = ra.nextInt(10);
        switch (opList){
            case 1:{return list1[movieList];}
            case 2:{return list2[movieList];}
            case 3:{return list3[movieList];}
            default: {return null;}
        }
    }

    public String randDirector(){
        String[] list1 = {"Steven Spielberg", "Quentin Tarantino", "Christopher Nolan", "Martin Scorsese", "James Cameron",
                "Tim Burton", "Ridley Scott", "Alfred Hitchcock", "Stanley Kubrick", "Hayao Miyazaki"};
        String[] list2 = {"Akira Kurosawa", "Hayao Miyazaki", "Takeshi Kitano", "Satoshi Kon", "Yasujiro Ozu",
                "Hirokazu Kore-eda", "Kiyoshi Kurosawa", "Naomi Kawase", "Shinichiro Watanabe", "Isao Takahata"};
        String[] list3 = {"David Fincher", "Coen Brothers", "Guillermo del Toro", "Spike Lee", "Wes Anderson",
                "David Lynch", "Stanley Kubrick", "Denis Villeneuve", "Quentin Tarantino", "Paul Thomas Anderson"};
        String director;
        int opList = ra.nextInt(3) + 1;
        int movieList = ra.nextInt(10);
        switch (opList){
            case 1:{return list1[movieList];}
            case 2:{return list2[movieList];}
            case 3:{return list3[movieList];}
            default: {return null;}
        }
    }
    
    public void test(){
        int word;
        for(int i = 0; i < 30; i++){
            word = randInt(8, 0);
            System.out.println(word);
        }
    }
}
