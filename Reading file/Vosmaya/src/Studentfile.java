import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Studentfile {
    private List<Student> studentList;

    public List<Student> getData() {
        return studentList;
    }

    public Studentfile(String filePath) {
        List<String> data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.studentList = mapStudents(data);
    }

    private List<Student> mapStudents(List<String> lines) {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            students.add(new Student(line[1], line[2], line[0]));
        }
        return students;
    }
}