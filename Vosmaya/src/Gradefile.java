import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gradefile {
    private List<Grade> gradeList;

    public List<Grade> getData() {
        return gradeList;
    }

    public Gradefile(String filePath) {
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
        this.gradeList = mapGrades(data);
    }

    private List<Grade> mapGrades(List<String> lines) {
        List<Grade> grades = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            grades.add(new Grade(line[0], Integer.parseInt(line[1])));
        }
        return grades;
    }
}