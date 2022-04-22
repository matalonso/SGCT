package com.daemontech.sgct.repository;

import com.daemontech.sgct.entity.Ternera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TerneraRepository extends JpaRepository<Ternera, Integer> {

}
