package edu.javacourse.student.dao;

import edu.javacourse.student.domain.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<Street, Long>
{
}