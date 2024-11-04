package bai2;

public class Student {
    String name;
    String studentId;
    double mathScore;
    double physicScore;
    double chemistryScore;
    double avgScore;

    public Student(String name, String studentId, double mathScore, double physicScore, double chemistryScore){
        this.name = name;
        this.studentId = studentId;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
        this.avgScore = calculateAvgScore();
    }
    public Student(){}

    public double calculateAvgScore(){
        return (mathScore + physicScore + chemistryScore) / 3;
    }

    String classifyStudent() {
        if (avgScore >= 9) {
            return "Xuất Sắc";
        } else if (avgScore >= 8) {
            return "Giỏi";
        } else if (avgScore >= 7) {
            return "Khá";
        } else if (avgScore >= 5 ) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }

    public String getName(){
        return name;
    }

    public String getStudentId(){
        return studentId;
    }

    public String toString() {
        return String.format("Tên: %s, Mã SV: %s, Điểm Toán: %.2f, Điểm Lý: %.2f, Điểm Hóa: %.2f, ĐTB: %.2f, Xếp loại: %s",
                name, studentId, mathScore, physicScore, chemistryScore, avgScore, classifyStudent());
    }
}
