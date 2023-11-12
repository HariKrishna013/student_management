package com.example.studentManagement.Repository;

import com.example.studentManagement.Model.studentModel;
import org.springframework.data.repository.CrudRepository;

public interface studentRepository extends CrudRepository<studentModel,Integer> {
}
