package com.task.repository;
//import javax.per


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Document")
@Data
@AllArgsConstructor
@NoArgsConstructor
    public class DocumentRepository
{

        private String name;

        private String fileUrl;

        @ManyToOne
        private ClassRepository clazz;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
