public class Grade {
    private String studentId;   // 学号
    private String courseName;  // 课程名
    private double score;       // 成绩

    // 构造函数
    public Grade(String studentId, String courseName, double score) {
        this.studentId = studentId;
        this.courseName = courseName;
        this.score = score;
    }

    // Getters 和 Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
