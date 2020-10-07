package io.github.philorocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.philorocha.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
