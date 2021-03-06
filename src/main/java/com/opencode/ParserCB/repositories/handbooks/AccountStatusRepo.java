package com.opencode.ParserCB.repositories.handbooks;

import com.opencode.ParserCB.entities.cbrf_reference.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountStatusRepo extends HandbookRepo<AccountStatus> {
    @Query(value = "SELECT * FROM ACCOUNT_STATUS i WHERE i.code = :code",
            nativeQuery = true)
    AccountStatus findByCode(@Param("code") String code);
}