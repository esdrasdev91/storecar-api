package com.webcar.storecar.service;

import com.webcar.storecar.dto.OwnerPostDTO;
import com.webcar.storecar.entity.OwnerPostEntity;
import com.webcar.storecar.repository.OwnerPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService{

    @Autowired
    private OwnerPostRepository ownerPostRepository;

    @Override
    public void createOwnerPost(OwnerPostDTO ownerPostDTO) {

        OwnerPostEntity ownerPost = new OwnerPostEntity();
        ownerPost.setName(ownerPostDTO.getName());
        ownerPost.setType(ownerPostDTO.getType());
        ownerPost.setContactNumber(ownerPostDTO.getContactNumber());

        ownerPostRepository.save(ownerPost);
    }
}
