
package com.task.repository;



        import com.task.model.Document;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import javax.persistence.*;
        import javax.persistence.Entity;
        import java.util.ArrayList;
        import java.util.List;

@Entity(name = "Class")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRepository
{

    private String name;

    @ManyToOne
    private TeacherRepository teacher;

    @ManyToMany
    private List<StudentRepository> students = new ArrayList<>();

    @OneToMany
    private List<DocumentRepository> documents = new ArrayList<>();
    @Id
    private Long id;



}
