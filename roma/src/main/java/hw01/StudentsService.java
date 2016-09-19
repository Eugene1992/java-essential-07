package hw01;

public class StudentsService {
    public static void main(String[] args) throws Exception {
        Student studentOne = new Student("Seriy", true, 19, 3.9);
        System.out.println(studentOne.getName());
        /*studentOne.setName("Serega");
        System.out.println(studentOne.getName());*/
        studentOne = new Student();
        studentOne.setName("Serega");
        studentOne.setDegre(true);
        studentOne.setAge(21);
        studentOne.setMark(12.0);
        System.out.println(studentOne.getName());
    }

    static Student Get(Student[] student) {
        Student result = student[0];

        return result;
    }
}

