package main.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查看学生");
            System.out.println("5. 添加成绩");
            System.out.println("6. 查看成绩");
            System.out.println("7. 退出");
            System.out.print("选择操作: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 清空缓冲区

            switch (choice) {
                case 1:
                    System.out.print("输入学生学号: ");
                    String studentId = scanner.nextLine();
                    System.out.print("输入学生姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("输入学生年龄: ");
                    int age = scanner.nextInt();
                    System.out.print("输入学生性别: ");
                    String gender = scanner.next();
                    studentManager.addStudent(new Student(studentId, name, age, gender));
                    break;
                case 2:
                    System.out.print("输入学生学号删除: ");
                    studentId = scanner.nextLine();
                    studentManager.removeStudent(studentId);
                    break;
                case 3:
                    System.out.print("输入学生学号修改: ");
                    studentId = scanner.nextLine();
                    System.out.print("输入学生姓名: ");
                    name = scanner.nextLine();
                    System.out.print("输入学生年龄: ");
                    age = scanner.nextInt();
                    System.out.print("输入学生性别: ");
                    gender = scanner.next();
                    studentManager.updateStudent(new Student(studentId, name, age, gender));
                    break;
                case 4:
                    System.out.print("输入学生学号查询: ");
                    studentId = scanner.nextLine();
                    Student student = studentManager.getStudentById(studentId);
                    if (student != null) {
                        System.out.println("学号: " + student.getStudentId());
                        System.out.println("姓名: " + student.getName());
                        System.out.println("年龄: " + student.getAge());
                        System.out.println("性别: " + student.getGender());
                    } else {
                        System.out.println("学生不存在！");
                    }
                    break;
                case 5:
                    System.out.print("输入学生学号: ");
                    studentId = scanner.nextLine();
                    System.out.print("输入课程名: ");
                    String courseName = scanner.nextLine();
                    System.out.print("输入成绩: ");
                    double score = scanner.nextDouble();
                    gradeManager.addGrade(studentId, courseName, score);
                    break;
                case 6:
                    System.out.print("输入学生学号: ");
                    studentId = scanner.nextLine();
                    System.out.print("输入课程名: ");
                    courseName = scanner.nextLine();
                    Double studentScore = gradeManager.getGrade(studentId, courseName);
                    if (studentScore != null) {
                        System.out.println("成绩: " + studentScore);
                    } else {
                        System.out.println("成绩不存在！");
                    }
                    break;
                case 7:
                    System.out.println("退出系统");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效选择，请重新选择！");
            }
        }
    }
}
