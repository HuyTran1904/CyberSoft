package com.example.jpaspringboot.Services;

import com.example.jpaspringboot.Entity.StudentEntity;
import com.example.jpaspringboot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public StudentEntity addStudent(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }

    public List<StudentEntity> getStudentsByName(String name){
        return studentRepository.findByName(name);
    }

    public boolean deleteStudentById(int id){
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
