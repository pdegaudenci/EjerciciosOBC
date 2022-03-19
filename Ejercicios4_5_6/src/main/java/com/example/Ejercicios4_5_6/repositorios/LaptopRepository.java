package com.example.Ejercicios4_5_6.repositorios;

import com.example.Ejercicios4_5_6.Entidad.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
