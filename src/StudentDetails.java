import java.util.Scanner;

class Student{
    int id;
    String name;

    //Constructor

    Student(int id, String name){
        this.id = id;
        this.name=name;
    }

    void show(){
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
    }
}

public class StudentDetails{
    public  static void main(String args[]){
        Student s1=new Student(1,"Dhanashekar");
        s1.show();

    }

}