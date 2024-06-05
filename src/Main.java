public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vova", "Kovalenok", "s30862", "s30862@pjwstk.edu.pl",
                "Warszawa", new double[]{3.0, 5.3, 4.6, 3.5});
        Student student2 = new Student("Dmitriy", "Vladykowsky", "s30863", "30863@pjwstk.edu.pl",
                "Warszawa", new double[]{2.3, 3.4, 2.9, 4.7});
        Student student3 = new Student("Aleksander", "Zakrewskiy", "s30864", "s30863@pjwstk.edu.pl",
                "Warszawa", new double[]{4.5, 5.5, 4.2, 2.8});
        Student student4 = new Student("Antonio", "Konoszonok", "s30865", "s30865@pjwstk.edu.pl",
                "Warszawa", new double[]{2.0, 1.7, 3.0, 3.3});
        Student student5 = new Student("Ewgenij", "Kremen", "s30866", "s30866@pjwstk.edu.pl",
                "Warszawa", new double[]{5.0, 5.5, 4.8, 4.6});
        StudentGroup studentGroup = new StudentGroup("group1", new Student[]{student1, student2, student3,
                student4});
        System.out.println(student1.countAverageMark());

        studentGroup.addStudent(student5);
        System.out.println(studentGroup.students.length);

        for(int i = 0; i < studentGroup.students.length; i++) {
            System.out.println(studentGroup.students[i]);
        }
    }
}