package com.example.jpaspringboot.Repository;

import com.example.jpaspringboot.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    List<StudentEntity> findByName(String name);

}
