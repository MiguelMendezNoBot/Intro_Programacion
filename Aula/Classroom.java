import java.util.ArrayList;
import java.util.Scanner;
public class Classroom
{
    private static final int NUM_MAX = 34;
    private static Subject subject;
    private static Teacher teacher;
    private static ArrayList<Student> listStudents = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addTeacher(){
        System.out.println("Nombre del profesor: ");
        String name = sc.nextLine();
        System.out.println("Edad del profesor: ");
        int age = sc.nextInt();
        teacher = new Teacher(name, age);
    }
    public void thereClasses(){
        //if(checkStudentsPorcentage() && checkSubject() && checkTeacher()){
            System.out.println(teacher);
            for(Student s : listStudents){
                System.out.println(s);
            }
        //}else{
        //    System.out.println("No hubo clases al final");
        //}
    }
    
    public void addStudent(){
        System.out.println("Nombre del estudiante: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Edad del estudiante: ");
        int age = sc.nextInt();
        System.out.println("Nota del estudiante: ");
        int score = sc.nextInt();
        listStudents.add(new Student(name, age, score));
    }
    public boolean checkStudentsPorcentage(){
        int cont = 1;
        for(Student s : listStudents){
            if(s.getCame()){
                cont++;
            }
        }
        return (cont > listStudents.size()) ? true : false;
    }
    public boolean checkSubject(){
        return teacher.getSubject().equals(subject);
    }
    public boolean checkTeacher(){
        return teacher.getCame();
    }
}
