package com.srgplv.persistance;

import com.srgplv.entity.UploadEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadRepository extends CrudRepository<UploadEntity, String> {
}
