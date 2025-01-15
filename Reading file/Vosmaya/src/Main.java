import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studentfile studentfile = new Studentfile("./src/students.csv");
        List<Student> students = studentfile.getData();

        Gradefile gradefile = new Gradefile("./src/grades.csv");
        List<Grade> grades = gradefile.getData();


        for (Student student : students) {
            System.out.println("Студент: " + student);
            System.out.print("Оценки: [");
            boolean first = true;
            for (Grade grade : grades) {
                if (grade.getId().equals(student.getId())) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(grade.getGrade());
                    first = false;
                }
            }
            System.out.println("]");
        }


        System.out.println("\nСредние оценки:");
        for (Student student : students) {
            int sum = 0;
            int count = 0;
            for (Grade grade : grades) {
                if (grade.getId().equals(student.getId())) {
                    sum += grade.getGrade();
                    count++;
                }
            }
            if (count > 0) {
                double srednee = (double) sum / count;
                System.out.println(student + " Средняя оценка: " + srednee);
            }
        }

        double min = 4.3;
        double max = 4.7;
        System.out.println("Студенты с успеваемостью в диапазоне от " + min + " до " + max + ":");
        for (Student student : students) {
            int sum = 0;
            int count = 0;
            for (Grade grade : grades) {
                if (grade.getId().equals(student.getId())) {
                    sum += grade.getGrade();
                    count++;
                }
            }
            if (count > 0) {
                double srednee = (double) sum / count;
                if (srednee >= min && srednee <= max) {
                    System.out.println(student + " Средняя оценка: " + srednee);
                }
            }
        }
    }
}
