package com.EduradoMeloDeOliveira.service_tasks.domain.service;

import com.EduradoMeloDeOliveira.service_tasks.domain.dto.NotificationRequestDTO;
import com.EduradoMeloDeOliveira.service_tasks.domain.dto.TaksRequestDTO;
import com.EduradoMeloDeOliveira.service_tasks.domain.dto.TaskResponseDTO;
import com.EduradoMeloDeOliveira.service_tasks.domain.entity.Task;
import com.EduradoMeloDeOliveira.service_tasks.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    private final NotificationService notificationService;

    public TaskResponseDTO save(TaksRequestDTO requestDTO) {
        Task task = new Task(requestDTO);
        return new TaskResponseDTO(taskRepository.save(task));
    }


    public void sendNotification() {
        List<Task> tasks = taskRepository.findDueDateWithDeadLine(LocalDateTime.now().plusDays(1));

        for(Task taskIndex: tasks) {
            NotificationRequestDTO notificationRequestDTO = new NotificationRequestDTO(taskIndex);
            notificationService.sendNotification(notificationRequestDTO);
            taskIndex.setIsNotified(true);
        }
    }
}
