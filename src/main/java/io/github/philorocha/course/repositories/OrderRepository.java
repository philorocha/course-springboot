package io.github.philorocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.philorocha.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
