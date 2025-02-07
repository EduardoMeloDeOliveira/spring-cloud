package com.EduradoMeloDeOliveira.service_tasks.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record TaksRequestDTO(
        @NotBlank
        String title,


        LocalDateTime dueDate,

        @Email
        String email
) {
}
