package com.example.jpaspringboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Sửa từ int -> Long để tránh lỗi Hibernate

    private String name;
    private String email;
    private int age;

    // ✅ Constructor mặc định (bắt buộc để Hibernate hoạt động)
    public StudentEntity() {
    }

    // ✅ Constructor có tham số (tuỳ chọn)
    public StudentEntity(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // ✅ Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
