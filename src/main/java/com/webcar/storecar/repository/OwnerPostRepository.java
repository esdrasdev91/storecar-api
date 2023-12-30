package com.webcar.storecar.repository;

import com.webcar.storecar.entity.OwnerPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerPostRepository extends JpaRepository<OwnerPostEntity, Long> {

}
