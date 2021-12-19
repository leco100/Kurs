package com.app.repos;

import com.app.entity.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PromosRepository  extends JpaRepository<Airplane,Integer>, JpaSpecificationExecutor<Airplane> {
}
