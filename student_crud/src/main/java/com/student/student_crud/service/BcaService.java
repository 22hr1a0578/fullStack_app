package com.student.student_crud.service;
import com.student.student_crud.entity.Bca;
import com.student.student_crud.rep.BcaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BcaService {
    @Autowired
    BcaRep bca_rep;
    public List<Bca>getAllStu() {
        return bca_rep.findAll();}
    public String save_bca(Bca bca)
    {
        bca_rep.save(bca);
        return "data saved successfully";
    }
    public String del_stu(Long id){
        bca_rep.deleteById(id);
        return id+"data is deleted successfully";
    }
    public Bca edit_stu(long id, Bca bca){
        Bca b=bca_rep.findById(id).orElse(null);
        b.setJava(bca.getJava());
        b.setPython(bca.getPython());
        b.setName(bca.getName());
        return bca_rep.save(b);
    }
}