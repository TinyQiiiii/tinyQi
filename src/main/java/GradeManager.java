package main.java;
import java.util.HashMap;
import java.util.Map;

public class GradeManager {
    private Map<String, Map<String, Double>> studentGrades = new HashMap<>();

    // 添加成绩
    public void addGrade(String studentId, String courseName, double score) {
        studentGrades.putIfAbsent(studentId, new HashMap<>());
        studentGrades.get(studentId).put(courseName, score);
    }

    // 查看成绩
    public Double getGrade(String studentId, String courseName) {
        if (studentGrades.containsKey(studentId)) {
            return studentGrades.get(studentId).get(courseName);
        }
        return null; // 如果没有成绩，返回 null
    }

    // 修改成绩
    public void updateGrade(String studentId, String courseName, double score) {
        if (studentGrades.containsKey(studentId)) {
            studentGrades.get(studentId).put(courseName, score);
        }
    }
}
