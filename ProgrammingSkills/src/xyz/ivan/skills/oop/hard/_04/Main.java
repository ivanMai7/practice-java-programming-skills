package xyz.ivan.skills.oop.hard._04;

import java.util.PriorityQueue;

// Task scheduling system
// Create a Task class with task name (name), priority (priority), and execution method execute().
// Create a Scheduler class with:
// Task queue (sorted by priority)
// Add task add_task(task)
// Execute the highest priority task run_next_task()
// The task queue needs to dynamically maintain order (can use heap or priority queue).

public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Task task1 = new Task("Task 1", 2);
        Task task2 = new Task("Task 2", 1);
        Task task3 = new Task("Task 3", 3);

        scheduler.add_task(task1);
        scheduler.add_task(task2);
        scheduler.add_task(task3);

        scheduler.run_next_task(); // Should execute Task 3
        scheduler.run_next_task(); // Should execute Task 1
        scheduler.run_next_task(); // Should execute Task 2
    }
}

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void execute() {
        System.out.println("Executing task: " + name);
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.getPriority(), this.priority);
    }
}

class Scheduler {
    private PriorityQueue<Task> taskQueue;

    public Scheduler() {
        taskQueue = new PriorityQueue<>();
    }

    public void add_task(Task task) {
        taskQueue.add(task);
    }

    public void run_next_task() {
        if (!taskQueue.isEmpty()) {
            Task nextTask = taskQueue.poll();
            nextTask.execute();
        } else {
            System.out.println("No tasks to run.");
        }
    }
}
