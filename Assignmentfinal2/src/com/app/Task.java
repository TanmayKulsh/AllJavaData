package com.app;

import static enums.Status.PENDING;

import java.time.LocalDate;

import enums.Status;

public class Task implements Comparable<Task> {

	private int taskId;
	private Status status;
	private String taskName;
	private boolean active;
	private String description;
	private LocalDate taskDate;
	private static int countId;

	static {
		countId = 1001;
	}

	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		active = true;
		this.status = PENDING;
		taskId = countId;
		countId++;
	}

	public Task(int id) {
		// TODO Auto-generated constructor stub
		this.taskId = id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Task) {
			return this.taskId == ((Task) obj).getTaskId();
		} else
			return false;
	}

	public int getTaskId() {
		return taskId;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", status=" + status + ", taskName=" + taskName + ", active=" + active
				+ ", description=" + description + ", taskDate=" + taskDate + "]";
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	@Override
	public int compareTo(Task o) {
		return ((Integer) o.taskId).compareTo(this.taskId);
	}
}
