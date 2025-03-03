package main.java;
public class Student {
    private String studentId;  // 学号
    private String name;       // 姓名
    private int age;           // 年龄
    private String gender;     // 性别

    // 构造函数
    public Student(String studentId, String name, int age, String gender) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters 和 Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
