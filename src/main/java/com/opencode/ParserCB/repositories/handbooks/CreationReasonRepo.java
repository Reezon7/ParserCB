package com.opencode.ParserCB.repositories.handbooks;

import com.opencode.ParserCB.entities.cbrf_reference.AccRstr;
import com.opencode.ParserCB.entities.cbrf_reference.CreationReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CreationReasonRepo extends HandbookRepo<CreationReason> {
    @Query(value = "SELECT * FROM CREATION_REASON i WHERE i.code = :code",
            nativeQuery = true)
    CreationReason findByCode(@Param("code") String code);
}