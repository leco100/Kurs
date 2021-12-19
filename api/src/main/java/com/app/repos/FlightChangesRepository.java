package com.app.repos;

import com.app.entity.FlightChanges;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FlightChangesRepository extends JpaRepository<FlightChanges, Long>,
        JpaSpecificationExecutor<FlightChanges>
{

}
