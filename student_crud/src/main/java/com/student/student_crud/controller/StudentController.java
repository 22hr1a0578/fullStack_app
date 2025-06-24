package com.student.student_crud.controller;

import com.student.student_crud.entity.Bca;
import com.student.student_crud.service.BcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class StudentController {
    @Autowired
    private BcaService bcaService;
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome" ;
    }
    @GetMapping("/home/{name}")        //path variable
    public String we(@PathVariable String name){
        return "hi "+name;
    }
    @GetMapping("/view")
    public List<Bca> view(){
        return bcaService.getAllStu();

    }
    @PostMapping("/save")
    public String s_bca(@RequestBody Bca bca){
        return bcaService.save_bca(bca);
    }
    @DeleteMapping("/del/{id}")
    public String del_stu(@PathVariable long id){
        return bcaService.del_stu(id);
    }
    @PutMapping("/edit/{id}")
    public Bca edit_bca(@PathVariable Long id, @RequestBody Bca b){
        return bcaService.edit_stu(id,b);
    }

}