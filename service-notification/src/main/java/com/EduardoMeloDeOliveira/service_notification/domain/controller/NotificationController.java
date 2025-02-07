package com.EduardoMeloDeOliveira.service_notification.domain.controller;

import com.EduardoMeloDeOliveira.service_notification.domain.dto.NotificationRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping
    public ResponseEntity<Void>sendNotification(@RequestBody NotificationRequestDTO notificationRequestDTO){
        System.out.println(notificationRequestDTO);
        return ResponseEntity.ok().build();
    }
}
