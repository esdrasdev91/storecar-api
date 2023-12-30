package com.webcar.storecar.repository;

import com.webcar.storecar.entity.CarPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPostRepository extends JpaRepository<CarPostEntity, Long> {

}
