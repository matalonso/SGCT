package com.daemontech.sgct.repository;

import com.daemontech.sgct.entity.Guachera;
import com.daemontech.sgct.entity.Ternera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GuacheraRepository extends JpaRepository<Guachera, Integer> {

}
