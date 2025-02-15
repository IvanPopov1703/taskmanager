package ru.taskmanager.sevice;

import ru.taskmanager.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task createTask(Task task);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);
}
