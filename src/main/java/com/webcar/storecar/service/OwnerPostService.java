package com.webcar.storecar.service;

import com.webcar.storecar.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostService {

    void createOwnerPost(OwnerPostDTO ownerPostDTO);
}
