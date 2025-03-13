package com.example.jpaspringboot.Controller;

import com.example.jpaspringboot.Entity.StudentEntity;
import com.example.jpaspringboot.Repository.StudentRepository;
import com.example.jpaspringboot.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    public StudentService studentService;

    @PostMapping("/add")
    public StudentEntity addStudent (StudentEntity studentEntity){
        return studentService.addStudent(studentEntity);
    }

    @GetMapping("/find-all")
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/find-name")
    public List<StudentEntity> getStudentsByName(@RequestParam String name){
        return studentService.getStudentsByName(name);
    }

    @DeleteMapping("/delete-id/{id}")
    public String deleteStudentById(@PathVariable int id){
        boolean isDeleted = studentService.deleteStudentById(id);
        if(isDeleted){
            return "Xoa sinh vien thanh cong";
        } else {
            return "Xoa sinh vien khong thanh cong";
        }
    }
}
