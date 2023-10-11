package student.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.result.entity.Results;

public interface StudentResultRepository extends JpaRepository<Results,Integer> {

}
