package com.srgplv.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.srgplv.persistance.UploadRepository;
import com.srgplv.entity.UploadEntity;

@Service
@Slf4j
public class DBService {
    private final UploadRepository uploadRepository;

    @Autowired
    DBService(UploadRepository uploadRepository) {
        this.uploadRepository = uploadRepository;
    }

    public void saveDownloadEntityToDataBase(UploadEntity uploadEntity) {
        try {
            uploadRepository.save(uploadEntity);
        } catch (Exception e) {
            log.error("", e);
        }
    }
}
