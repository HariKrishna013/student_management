package com.example.studentManagement.Service;

import com.example.studentManagement.Model.studentModel;
import com.example.studentManagement.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentService {
    @Autowired
    studentRepository repository;
    public List<studentModel> getAllNames(){
        List<studentModel> studentModels=new ArrayList<>();
        repository.findAll().forEach(studentModels::add);
        return studentModels;
    }
    public void save(studentModel model){
        repository.save(model);
    }
    public studentModel getNameById(int id) {
        return repository.findById(id).get();
    }
    public void  saveOrUpdate(studentModel Model) {

        repository.save(Model);
    }
}
