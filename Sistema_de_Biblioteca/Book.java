public class Book
{
    private String titleBook;
    private String autor;
    private String numIsbn;
    private boolean borrowed;
    
    public Book(String titleBook, String autor, String numIsbn, boolean borrowed) {
        //System.out.println(
        this.titleBook = titleBook;
        this.autor = autor; 
        this.numIsbn = numIsbn;
        setBorrowed(borrowed);
    }
    
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public boolean getBorrowed(){
        return borrowed;
    }
    public String getTitle(){
        return titleBook;
    }

    @Override
    public String toString(){
        return "Libro{" + "Titulo=" + titleBook + ", Autor=" + autor + ", ISBN=" + numIsbn + ", Prestado=" + borrowed + "}";
    }
}
