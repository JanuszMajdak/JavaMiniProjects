package skladowestatyczne;

public class University {
    public static void main(String[] args) {

        Student student1=new Student("John","Kedo",1232323);
        Student student2=new Student("Ken", "Pokol",564334432);
        Student student3=new Student("hjuo","gore",2399390);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Numbers of students is: "+Student.getStudentNumber());




    }
}
