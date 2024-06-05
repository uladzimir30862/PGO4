import java.util.Arrays;

public class Student {
    public String fName;
    public String lName;
    public String indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String fName, String lName, String indexNumber, String email, String address, double[] grades) {
        this.fName = fName;
        this.lName = lName;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public double countAverageMark() {
        double averageMark = 0;
        if (grades.length>19) {
            throw new IllegalArgumentException("The number of marks must be less than 20! Invalid student");
        }
        else {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            averageMark = sum/grades.length;
            averageMark = Math.round(averageMark * 2) / 2.0;
        }
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
