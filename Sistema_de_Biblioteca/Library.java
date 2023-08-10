public class Library
{
    private User[] listOfUsers;
    private static int indexBooks = 1;
    private Book[] listOfBooks;
    
    public void addBook(Book book) {
        if(indexBooks == 1){
            listOfBooks = new Book[indexBooks];
            listOfBooks[indexBooks - 1] = book;
            indexBooks++;
        }else{
            Book[] listAux = (Book[]) listOfBooks.clone();
            listOfBooks = new Book[indexBooks];
            for(int i = 0; i < listAux.length; i++){
                listOfBooks[i] = listAux[i];
            }
            listOfBooks[indexBooks - 1] = book;;
            indexBooks++;
        }
    }
    
    public void lendBook(Book book) {
        book.setBorrowed(true);
    }
    
    public void returnBook(Book book) {
        book.setBorrowed(false);
    }
    
    public void registerUser(User user) {
        if(indexBooks == 1){
            listOfUsers = new User[indexBooks];
            listOfUsers[indexBooks - 1] = user;
            indexBooks++;
        }else{
            User[] listAux = (User[]) listOfUsers.clone();
            listOfUsers = new User[indexBooks];
            for(int i = 0; i < listAux.length; i++){
                listOfUsers[i] = listAux[i];
            }
            listOfUsers[indexBooks - 1] = user;;
            indexBooks++;
        }
    }
    
    public void createBook(String title, String autor, String isbn, boolean lend){
        Book book = new Book(title, autor, isbn, lend);
        addBook(book);
    }
    
    public User createUser(String name, String id) {
        User user = new User(name, id);
        return user;
    }
    
    public boolean searchBook(String title){
        boolean bb = listOfBooks != null;
        if(bb){
            for(int i = 0; i < listOfBooks.length; i++){
                if(listOfBooks[i].getTitle().equals(title)){
                    bb = true;
                    break;
                }
            }
        }
        return bb;
    }
    
    public Book indexOfBook(String title){
        int i;
        for(i = 0; i < listOfBooks.length; i++){
            if(listOfBooks[i].getTitle().equals(title)){
                break;
            }
        }
        System.out.println("i: " + i);
        return listOfBooks[i];
    }
    
    public void showBooks(){
        for(Book book: listOfBooks){
            System.out.println(book);
        }
    }
}
