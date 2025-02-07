package com.EduradoMeloDeOliveira.service_tasks.domain.dto;

import com.EduradoMeloDeOliveira.service_tasks.domain.entity.Task;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskResponseDTO(

        UUID taskId,
        String taskTitle,
        LocalDateTime dueDate

) {
    public TaskResponseDTO(Task task) {
        this(task.getId(), task.getTitle(), task.getDueDate());
    }
}
