package baitap2;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Double> grades;

    public Student(String name, int age, List<Double> grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrades(List<Double> grades){
        this.grades = grades;
    }

    public List<Double> getGrades(){
        return grades;
    }

    public double calculate_avarage(){
        if(grades == null || grades.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }

    public String get_info(){
        return "Thông tin của sinh viên: " + getName() + ", " + getAge() + ", " + getGrades();
    }
}
