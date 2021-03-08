package io.metersphere.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class FileMetadata implements Serializable {
    private String id;

    private String name;

    private String type;

    private Long createTime;

    private Long updateTime;

    private Long size;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}