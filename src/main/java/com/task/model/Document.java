package com.task.model;
import com.task.repository.ClassRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;
@Slf4j
@Component
@Data
public class Document
{
    private Long id;
    private String name;

    public ClassRepository getClazz() {
        return Clazz;
    }

    public void setClazz(ClassRepository clazz) {
        Clazz = clazz;
    }

    private String type;
    private String url;

    private ClassRepository Clazz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
