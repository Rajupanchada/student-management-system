package com.sms.student_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.student_management_system.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
