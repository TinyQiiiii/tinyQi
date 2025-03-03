package main.java;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // 添加学生
    public void addStudent(Student student) {
        students.add(student);
    }

    // 删除学生
    public void removeStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    // 修改学生信息
    public void updateStudent(Student student) {
        for (Student s : students) {
            if (s.getStudentId().equals(student.getStudentId())) {
                s.setName(student.getName());
                s.setAge(student.getAge());
                s.setGender(student.getGender());
            }
        }
    }

    // 查询学生
    public Student getStudentById(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null; // 没有找到学生
    }
}
