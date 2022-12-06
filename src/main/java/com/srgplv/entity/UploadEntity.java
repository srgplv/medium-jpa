package com.srgplv.entity;

import lombok.Setter;
import com.srgplv.enums.FileType;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Setter
@Table(name = "file_upload")
public class UploadEntity {
    private String id;
    private Integer type;
    private String filePath;
    private Timestamp createDate;

    public UploadEntity(){
        System.out.println("Reference id " + this);
    }

    @Id
    @Basic
    @Column(name = "pk_id")
    public String getId() {
        return id;
    }

    @Basic
    @Column(name = "file_type")
    public Integer getType() {
        return type;
    }

    @Basic
    @Column(name = "file_path")
    public String getFilePath() {
        return filePath;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setType(FileType type) {
        this.type = type.getFileType();
    }
}
