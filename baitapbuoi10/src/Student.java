public class Student {
    String name;
    int age;
    double aScore;
    double bScore;
    double cScore;

    public Student(String name, int age, double aScore, double bScore, double cScore){
        this.age = age;
        this.name = name;
        this.aScore = aScore;
        this.bScore = bScore;
        this.cScore = cScore;
    }

    public double calAvgScore(){
        double sum = aScore + bScore + cScore;
        double avgScore = (double)sum / 3;
        return avgScore;
    }

    public void printStudent(){
        System.out.println("--THÔNG TIN HỌC SINH--");
        System.out.println("Tên học sinh: " + name);
        System.out.println("Tuổi học sinh: " + age);
        System.out.println("Điểm trung bình của học sinh: " + calAvgScore());
    }

}
