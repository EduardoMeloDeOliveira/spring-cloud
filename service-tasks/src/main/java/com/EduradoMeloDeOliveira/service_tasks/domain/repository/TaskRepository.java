package com.EduradoMeloDeOliveira.service_tasks.domain.repository;

import com.EduradoMeloDeOliveira.service_tasks.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {


    @Query("SELECT t from table_tasks t where t.dueDate <= :deadline AND t.isNotified = false ")
    List<Task> findDueDateWithDeadLine(LocalDateTime deadline);
}
