import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    float[] marks=new float[3];
}


class Studentdata {    
    public static void main(String[] args) {
        Student bro=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Bro1 ka name :");
        bro.name=sc.nextLine();
        System.out.println("Bro2 ka rolno :");
        bro.rollNo=sc.nextInt();
        System.out.println("Marks of 3 subjects are");
        for(int i=0;i<3;i++){
            System.out.println("Subject "+(i+1)+ " : ");
            bro.marks[i]=sc.nextFloat();
        }
        float total=0;
        for(float mark:bro.marks){
                total+=mark;
        }
        System.out.println("Student Details: ");
        System.out.println("Name :"+bro.name);
        System.out.println("rollno"+bro.rollNo);
        System.out.println("Marks");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+" "+bro.marks[i]);
        }
        System.out.println("Average Marks : "+(total/3));
        
        bro=null;
        sc.close();

    }

}
