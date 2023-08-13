public class Main
{
    public static void main(String args[]){
        Classroom cl = new Classroom();
        cl.addTeacher();
        //Solo se podra añadir 2 alumnos para acortar el testeo
        for(int j = 0; j < 2; j++){
            cl.addStudent();
        }
        cl.thereClasses();
    }
}
