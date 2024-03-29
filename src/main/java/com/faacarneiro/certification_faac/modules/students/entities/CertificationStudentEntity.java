package com.faacarneiro.certification_faac.modules.students.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ceritications")
public class CertificationStudentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 10)
    private int grade;
    
    @Column(length = 100)
    private String technology;

    @JoinColumn(name = "student_id")
    private UUID studentID;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;

    // List<AnswersCentificationsEntity> answersCentificationsEntities;
}
