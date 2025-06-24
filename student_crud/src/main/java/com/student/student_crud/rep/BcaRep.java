package com.student.student_crud.rep;

import com.student.student_crud.entity.Bca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BcaRep extends JpaRepository<Bca,Long> {

}