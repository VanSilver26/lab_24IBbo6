public class Student {
    private String name;
    private String id;
    private String surname;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public Student(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + id;
    }
}

