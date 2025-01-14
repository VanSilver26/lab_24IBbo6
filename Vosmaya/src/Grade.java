public class Grade {
    private String id;
    private int grade;

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }
    public Grade(String id, int grade){
        this.grade = grade;
        this.id = id;
    }
    @Override
    public String toString() {
        return grade + " " + id ;
    }
}
