package com.opencode.ParserCB.repositories.handbooks;

import com.opencode.ParserCB.entities.cbrf_reference.AccRstr;
import com.opencode.ParserCB.entities.cbrf_reference.RegulationAccountType;
import com.opencode.ParserCB.entities.cbrf_reference.Srvcs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SrvcsRepo extends HandbookRepo<Srvcs> {
    @Query(value = "SELECT * FROM SRVCS i WHERE i.code = :code",
            nativeQuery = true)
    Srvcs findByCode(@Param("code") String code);
}