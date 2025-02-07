package com.EduradoMeloDeOliveira.service_tasks.domain.service;

import com.EduradoMeloDeOliveira.service_tasks.domain.dto.NotificationRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-notifications")
public interface NotificationService {

    @PostMapping("/notifications")
    void sendNotification(@RequestBody NotificationRequestDTO notificationRequestDTO);
}
