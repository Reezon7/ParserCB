package com.opencode.ParserCB.repositories;

import com.opencode.ParserCB.entities.cbrf_reference.Rstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RstrRepo extends JpaRepository<Rstr, Integer> {
}