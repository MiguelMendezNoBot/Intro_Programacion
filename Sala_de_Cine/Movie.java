public class Movie
{
    private String title;
    private int duration;
    private int minimunAge;
    private String director;

    public Movie (String title, int duration, int minimunAge, String director){
        this.title = title;
        this.duration = duration;
        this.minimunAge = minimunAge;
        this.director = director;
    }

    public int getMinimunAge(){
        return minimunAge;
    }

    @Override
    public String toString(){
        return "Pelicula{Titulo:" + title + ", Duracion(min):" + duration + ", Edad minima:" + minimunAge + ", Director:" + director + "}";
    }
}
