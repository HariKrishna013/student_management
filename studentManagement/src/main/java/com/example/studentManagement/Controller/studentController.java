package com.example.studentManagement.Controller;

import com.example.studentManagement.Model.studentModel;
import com.example.studentManagement.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class studentController {
    @Autowired
    studentService service;
    @GetMapping("/getNames")
    private List<studentModel> getAllNames(){
        return service.getAllNames();
    }
    @PostMapping("/saving")
    public String save(@RequestBody studentModel model){
        service.save(model);
        return model.getName();
    }
    @GetMapping("/getbook/{id}")
    private studentModel getbook(@PathVariable("id")int id){
        return service.getNameById(id);
    }
    @PutMapping("/update/{id}")
    private String update(@RequestBody studentModel Model){
        service.saveOrUpdate(Model);
        return Model.getAddress();
    }
}
