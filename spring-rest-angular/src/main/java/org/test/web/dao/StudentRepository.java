package org.test.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.web.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
