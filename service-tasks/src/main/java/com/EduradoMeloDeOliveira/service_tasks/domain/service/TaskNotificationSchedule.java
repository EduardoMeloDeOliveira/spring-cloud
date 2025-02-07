package com.EduradoMeloDeOliveira.service_tasks.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskNotificationSchedule {

    private final TaskService taskService;

    @Scheduled(fixedRate = 60)
    public void checkAndNotify() {
        taskService.sendNotification();
    }
}
