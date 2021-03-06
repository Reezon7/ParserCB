package com.opencode.ParserCB.repositories;

import com.opencode.ParserCB.entities.cbrf.ParticipantInfo;
import com.opencode.ParserCB.entities.cbrf_reference.RegulationAccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantInfoRepo extends JpaRepository<ParticipantInfo, Integer> {
}