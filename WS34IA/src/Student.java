
public class Student {
    
    private String code, name, age, gender, department, favorite;

    public Student() {
        code = name = age = gender = department = favorite = "";
    }

    public Student(String code, String name, String age, String gender, String department, String favorite) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.favorite = favorite;
    }

    public Object [] toDataRow() {
        return new Object [] {
            code, name, age, gender, department, favorite
        };
    }
    
    
}
