import java.util.Scanner;
public class MainClass
{
    Library li = new Library();
    Scanner sc = new Scanner(System.in);
    public void menu(){
        System.out.println("1. Agregar un libro a la libreria");
        System.out.println("2. Mostrar libros disponibles");
        System.out.println("3. Prestar un libro");
        System.out.println("4. Devolver Libro");
        System.out.println("5. Salir");
    }
    
    public void Main(String [] args) {
        boolean bb = true;
        do {
            System.out.println("----------Biblioteca----------");
            menu();
            int op = sc.nextInt();
            switch(op){
                case 1: {
                        option1();
                        break;
                        }
                case 2: {
                        li.showBooks();
                        break;
                        }
                case 3: {
                        option3();
                        break;
                        }
                case 4: {
                        break;
                        }
                case 5: {
                        bb = false;
                        System.out.println("Cerrando sistema");
                        break;
                        }
                default:{
                        System.out.println("Opcion invalida");
                        break;
                        }
            }
        }while(bb);
    }
    
    public void option1() {
        System.out.println("Titulo del libro: ");
        String title = sc.next();
        sc.nextLine();
        System.out.println("Autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("ISBN del libro: ");
        String isbn = sc.nextLine();
        li.createBook(title, autor, isbn, false);
    }
    
    public void option3() {
        System.out.print("Titulo del libro a prestar: ");
        String title = sc.next();
        sc.nextLine();
        do{
            if(li.searchBook(title)){
                li.lendBook(li.indexOfBook(title));
                option3_1();
                break;
            }else{
                System.out.print("EL libro no se encuentra");
            }
        }while(true);
    }
    
    public void option3_1(){
        System.out.println("--------Registro de usuario--------");
        System.out.print("Nombre del usuario: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("ID del usuario '" + name + "'");
        String id = sc.nextLine();
        li.createUser(name, id);
    }
}
