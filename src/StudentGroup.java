public class StudentGroup {
    public String name;
    public Student[] students;

    public StudentGroup(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public boolean isInGroup(Student student) {
        for (Student i : students) {
            if (i == student) {
                return true;
            }
        }
        return false;
    }

    public Student[] addStudent(Student student) {

        Student[] studentsNew = new Student[students.length];

        if(isInGroup(student)) {
            throw new IllegalArgumentException("To many students in that group. Student can't be added");
        }
        else if (isInGroup(student)) {
            throw new IllegalArgumentException("Student is already added");
        }
        else {
            studentsNew = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                studentsNew[i] = students[i];
            }
            studentsNew[students.length] = student;
            students = studentsNew;

            return studentsNew;
        }
    }
}
