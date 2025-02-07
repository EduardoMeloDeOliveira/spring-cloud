package com.EduradoMeloDeOliveira.service_tasks.domain.dto;

import com.EduradoMeloDeOliveira.service_tasks.domain.entity.Task;

public record NotificationRequestDTO(String message, String email)
{
    public NotificationRequestDTO(Task task) {
        this("o prazo da sua task com o id %s está próximo de se esgotar".formatted(task.getId()), task.getEmail());
    }
}
