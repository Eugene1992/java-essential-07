package HwOOP1;

/**
 * Created by Roma on 07.09.2016.
 */
public class basisHw {
    public static void main(String[] args) {
        Hw students1 = new Hw();
        students1.name = "Seriy";
        students1.students = true;
        students1.eges = 19;
        students1.mark = 3.9;

        Hw students2 = new Hw();
        students1.name = "Artem";
        students1.students = true;
        students1.eges = 19;
        students1.mark = 3.6;

        Hw students3 = new Hw();
        students1.name = "Andrey";
        students1.students = false;
        students1.eges = 19;
        students1.mark = 4.1;

        Hw students4 = new Hw();
        students1.name = "Roma";
        students1.students = true;
        students1.eges = 19;
        students1.mark = 5.0;

        Hw[] student = {
                students1,
                students2,
                students3,
                students4
        };

    }

    static Hw Get(Hw[] student) {
        Hw result = student[0];

        return result;
    }
}

