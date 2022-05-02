package com.daemontech.sgct.repository;

import com.daemontech.sgct.entity.Peso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesoRepository extends JpaRepository<Peso, Integer> {

}