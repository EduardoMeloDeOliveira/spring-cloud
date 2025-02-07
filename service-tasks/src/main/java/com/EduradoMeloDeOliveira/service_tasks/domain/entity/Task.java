package com.EduradoMeloDeOliveira.service_tasks.domain.entity;

import com.EduradoMeloDeOliveira.service_tasks.domain.dto.TaksRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "table_tasks")
@Table(name = "table_tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String email;
    private String title;
    private LocalDateTime dueDate;
    private Boolean isNotified;


    public Task(TaksRequestDTO taksRequestDTO) {
        this.title = taksRequestDTO.title();
        this.dueDate = taksRequestDTO.dueDate();

    }
}
