package com.srgplv.service;

import com.srgplv.enums.FileType;
import com.srgplv.entity.UploadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.UUID;

@Service
public class Services {
    private DBService dbService;

    @Autowired
    Services(DBService dbService) {
        this.dbService = dbService;
    }

    public void handleUpload() {
        UploadEntity uploadEntity = new UploadEntity();
        uploadEntity.setId(UUID.randomUUID().toString());
        uploadEntity.setType(FileType.XML);
        uploadEntity.setCreateDate(new Timestamp(System.currentTimeMillis()));
        uploadEntity.setFilePath("path");
        dbService.saveDownloadEntityToDataBase(uploadEntity);
    }

}