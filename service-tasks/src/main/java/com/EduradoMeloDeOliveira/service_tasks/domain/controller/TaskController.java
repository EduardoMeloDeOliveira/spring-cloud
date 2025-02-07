package com.EduradoMeloDeOliveira.service_tasks.domain.controller;

import com.EduradoMeloDeOliveira.service_tasks.domain.dto.TaksRequestDTO;
import com.EduradoMeloDeOliveira.service_tasks.domain.dto.TaskResponseDTO;
import com.EduradoMeloDeOliveira.service_tasks.domain.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;


    @PostMapping
    public ResponseEntity<TaskResponseDTO> regiter(@RequestBody @Valid TaksRequestDTO requestDTO){
        return ResponseEntity.ok(taskService.save(requestDTO));
    }
}
