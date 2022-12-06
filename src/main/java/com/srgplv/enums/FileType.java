package com.srgplv.enums;

public enum FileType {
    ZIP(201),
    XML(210);

    private final Integer fileType;

    FileType(int fileType) {
        this.fileType = fileType;
    }

    public Integer getFileType() {
        return fileType;
    }
}
