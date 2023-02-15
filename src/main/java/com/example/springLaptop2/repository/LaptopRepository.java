package com.example.springLaptop2.repository;

import com.example.springLaptop2.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
