package com.dantes.repository;

import com.dantes.model.GrandStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrandStudentRepository extends JpaRepository<GrandStudent, Integer> {
}
